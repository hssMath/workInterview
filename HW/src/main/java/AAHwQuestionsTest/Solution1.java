package AAHwQuestionsTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 49. ��ĸ��λ�ʷ��飺����һ���ַ������飬���㽫 ��ĸ��λ�� �����һ�𡣿��԰�����˳�򷵻ؽ���б�
 * ��ĸ��λ�� ������������Դ���ʵ���ĸ�õ���һ���µ��ʣ�����Դ�����е���ĸͨ��ǡ��ֻ��һ�Ρ�
 */
public class Solution1 {
    public static void main(String[] args) {
        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // ����ԭ���������ʹ�÷����� Arrays.toString(��������)
        System.out.println(Arrays.toString(str));

        // ���� ת list
        List<String> list = Arrays.stream(str).collect(Collectors.toList());
        System.out.println(Arrays.toString(list.stream().toArray()));

        // list ת ����
        Object[] arrays = list.stream().toArray();
        System.out.println(Arrays.toString(arrays));


        List<List<String>> resultLists = groupAnagrams(str);
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
     * �����е����������������������Ѿ�ָ���������޸ģ�ֱ�ӷ��ط����涨��ֵ����
     * @param strs string�ַ���һά����
     * @return string�ַ�����ά����
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
//        return new ArrayList<>(Arrays.stream(strs)
//                .collect(Collectors.groupingBy(str -> {// ���� str �����Ľ��;�������Ľ����grouping by�������� sql ��� group by��
//                    char[] array = str.toCharArray();
//                    Arrays.sort(array);
//                    return new String(array);
//                })).values());
        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(str->{
            char[] array = str.toCharArray();
            Arrays.sort(array);
            return new String(array);
        })).values());
    }
}
