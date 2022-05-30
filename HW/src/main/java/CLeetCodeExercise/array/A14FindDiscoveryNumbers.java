package CLeetCodeExercise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字：给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n]
 *      范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 * 要求：在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题
 */
public class A14FindDiscoveryNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    /**
     * 思路：一串数组，若每个元素都正常出现，则每个元素的数值-1，能找到对下标的数字。若没有出现，则数值-1后下标对应的
     * 1   2    3    4   5   6   3     （7个数字） 对每个数值，得到 nums[x?1]，再%n，然后增加 n。
     * 8   9    10   11  12  13  3
     *
     * 4,   3,    2,    7,  8,  2,  3,  1
     * 12, 19,    18,   15, 8,  2,  11, 9
     *
     * 遍历数组中的每个元素，给元素先-1，得到nums[x?1] %n，再+n。

     * 思路(原地修改法：遍历元素先-1，然后对n取余即为新元素理论实际值，再把元素+n，最遍历找 )：
     *      遍历 nums 数组中的每个元素，每遇到一个数 x，就先 nums[x?1]，再%n，然后增加 n。由于 nums 中所有数均在 [1,n]中，增加以后，
     * 这些数必然大于 n。最后我们遍历 nums，若 nums[i] 未大于 n，就说明没有遇到过数 i+1。这样我们就找到了缺失的数字。
     * 注意，当我们遍历到某个位置时，其中的数可能已经被增加过，因此需要对 n 取模来还原出它本来的值。
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;//{4, 3, 2, 7, 8, 2, 3, 1};
        for (int num : nums) {
            int x = (num - 1) % n;//对 n 取模来还原出它本来的值：当我们遍历到某个位置时，其中的数可能已经被增加过，因此需要此处理。
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
