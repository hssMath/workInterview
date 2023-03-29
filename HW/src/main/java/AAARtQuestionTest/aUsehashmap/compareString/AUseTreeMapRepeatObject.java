package AAARtQuestionTest.aUsehashmap.compareString;

import java.util.Map;
import java.util.TreeMap;

/**
 * ���� TreeMap ��ͬ�� Integer ���͵� key  �� Integer ���͵� value �����ۼӣ���"����"�����
 */
public class AUseTreeMapRepeatObject {
    /**
     * Treemap �� put Ԫ��ʱ����� key �Ĵ�С�������Զ�����
     * ��Ϊ Treemap �ĵײ�ʹ�ú����ʵ�ֵģ�key�ıȽϴ�С�Ǳ���ģ����ǵ��㴫��� key ���ǻ������ͻ����ַ��������Զ�����ࡣ����ʱ�ͻᱨ��
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
     * �� hashmap ���Ԫ��ʱ��ִ���жϣ���� key �Ѵ�����ȡ�� key ��Ӧ�� value ������Ӻ� put����������ڣ���ֱ�ӽ��� put��
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
     * 1��ѭ������ map ���ϣ��Ƽ�ʹ�ã���������������ʱʹ�ã�ͨ�� hashMap.entrySet �ȵõ� entry ����Ȼ��ͨ�� get �õ� key �� value
     *
     * @param hashMap
     */
    public static void byEntrySetSoutKeyAndValue(TreeMap<Integer, Integer> hashMap) {
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    /**
     * 2������ hashMap ��� key �� value��ͨ�� hashMap.keySet �ȵõ� key �ļ��ϣ�Ȼ���ȡ key �� key ��Ӧ�� value
     * @param hashMap
     */
//    public static void byKeySetSoutKeyAndValue(TreeMap<Integer, Integer> hashMap) {
//        for (Integer key : hashMap.keySet()) {
//            System.out.println(key + " " + hashMap.get(key));//�����õ��ļ���get����ȡֵ
//        }
//    }
    /**
     * 3��ͨ�� hashMap.values()������� hashMap ������ value
     * @param hashMap
     */
//    public static void byValuesSoutValue(TreeMap<Integer, Integer> hashMap) {
//        for (Integer value : hashMap.values()) {
//            System.out.println(value);
//        }
//    }
}