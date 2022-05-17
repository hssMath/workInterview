package Aapplication;

/**
 * 获取二维数组的和
 */
public class A13GetTwoDimensionalArraySum {
    public static void main(String[] args) {
        int[][] nums = {{30, 35}, {11, 23, 13, 24}, {25, 21, 31}};//这种定义方法直接给数组中的元素赋值
        int sum = 0;
        for (int i = 0; i < nums.length; i++) { //循环二维数组的每一个一维数组
            for (int j = 0; j < nums[i].length; j++) {// 再依次循环一维数组里的元素
                sum += nums[i][j];//依次相加二维数组中的所有元素
            }
        }
        System.out.println("该二维数组的和为:" + sum);
    }
}