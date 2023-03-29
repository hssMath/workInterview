package CLeetCodeExercise.ebinarycal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ23_Remove_Duplicate_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(del(sc.nextLine()));
        }
    }

    public static String del(String str) {
        // 统计字符出现次数
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        // 遍历记录最小出现次数：通过临时变量min，来存储最小值
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }
        // 删除字符
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                str = str.replace(entry.getKey() + "", "");
            }
        }
        return str;
    }
}