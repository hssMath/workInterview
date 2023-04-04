package AAHwQuestionsTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 49. 字母异位词分组：给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 */
public class Solution1 {
    public static void main(String[] args) {
        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // 数组原样输出可以使用方法： Arrays.toString(数组名称)
        System.out.println(Arrays.toString(str));

        // 数组 转 list
        List<String> list = Arrays.stream(str).collect(Collectors.toList());
        System.out.println(Arrays.toString(list.stream().toArray()));

        // list 转 数组
        Object[] arrays = list.stream().toArray();
        System.out.println(Arrays.toString(arrays));


        List<List<String>> resultLists = groupAnagrams(str);
        // list 转数组,并以数组样式输出： Arrays.toString(待排序list集合.stream().toArray())
        System.out.println(Arrays.toString(resultLists.stream().toArray()));

        // list 转数组并以数组size升序排序输出：先将待排序list集合.stream().sorted()方法之后，再调用 .collect(Collectors.toList())
        List<List<String>> sortedlistList = resultLists.stream().sorted(Comparator.comparing(List::size)).collect(Collectors.toList());
        System.out.println(Arrays.toString(sortedlistList.stream().toArray()));

        // 数组要想原样输出必须使用方法： Arrays.toString(array)
        Object[] array = resultLists.stream().sorted(Comparator.comparing(List::size)).toArray();
        System.out.println(Arrays.toString(array));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * @param strs string字符串一维数组
     * @return string字符串二维数组
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
//        return new ArrayList<>(Arrays.stream(strs)
//                .collect(Collectors.groupingBy(str -> {// 返回 str 排序后的结果;按排序后的结果来grouping by，类似于 sql 里的 group by。
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
