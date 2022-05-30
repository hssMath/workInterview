package CLeetCodeExercise.istring;

/**
 * 494. 目标和：给你一个整数数组 nums 和一个整数 target,向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个表达式 ：
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1"。返回可以通过上述方法构造的、
 * 运算结果等于 target 的不同 表达式 的数目。
 */
public class A41SelectSerialNumSumToTarget {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1};
        System.out.println(findTargetSumWays(arr, 0, 3));
    }

    /**
     * 暴力递归算法:递归方法实现
     * @param arr   是个固定参数
     * @param index
     * @param target
     * @return
     */
    public static int process1(int[] arr, int index, int target) {
        if (index == arr.length) {//递归扫描完了
            return target == 0 ? 1 : 0;//到0就有方法，不是0就没方法
        }
        //未扫描完毕
        return process1(arr,index + 1,target - arr[index])+process1(arr, index + 1, target + arr[index]);
    }

    /**
     * sum(P) 表示前面符号为+的集合；sum(N) 表示前面符号为减号的集合
     * 所以题目可以转化为: sum(P) - sum(N) = target
     *               => sum(nums) + sum(P) - sum(N) = target + sum(nums)
     *               => 2 * sum(P) = target + sum(nums)
     *               => sum(P) = (target + sum(nums)) / 2
     * 因此题目转化为01背包，也就是能组合成容量为sum(P)的方式有多少种
     */
    public static int findTargetSumWays(int[] nums, int i, int target) {
        int sum = 0;//数组的和
        for (int num : nums) {
            sum += num;
        }
        if (sum < target || (sum + target) % 2 == 1) {//targe大于所有为正数的组合 or (target + sum(nums))不能整除2
            return 0;
        }

        //背包问题：一个arr中，任意多个数累加和=目标数的组合有多少种
        int w = (sum + target) / 2;
        int[] dp = new int[w + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = w; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[w];
    }
}