package AAARtQuestionTest.aUsehashmap.compareObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

/**
 * 利用 Treemap 的底层使用红黑树可以对基本类型或者字符串类型的 key 比较大小然后升序排列的特性，自定义比较器实现 key 为对象类型时的排序。
 */
public class AUseTreeMapObjectRepeat {
    /**
     * 因为 Treemap 的底层使用红黑树实现的，key 的比较大小是必须的；但是当你传入的 key 不是基本类型或者字符串而是自定义的类。遍历时就会报错。
     */
    public static void main(String[] args) {
        TreeMap<Object, Integer> hashMap = new TreeMap<>();
        MapAddElement(hashMap, new Student(2, 165), 2);
        MapAddElement(hashMap, new Student(1, 178), 1);
        MapAddElement(hashMap, new Student(4, 176), 4);
        MapAddElement(hashMap, new Student(3, 185), 3);
        byEntrySetSoutKeyAndValue(hashMap);
    }

    /**
     * hashmap 的 key 相同时将 value 进行累加的方法。
     *
     * @param hashMap
     * @param j
     * @param k
     */
    public static void MapAddElement(TreeMap<Object, Integer> hashMap, Object j, Integer k) {
        if (hashMap.containsKey(j)) {
            hashMap.put(j, hashMap.get(j) + k);//map.get()方法取出对应键的值
        } else {
            hashMap.put(j, k);//map.get()方法取出对应键的值
        }
    }

    /**
     * 2、推荐，尤其是容量大时使用：通过 hashMap.entrySet 先得到 entry 对象，然后通过 get 得到 key 和 value
     *
     * @param hashMap
     */
    public static void byEntrySetSoutKeyAndValue(TreeMap<Object, Integer> hashMap) {
        for (Map.Entry<Object, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}

/**
 * 因为 Treemap 的底层使用红黑树实现的，key 的比较大小是必须的；但是当你传入的 key 不是基本类型或者字符串而是自定义的类。遍历时就会报错。
 * 正确的方式：使得添加的对象 implements Comparable<Student>接口，重写其 compareTo 方法，实现排序的功能。
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Comparable<Student> {
    private int age;
    private int high;

    @Override
    public int compareTo(Student student) {
        int num = this.age - student.getAge();
        if (num == 0) {//为0时候，两者相同
            return 0;
        } else if (num > 0) {//大于0时，传入的参数小，正序：
            return 1;
        } else {//小于0时，传入的参数大，逆序：
            return -1;
        }
    }
}