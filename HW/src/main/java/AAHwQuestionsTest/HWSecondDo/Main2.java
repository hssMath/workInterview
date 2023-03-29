package AAHwQuestionsTest.HWSecondDo;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line == null) break;
            char[] array = line.toCharArray();
            System.out.println("录入的数组:" + Arrays.toString(array));
            int length = array.length;
            String[] newArray = new String[length * 2 - 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = String.valueOf(array[i]);
            }
            for (int i = 0; i < length - 1; i++) {
                newArray[length + i] = String.valueOf(array[i]);
            }
            System.out.println("扩容后的数组:" + Arrays.toString(newArray));//

            StringBuffer buffer = new StringBuffer();
            int max = 0;
            for (int i = 0; i < newArray.length; i++) {
                if (String.valueOf(newArray[i]).equals("o")) {
                    max++;
                } else if (max <= length + 1) {
                    buffer.append(String.valueOf(newArray[i]));
                }
            }
            if (max % 2 == 0) {
                System.out.println(Math.abs(buffer.length() - newArray.length));
            }
        }
    }
}
