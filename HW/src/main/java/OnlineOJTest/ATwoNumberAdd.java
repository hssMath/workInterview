package OnlineOJTest;

import java.util.Scanner;
/**
 * ���� a+b
 * ���������������������������a,b(1 <= a, b <= 1000),�������ݰ������顣
 */
public class ATwoNumberAdd {
    /**
     * 1��public static void main(),�Լ�����ϰ��ʱ���������Ĳ���ûд����������Խ�籨���������£�
     *      �״�ִ�г���
     *          �����Ƿ��������Խ��ȷǷ��������
     *          Error: Tool.Main method not found in class Tool.Main, please define the main method as:
     *          public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
     *      ��ʵ����������Խ����󣬶���������û��д�������Լ�Ҫ��ע�⡣
     * 2��������Ŀ��������ʾ������Ȼ�ǰ�����ʾ����ʵ�Բ�ʱһ����¼������ˣ�Ȼ����ȡֵʱ����Ϊ������ȫΪ���֣��ʿ���ʹ��2�������ģ�sc.nextInt()����ȡֵ��Ȼ�������ͨ��sout���������
     *      ��Ϊ������ȫΪ���֣���ʹ�� while(in.hasNextInt())��ѭ���ж��Ƿ���ֵ��ȡ��
     * 3��Ϊ�˽�Լ�ڴ�ռ䣬������ѭ��ȡֵ�����֮�ⶨ��2����ʱ������Ȼ��ʹ��ѭ������鲻��ȥ����ֵ��2����ʱ������
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
