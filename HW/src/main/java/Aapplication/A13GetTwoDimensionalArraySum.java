package Aapplication;

/**
 * ��ȡ��ά����ĺ�
 */
public class A13GetTwoDimensionalArraySum {
    public static void main(String[] args) {
        int[][] nums = {{30, 35}, {11, 23, 13, 24}, {25, 21, 31}};//���ֶ��巽��ֱ�Ӹ������е�Ԫ�ظ�ֵ
        int sum = 0;
        for (int i = 0; i < nums.length; i++) { //ѭ����ά�����ÿһ��һά����
            for (int j = 0; j < nums[i].length; j++) {// ������ѭ��һά�������Ԫ��
                sum += nums[i][j];//������Ӷ�ά�����е�����Ԫ��
            }
        }
        System.out.println("�ö�ά����ĺ�Ϊ:" + sum);
    }
}