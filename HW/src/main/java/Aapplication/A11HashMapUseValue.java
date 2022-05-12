package Aapplication;

import java.util.Map;
import java.util.TreeMap;

/**
 * hashmap �� key ��ͬʱ�� value �����ۼӡ�
 */
public class A11HashMapUseValue {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        addMap(hashMap, 1, 3);
        addMap(hashMap, 0, 1);
        addMap(hashMap, 3, 4);
        addMap(hashMap, 0, 2);

        byKeySetSoutKeyAndValue(hashMap);
        byEntrySetSoutKeyAndValue(hashMap);
        byValuesSoutValue(hashMap);
    }

    /**
     * hashmap �� key ��ͬʱ�� value �����ۼӵķ�����
     *
     * @param hashMap
     * @param j
     * @param k
     */
    public static void addMap(TreeMap<Integer, Integer> hashMap, Integer j, Integer k) {
        if (hashMap.containsKey(j)) {
            hashMap.put(j, hashMap.get(j) + k);//map.get()����ȡ����Ӧ����ֵ
        } else {
            hashMap.put(j, k);//map.get()����ȡ����Ӧ����ֵ
        }
    }

    /**
     * 1������ hashMap ��� key �� value��ͨ�� hashMap.keySet �ȵõ� key �ļ��ϣ�Ȼ���ȡ key �� key ��Ӧ�� value
     * @param hashMap
     */
    public static void byKeySetSoutKeyAndValue(TreeMap<Integer, Integer> hashMap) {
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));//�����õ��ļ���get����ȡֵ
        }
    }

    /**
     * 2���Ƽ���������������ʱʹ�ã�ͨ�� hashMap.entrySet �ȵõ� entry ����Ȼ��ͨ�� get �õ� key �� value
     * @param hashMap
     */
    public static void byEntrySetSoutKeyAndValue(TreeMap<Integer, Integer> hashMap) {
        System.out.println("ͨ��Map.entrySet����key��value");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    /**
     * 3��ͨ�� hashMap.values()������� hashMap ������ value
     * @param hashMap
     */
    public static void byValuesSoutValue(TreeMap<Integer, Integer> hashMap) {
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
    }
}