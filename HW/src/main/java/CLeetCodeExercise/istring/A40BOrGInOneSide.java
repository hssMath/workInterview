package CLeetCodeExercise.istring;

/**
 *  让B在左边，G在右边；或者G在左边，B在右边，最少需要几次交换。
 */
public class A40BOrGInOneSide {
    public static void main(String[] args) {
        System.out.println(minSteps("BGBGGG"));
    }

    /**
     * 思路：
     *  1、进行的是交换的次数计算，不需要进行真实字符的交换
     *  2、题目说了让B在左边，G在右边；或者G在左边，B在右边。是一种干扰。
     *  3、前面的G不需要再更相同的进行更换。
     * 注意：
     *  1、时间复杂度：O（n）
     * @param s
     * @return
     */
    public static int minSteps(String s) {
        if (s.length() == 0 || null ==s) return 0;
        char[] str = s.toCharArray();
        int step1 = 0;
        int l1 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'G') {
                step1 += i - l1;
                l1++;
            }
        }
        int step2 = 0;
        int l2 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'B') {
                step2 += i - l2;
                l2++;
            }
        }
        return Math.min(step1,step2);
    }
}
