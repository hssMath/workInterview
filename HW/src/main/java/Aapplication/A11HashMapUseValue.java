package Aapplication;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * hashmap �� key ��ͬʱ�� value �����ۼӡ�
 *
 */
public class A11HashMapUseValue {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        addMap(hashMap, 1, 3);
        addMap(hashMap, 0, 1);
        addMap(hashMap, 3, 4);
        addMap(hashMap, 0, 2);

        soutMap(hashMap);
    }

    /**
     * hashmap �� key ��ͬʱ�� value �����ۼӵķ�����
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
     * hashmap�ı������
     * @param hashMap
     */
    public static void soutMap(TreeMap<Integer, Integer> hashMap) {
        Set<Integer> ky = hashMap.keySet();
        Iterator<Integer> lr = ky.iterator();
        while (lr.hasNext()) {
            Integer key = lr.next();
            System.out.println(key + " " + hashMap.get(key));//�����õ��ļ���get����ȡֵ
        }
    }
}
