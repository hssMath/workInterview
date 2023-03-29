package AAARtQuestionTest.bStrinigRollback;

import java.util.Scanner;

/**
 * 字符串反转输出
 */
public class StringToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // 通过 str.toCharArray() 获取字符串中每个字符
        for (int i = str.toCharArray().length-1; i >= 0; i--) {
            System.out.print(str.toCharArray()[i]);
        }
    }
}
