package OnlineOJTest;

import java.util.Arrays;

/**
 * 矩阵乘法：
 * 描述：给定两个 n*n 的矩阵 A 和 B ，求 A*B 。
 * 示例1，输入：[[1,2],[3,2]],[[3,4],[2,1]]
 * 示例2，输入：[[1]],[[1]]
 * 返回值：[[1]]
 */
public class A2MatrixMultiplication {
    public static int[][] solve(int[][] a, int[][] b) {
        int n = a.length;
        int[][] rs = new int[n][n];
        int tmpValue = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    tmpValue += a[i][k] * b[k][j];
                }
                rs[i][j] = tmpValue;
                tmpValue = 0;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        int[][] arrayA = new int[][]{{1, 2}, {3, 2}};
        int[][] arrayB = new int[][]{{3, 4}, {2, 1}};
        Arrays.toString(solve(arrayA, arrayB));
    }
}