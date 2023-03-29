package AAARtQuestionTest.aUsehashmap.compareObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

/**
 * ���� Treemap �ĵײ�ʹ�ú�������ԶԻ������ͻ����ַ������͵� key �Ƚϴ�СȻ���������е����ԣ��Զ���Ƚ���ʵ�� key Ϊ��������ʱ������
 */
public class AUseTreeMapObjectRepeat {
    /**
     * ��Ϊ Treemap �ĵײ�ʹ�ú����ʵ�ֵģ�key �ıȽϴ�С�Ǳ���ģ����ǵ��㴫��� key ���ǻ������ͻ����ַ��������Զ�����ࡣ����ʱ�ͻᱨ��
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
     * hashmap �� key ��ͬʱ�� value �����ۼӵķ�����
     *
     * @param hashMap
     * @param j
     * @param k
     */
    public static void MapAddElement(TreeMap<Object, Integer> hashMap, Object j, Integer k) {
        if (hashMap.containsKey(j)) {
            hashMap.put(j, hashMap.get(j) + k);//map.get()����ȡ����Ӧ����ֵ
        } else {
            hashMap.put(j, k);//map.get()����ȡ����Ӧ����ֵ
        }
    }

    /**
     * 2���Ƽ���������������ʱʹ�ã�ͨ�� hashMap.entrySet �ȵõ� entry ����Ȼ��ͨ�� get �õ� key �� value
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
 * ��Ϊ Treemap �ĵײ�ʹ�ú����ʵ�ֵģ�key �ıȽϴ�С�Ǳ���ģ����ǵ��㴫��� key ���ǻ������ͻ����ַ��������Զ�����ࡣ����ʱ�ͻᱨ��
 * ��ȷ�ķ�ʽ��ʹ����ӵĶ��� implements Comparable<Student>�ӿڣ���д�� compareTo ������ʵ������Ĺ��ܡ�
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
        if (num == 0) {//Ϊ0ʱ��������ͬ
            return 0;
        } else if (num > 0) {//����0ʱ������Ĳ���С������
            return 1;
        } else {//С��0ʱ������Ĳ���������
            return -1;
        }
    }
}