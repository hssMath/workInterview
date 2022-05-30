package CLeetCodeExercise.array;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时将所有的非零元素按原来的顺序放在最前面。请注意，必须在不复制数组的情况下原地对数组进行操作。
 * 要求：
 *    1.在原数组的基础上操作，不能拷贝额外的数组。
 *    2.尽量减少操作次数。
 */
public class A13MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 思路：第一个for循环挨个取出数组中的非0元素并赋值给单独定义的 index，取完之后，从接着的下标开始使用第二个for循环补0，直到数组的最大下标。
     * 方式：
     *    1.设置一个index，使用for循环将原数组循环个遍，如果不是0，只将非0值移动到第index位置,然后index + 1。
     *    2.遍历结束之后，前面放的全是非0元素，剩余的元素全是空的：index值表示为非0的个数也表示数组的下标，接着这个index遍历，剩余位置补0。
     * @param nums
     */
    public static void moveZeros(int[] nums){
        if (nums == null || nums.length <= 1) {//数组为空，不做任何处理，退出方法。
            return;
        }
        int index = 0;//单独调整数组的下标
        for (int i = 0; i < nums.length; i++) {//第一轮循环将非0数字放数组最前面；
            if (nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {//第二轮循环将剩余的空位补0；
            nums[i] = 0;
        }
    }

}