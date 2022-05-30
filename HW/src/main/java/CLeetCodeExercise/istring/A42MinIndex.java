package CLeetCodeExercise.istring;

import java.util.Arrays;

/**
 * 一组无序的相邻两数互不相等的数组，找出其中的一个局部最小数。
 *  1、确定一侧肯定有就可以用二分
 */
public class A42MinIndex {
    public static void main(String[] args) {
        int testTime = 1000;
        int maxLen = 10;
        int maxValue = 100;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int[] arr = randomArray(maxLen, maxValue);
            int ans = getMinIndex(arr);
            if (!check(arr, ans)) {
                System.out.println(Arrays.toString(arr));
                System.out.println(ans);
                break;
            }
        }
        System.out.println("测试结束");
    }

    /**
     * 用于：生成随机数组，且相邻两数互不相等。
     * 注意：
     *  1、Math.random()：a pseudorandom double greater than or equal to 0.0 and less than 1.0
     *  2、使用 do{}while() 循环给数组添加元素。
     * @param maxLen
     * @param maxValue
     * @return
     */
    public static int[] randomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen); // [0,maxLen) 指定获取数组的长度
        int[] arr = new int[len];
        if (len > 0) {
            arr[0] = (int) (Math.random() * maxValue);
            for (int i = 1; i < len; i++) {
                do {
                    arr[i] = (int) (Math.random() * maxValue);
                } while (arr[i] == arr[i - 1]);//如果产生的数相邻相等了，就重新产生数
            }
        }
        return arr;
    }

    /**
     * 验证目标程序是否为局部最小：如果 minIndex 越界了就没破坏规则；如果没有越界了就真的去比一下。
     *
     * @param arr
     * @param minIndex
     * @return
     */
    public static boolean check(int[] arr, int minIndex) {
        if (arr.length == 0) return minIndex == -1;
        int left = minIndex - 1;
        int right = minIndex + 1;
        //判断取得的目标数：+1、-1 之后是一个真实的位置(是否有效)，如果有效就去验证是否：>、< 目标数。如果无效，则左边or右边大。
        boolean isLeftBiggerMiddle = left >= 0 ? arr[left] < arr[minIndex] : true;
        boolean isRightBiggerMiddle = right < arr.length ? arr[minIndex] < arr[right] : true;
        return isLeftBiggerMiddle && isRightBiggerMiddle;
    }

    /**
     * 思路：
     * 1、使用局部最小的条件写代码，然后对于边缘条件进行单独判断。
     * 2、使用二分法查找，是一个找数的二分查找方法
     * 具体：
     * 1、没有数，return -1
     * 2、一个数，return 0
     * 3、两个数，取最小值
     * 4、超过两个数，进行 while 逻辑判断
     *
     * @param arr
     * @return
     */
    public static int getMinIndex(int[] arr) {
        if (arr.length == 0 || arr == null) return -1;
        int N = arr.length;
        if (N == 1) return 0;
        if (arr[0] < arr[1]) return 0;//2个数时，取最小值
        if (arr[N - 1] < arr[N - 2]) return N - 1;//2个数时，取最小值


        int L = 0;
        int R = N - 1;
        while (L < R - 1) {//表示L与R已经相邻的情况下
            int mid = (L + R) / 2;
            if (arr[mid - 1] > arr[mid] && arr[mid] < arr[mid + 1]) {// middle 同时比两边数都小
                return mid;
            } else {// arr[mid] 不同时小arr[mid + 1]和arr[mid - 1]：1、左>我 我>右；2、左<我 我<右；3、左<我 我>右
                if (arr[mid - 1] < arr[mid]) {//如果 middle 数比左边大，要去左边找数，所以砍掉右边：如遇到2边都一样的时候，砍掉的是右边。
                    R = mid - 1;
                } else {//如果 middle 数比右边大，要去右边找数，所以砍掉左边
                    L = mid + 1;
                }
            }
        }
        return arr[L] < arr[R] ? L : R;
    }
}