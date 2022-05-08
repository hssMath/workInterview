package CLeetCodeExercise.gdynomicplan;

/**
 * 53. 最大子数组和：给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *      子数组 是数组中的一个连续部分。
 */
public class A38MaxSubArray {
    public static void main(String[] args) {
        int[] sums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(sums));
    }
    /**
     * 动态规划实现，原因：当遍历到数组中的某个元素值时，这个元素是加入到当前的连续的子列or成为新的连续子列的初始元素。成为一种多阶段处理的问题。
     * 思路：
     *  1、dp数组同下标的值=原数组时，当前的元素就会成为新的连续子列的初始元素。
     *  2、最大的连续子列为：4，-1，2，1。
     *  3、时间复杂度O(n)，空间复杂度O(n)
     * 注意
     *  1、取最大值，使用：Math.max(4, 5)
     *  2、最大值不一定是最后一个元素。
     */
//    public static int maxSubArray(int[] nums) {
//        int[] dp = new int[nums.length];//新建一个临时的dp数组，放置计算的数组
//        dp[0] = nums[0];//临时数组和原数组的第一个元素相同
//        int result = dp[0];//用来表示连续子数组的最大值，首次默认给原数组的数组第一个元素值，通过循环遍历处理时，每次比较判断是否更新该值，遍历一遍，最后返回该值。
//        for (int i = 1; i < nums.length; i++) {//扫描给定数组的每一个元素
//            //状态转移公式：取原数组的第i个元素与临时数组的第i-1个元素求和之后与原数组的第i个元素比较取2数的最大值，赋值给临时数组的第i个元素。
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
//            if (dp[i] > result) result = dp[i];// result 保存dp[i]的最大值：如果临时数组的值大于默认的 result，则使得 result 等于最大值。
//        }
//        return result;
//    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int pre = result;
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            if (pre > result) result = pre;
        }
        return result;
    }


}
