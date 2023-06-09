package AAARtQuestionTest.aUsehashmap.compareString;

import java.util.Map;
import java.util.TreeMap;

/**
 * 利用 TreeMap 相同的 Integer 类型的 key  的 Integer 类型的 value 进行累加，并"升序"输出。
 */
public class AUseTreeMapRepeatObject {
    /**
     * Treemap 在 put 元素时会根据 key 的大小，进行自动排序。
     * 因为 Treemap 的底层使用红黑树实现的，key的比较大小是必须的；但是当你传入的 key 不是基本类型或者字符串而是自定义的类。遍历时就会报错。
     */
    public static void main(String[] args) {
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        addMap(hashMap, 1, 3);
        addMap(hashMap, 0, 1);
        addMap(hashMap, 3, 4);
        addMap(hashMap, 0, 2);
        byEntrySetSoutKeyAndValue(hashMap);
    }

    /**
     * 给 hashmap 添加元素时，执行判断：如果 key 已存在则取出 key 对应的 value 进行相加后 put；如果不存在，则直接进行 put。
     *
     * @param hashMap
     * @param j
     * @param k
     */
    public static void addMap(TreeMap<Integer, Integer> hashMap, Integer j, Integer k) {
        if (hashMap.containsKey(j)) {
            hashMap.put(j, hashMap.get(j) + k);//map.get()方法取出对应键的值
        } else {
            hashMap.put(j, k);//map.get()方法取出对应键的值
        }
    }

    /**
     * 1、循环遍历 map 集合（推荐使用），尤其是容量大时使用：通过 hashMap.entrySet 先得到 entry 对象，然后通过 get 得到 key 和 value
     *
     * @param hashMap
     */
    public static void byEntrySetSoutKeyAndValue(TreeMap<Integer, Integer> hashMap) {
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    /**
     * 2、遍历 hashMap 输出 key 和 value：通过 hashMap.keySet 先得到 key 的集合，然后获取 key 和 key 对应的 value
     * @param hashMap
     */
//    public static void byKeySetSoutKeyAndValue(TreeMap<Integer, Integer> hashMap) {
//        for (Integer key : hashMap.keySet()) {
//            System.out.println(key + " " + hashMap.get(key));//再用拿到的键的get方法取值
//        }
//    }
    /**
     * 3、通过 hashMap.values()遍历输出 hashMap 的所有 value
     * @param hashMap
     */
//    public static void byValuesSoutValue(TreeMap<Integer, Integer> hashMap) {
//        for (Integer value : hashMap.values()) {
//            System.out.println(value);
//        }
//    }
}