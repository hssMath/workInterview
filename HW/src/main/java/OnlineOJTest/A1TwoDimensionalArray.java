package OnlineOJTest;

import java.util.Scanner;

public class A1TwoDimensionalArray {
    /**
     * 一：输入是已知大小的二维数组
     * 输入描述:输入描述第一行是-个正整数m,n，表示二维数组有m行n列
     *
     * @return
     */
    public static int[][] yesKnowledgeSize() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//获取二维数组的行数
        int n = sc.nextInt();//获取二维数组的列数
        int[][] matrix = new int[m][n];//定义二维数组
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    /**
     * 二:输入的每组测试数据有多行的情况
     * 输入描述:第一行是一个正整数T，表示有T组测试数据。接下来一行有两个整数，分别是m和n;如何接下来m行，每行有n个整数。
     */
    public static void noKnowledgeSize() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//获取二维数组的组数
        while (t>0){
            t--;
            int m = sc.nextInt();//获取二维数组的行数
            if (m == 0) break;
            int n = sc.nextInt();//获取二维数组的列数
            int[][] matrix = new int[m][n];//定义二维数组
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    /**
     * 遍历输出二维数组
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] matrix = yesKnowledgeSize();
        for (int i = 0; i < matrix.length; i++) {//先获取数组的行数
            for (int j = 0; j < matrix[i].length; j++) {//获取每一行的列数
                System.out.print(matrix[i][j]);//遍历输出二维数组
            }
            System.out.println();
        }


        /**
         * 测试数据：
         * 2
         * 2 3
         * 1 2 3
         * 1 2 3
         * 2 4
         * 4 3 2 1
         * 1 1 1 1
         */
        noKnowledgeSize();
    }
}