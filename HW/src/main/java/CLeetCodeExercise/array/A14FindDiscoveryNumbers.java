package CLeetCodeExercise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字：给你一个含 n 个整数的数组 arr ，其中 arr[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内
 *      但没有出现在 arr 中的数字，并以数组的形式返回结果。
 * 要求：在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题
 */
public class A14FindDiscoveryNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3};
//        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("初始数组："+ Arrays.toString(arr));
        System.out.println(findDisappearedNumbers(arr));
    }

    /**
     * 思路：
     *      一、若每个元素都正常出现，则每个元素值-1再%n得到一个新下标， 最后 arr[新下标]+n，得到新下标位置的数组元素。
     *      二、然后将数组的<=n的元素值下标+1的值放到一个新list中。
     * eg1：
     *      [1   2    3    4   5   6   3]
     *      处理后的数组：
     *      [8   9    10   11  12  13  3]
     *      将数组的<=n的元素下标+1的值放到一个新list中：
     *      得到：[7]
     *
     * eg2：
     *      [4,   3,    2,    7,  8,  2,  3,  1]
     *      处理后的数组：
     *      [12, 19,    18,   15, 8,  2,  11, 9]
     *      将数组的<=n的元素下标+1的值放到一个新list中：
     *      得到：[5,6]
     *
     * 理解：(原地修改原数组为一个新数组：遍历数组元素值先-1再%n得到一个“新下标”，最后 arr[新下标]+n，得到“新下标”位置的数组元素，最后
     *      遍历找，由于 arr 中所有数均在 [1,n]中，增加以后，这些数必然大于 n。最后我们遍历 arr，若 arr[i] <= n，就说明没有遇到过数
     *      （i+1）。这样我们就找到了缺失的数字。
     * 注意，当我们遍历到某个位置时，新数组的数可能已经被增加过，因此需要+n，再得到它的新值。
     */
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;//{4, 3, 2, 7, 8, 2, 3, 1};
        for (int num : arr) {
            int x = (num - 1) % n;// 对 n 取模来还原出它本来的值：当我们遍历到某个位置时，其中的数可能已经被增加过，因此需要此处理。
            arr[x] += n;
            System.out.println("arr["+x+"]="+arr[x]);
        }
        System.out.println("中间数组："+ Arrays.toString(arr));

        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
