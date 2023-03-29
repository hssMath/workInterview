package AAHwQuestionsTest.HWSecondDo;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    //3,2,1,4,6,9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxarea = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] strings = line.trim().split(",");
            int[] nums = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                nums[i] = Integer.parseInt(strings[i]);
            }
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            int temp = 0;
            for (int i = 0; i <= nums.length - 2; i++) {
                for (int j = i + 1; j <= nums.length - 1; j++) {
                    int a = nums[i];
                    int b = nums[j];
                    temp = Math.abs(a - b) * Math.min(a, b);
                    if (temp > maxarea) {
                        maxarea = temp;
                    }
                }
            }
            System.out.println(maxarea);
        }
    }
}