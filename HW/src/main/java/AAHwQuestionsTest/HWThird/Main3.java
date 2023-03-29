package AAHwQuestionsTest.HWThird;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        String target = scanner.next();
        System.out.println(getResult(words, target));
    }

    private static String getResult(String[] words, String target) {
        String sorted_target = sortStr(target);
        ArrayList<String> ans = new ArrayList<>();
        for (String word : words) {
            String sorted_word = sortStr(word);
            if (sorted_target.equals(sorted_word)) {
                ans.add(word);
            }
        }
        if (ans.size() > 0) {
            ans.sort(String::compareTo);
            StringJoiner joiner = new StringJoiner(" ");
            for (String an : ans
            ) {
                joiner.add(an);
            }
            return joiner.toString();
        } else {
            return "null";
        }
    }

    private static String sortStr(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
