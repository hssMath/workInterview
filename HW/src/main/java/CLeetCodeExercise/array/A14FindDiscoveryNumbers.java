package CLeetCodeExercise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 * 要求：在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题吗
 */
public class A14FindDiscoveryNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDiscoveryNumbers(nums));
    }

    /**
     * 思路：一串数组，若每个元素都正常出现，则每个元素的数值-1，能找到对下标的数字。若没有出现，则数值-1后下标对应的
     * 1   2    3    4   5   6   3     （7个数字） 每个数值-1的下标进行标记
     * -1  -2   -3   -4  -5  -6  3
     *
     * 遍历数组中的每个元素，给元素-1%(元素个数)，如果2个数
     * @param nums
     * @return
     */
    public static List<Integer> findDiscoveryNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <nums.length ; i++) {//获取第i个元素-1并与长度取余，给第i个元素+取余的结果。
            int x = (nums[i] - 1) % n;//对n取模来还原出它本来的值
            nums[x] += n;
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {//判断数组中小于数组长度的元素下边+1,就是缺少的元素。
            if (nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
