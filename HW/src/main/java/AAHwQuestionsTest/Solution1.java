package AAHwQuestionsTest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 49. ��ĸ��λ�ʷ��飺����һ���ַ������飬���㽫 ��ĸ��λ�� �����һ�𡣿��԰�����˳�򷵻ؽ���б�
 * ��ĸ��λ�� ������������Դ���ʵ���ĸ�õ���һ���µ��ʣ�����Դ�����е���ĸͨ��ǡ��ֻ��һ�Ρ�
 */
public class Solution1 {
    public static void main(String[] args) {
        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // ����ԭ������� Arrays.toString(��������)
        System.out.println(Arrays.toString(str));

        // ���� ת list
        List<String> list = Arrays.stream(str).collect(Collectors.toList());
        // ��������ʽ���
        System.out.println(Arrays.toString(list.stream().toArray()));

        // list ת ����
        Object[] arrays = list.stream().toArray();
        // ��������ʽ���
        System.out.println(Arrays.toString(arrays));

        System.out.println("=====================================");
        groupAnagramsByHashMap(str);
        System.out.println("=====================================");

//        List<List<String>> resultLists = groupAnagrams(str);
        List<List<String>> resultLists = groupAnagramsByHashMap(str);
        // list ת����,����������ʽ����� Arrays.toString(������list����.stream().toArray())
        System.out.println(Arrays.toString(resultLists.stream().toArray()));

        // list ת���鲢������size��������������Ƚ�������list����.stream().sorted()����֮���ٵ��� .collect(Collectors.toList())
        List<List<String>> sortedlistList = resultLists.stream().sorted(Comparator.comparing(List::size)).collect(Collectors.toList());
        System.out.println(Arrays.toString(sortedlistList.stream().toArray()));

        // ����Ҫ��ԭ���������ʹ�÷����� Arrays.toString(array)
        Object[] array = resultLists.stream().sorted(Comparator.comparing(List::size)).toArray();
        System.out.println(Arrays.toString(array));
    }
    /**
     * ʹ�� stream ���� collect ������ Collectors.groupingBy ����ʵ�ַ���
     * @param strs string�ַ���һά����
     * @return string�ַ�����ά����
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        // ���� str �����Ľ��;�������Ľ����grouping by�������� sql ��� group by
        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(str->{
            char[] array = str.toCharArray();
            Arrays.sort(array);
            return new String(array);
        })).values());
    }

    public static List<List<String>> groupAnagramsByHashMap(String[] strs) {
        HashMap<String,List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            // ����ֱ������Arrays.sort(��������������);
            Arrays.sort(chars);
            String string = String.valueOf(chars);
            if (hashMap.containsKey(string)) {
                List<Integer> list = new ArrayList<>();
                list = hashMap.get(string);
                list.add(i);
                hashMap.put(string,list);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                hashMap.put(string, list);
            }
        }
        // hashmap ת ����
        Object[] array = hashMap.entrySet().stream().toArray();
        System.out.println(Arrays.toString(array));

        List<List<String>> listEnd = new ArrayList<>();
        hashMap.forEach((key, val) -> {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < val.size(); i++) {
                list.add(strs[val.get(i)]);
            }
            listEnd.add(list);
        });
        System.out.println(Arrays.toString(listEnd.stream().toArray()));
        return listEnd;
    }
}
