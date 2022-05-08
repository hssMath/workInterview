package CLeetCodeExercise.AAapplication;

import Tool.StrinigToBinaryString;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ������
 * ����һ����n���ַ���ɵ��ַ��������е�i���ַ����ֵĴ���ΪAi������Ը��ַ���Ӧ�ù��������룬ʹ�ø��ַ����ĳ��Ⱦ����̣ܶ���������ַ�������̳��ȡ�
 */
public class A10HaFuManCode {

    public static void main(String[] args) {
        System.out.println("ABBBCCCCCCCCDDDDDDEE".length());//length=20
        System.out.println("1110110110110000000001010101010101111".length());//length=37
        System.out.println(StrinigToBinaryString.toBinaryString("ABBBCCCCCCCCDDDDDDEE"));//length=140

        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        long sum = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            queue.add(Long.parseLong(s[i]));
        }
        while (queue.size() > 1) {
            long a = queue.poll();
            long b = queue.poll();
            sum = sum + a + b;
            queue.add(a + b);
        }
        System.out.println(sum);
    }
}