package CLeetCodeExercise.array;

import java.util.Arrays;

/**
 * 将含有m个f非0元素+n个0的递增数组M和n个元素的递增数组N进行合并，然后输出给新数组M(m+n)，保证新数组M(m+n)是递增的。
 * 说明：
 *      1.合并两个数组之后的新数组长度是确定的。
 *      2.利用2个数组已经是递增的特点进行排序。
 *      3.M数组的非0元素m与N数组的n个元素不一定相等。
 * 解法：一个for循环，给2个数组分别设置一个下标，取两个数组的第一个元素开始比较，小的数给for循环的第i个元素，然后把小数的数组下标+1，
 *      直到一个数组的元素已经取完，就不进行比较了，for循环获取。
 * 注意：i++：先赋值，再计算；
 *      ++i: 先计算，再赋值
 */
public class A12TArrayMerge {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);//方法不用返回值，因为操作的是同一个栈的数组。
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 时间复杂度O(m+n)，思路：
     * 1、新建一个临时数组，使用一个for循环，和2个数组分别设置一个下标；
     * 2、取两个数组的第一个元素开始比较，小的数给for循环的第i个元素，然后把小数的数组下标+1，直到一个数组的元素已经取完，就不进行比较了，for循环直接获取。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n;
        int[] temp = new int[k];
        for(int index = 0,nums1Index = 0,nums2Index = 0; index < k; index++){
            if(nums1Index >= m) {                               //nums1数组已经取完，完全取nums 2数组的值即可
                temp[index] = nums2[nums2Index++];
            }else if(nums2Index >= n){                          //nums2数组已经取完，完全取nums1数组的值即可
                temp[index] = nums1[nums1Index++];
            }else if(nums1[nums1Index] < nums2[ nums2Index]){
                temp[index] = nums1[nums1Index++];              //nums1数组的元素值小于nums2数组，取nums1数组的值
            }else{
                temp[index] = nums2[nums2Index++];              //*nums 2数组的元素值小于等于nums1左边数组，取nums 2数组的值
            }
        }
        for(int i=0;i<k;i++){
            nums1[i] = temp[i];
        }
    }
}
