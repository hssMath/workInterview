package ScannerFunctionTest;

import java.util.Scanner;

/**
 * �ԲⱾ��ͨ���ύΪ0
 * ���������������ж������������ÿ��ո������������
 * �������������ÿ���������һ�����������ĺ�
 */
public class LTwoNumberAddEveryoneTeamSplitBySpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Long.parseLong(arr[i]);
            }
            System.out.println(sum);
        }
    }
}
