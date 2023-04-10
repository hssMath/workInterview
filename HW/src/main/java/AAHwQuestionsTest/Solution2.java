package AAHwQuestionsTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * AAAAA->A5            --- A4
 * AA BB AA->AABBAA     --- A2ABB1
 * ABC ABC ABC->ABC3
 * AB AB ABC->AB3C      --- AB2ABC1 不是最优
 * AB ABC ABC->AB1ABC2
 */
public class Solution2 {
    public static void main(String[] args) {
        getResult("AAAAA");
        getResult("AABBAA");
        getResult("ABCABCABC");
        getResult("ABABABC");
        getResult("ABABCABC");
    }

    /**
     * ASCII值就是控制字符对应的十进制数值
     * 0-9的 ASCII 48-57；A-Z：65-90；a-z：97-122。
     * @param strs
     */
    public static void getResult(String strs) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        StringBuilder curStr = new StringBuilder(); // 不断构造当前字符串
        char[] chars = strs.toCharArray();
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (flag) {
                curStr.append(chars[i]);
                flag = false;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] || i == chars.length - 2) {
                    if (hashMap.containsKey(curStr.toString())) {
                        int num = hashMap.get(curStr.toString()) + 1;
                        hashMap.put(curStr.toString(), num);
                    } else {
                        hashMap.put(curStr.toString(), 1);
                    }
                    curStr = new StringBuilder();
                    curStr.append(chars[j]);
                    i = j - 1;
                    break;
                } else {
                    curStr.append(chars[j]);
                }
            }
        }

//        System.out.println(Arrays.toString(hashMap.entrySet().stream().toArray()));

        List<Map.Entry<String, Integer>> entryList = hashMap.entrySet().stream().collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < entryList.size(); i++) {
            stringBuilder.append(entryList.get(i).getKey()).append(entryList.get(i).getValue());
        }
        System.out.println(stringBuilder.toString());
    }
}
