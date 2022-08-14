package B2SelectAlgorithm;

import java.util.Arrays;

/**
 * 寻找大于指定数的最左下标
 */
public class A42LeftmostIndexNoLessTargetNum {
    public static void main(String[] args) {
        int testTime = 10000;
        int maxLen = 10;
        int maxValue = 12;
        for (int i = 0; i < testTime; i++) {
            int[] arr = getGeranter(maxLen, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) + (int) (maxValue * Math.random());
            int index = getLeftmostIndexNoLessTargetNum(arr, value);
            int testIndex = test(arr, value);
            if (index != testIndex) {
                System.out.println(Arrays.toString(arr));
                break;
            }
        }
    }

    /**
     * 获得数组
     *
     * @param maxLen
     * @param maxValue
     * @return
     */
    public static int[] getGeranter(int maxLen, int maxValue) {
        int maxSize = (int) (Math.random() * maxLen);
        int[] arr = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }

    /**
     * arr是有序的，>=num的最左下标
     *
     * @param arr
     * @param target
     * @return
     */
    public static int getLeftmostIndexNoLessTargetNum(int[] arr, int target) {
        if (arr.length == 0 || arr == null) return -1;

        int L = 0;
        int R = arr.length - 1;
        int ans = -1;//会在 while 被不断更新；此处默认-1：表示数组中不存在 >=指定的数，此处就会维持 -1。
        while (L <= R) {//L<=R就继续
            int mid = (L + R) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return ans;
    }

    /**
     * 测试目标函数是否正确，使用的是遍历方法
     *
     * @param arr
     * @param num
     * @return
     */
    public static int test(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                return i;
            }
        }
        return -1;
    }
}
