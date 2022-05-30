package CLeetCodeExercise.ebinarycal;

/**
 * 461. 汉明距离：两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目；给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 */
public class A35HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    /**
     * 思路：使用 x=x&(x-1)获取二进制数中1的个数
     *
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance(int x, int y) {
        int distance = 0;
        for (int xor = x ^ y; xor != 0; xor &= (xor - 1)) {
            distance++;
        }
        return distance;
    }
}
