package CLeetCodeExercise.ebinarycal;

/**
 * 136.给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class A33OnlyAppearOnceArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }

    /**
     * 理论说明：
     *  1、任何数与0进行异或运算等于任何数
     *  2、任何数与自己进行异或运算等于0
     *  3、异或运算满足交换律
     *
     * 思路：
     *  1.扫描数组，然后依次将结果进行异或运算，
     *  2.因为：0与任何数异或等于任何数，如果一个数第二次出现，2个相同的数进行异或等于0。结论：出现一次的数不会被抵消，返回的数就是出现一次的数。
     */
    public static int singleNumber(int[] nums){
        int result = 0;
        for (int num:nums) {
            result = result ^ num;
        }
        return result;
    }
}
