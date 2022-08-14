package B1SortAlgorithm;

import java.util.Arrays;

public class ABubbleSort {
    /**
     * 思路（主要利用的是数据交换）：冒泡排序，时间复杂度O(n^2)：
     * 1、第一轮开始，获取第1元素与第2个元素进行比较，第2个元素与第3个元素进行比较，...，倒数第2个元素与倒数第1个元素进行比较，大的放后面，第一轮比较完成之后，最后一个元素为最大值，第一轮比较的次数：数组长度-1；
     * 2、第二轮比较，还是用第1个元素与第2个元素进行比较，第2个元素与第3个元素进行比较，...，倒数第3个元素与倒数第2个元素进行比较，因为第一轮比较之后的最大值已经在最后一位了，没必要再多比较一次了。第二轮的比较次数为：数组长度-2.
     * 3、...直到最外层的循环到达元素的最后一个位置时，跳出循环。
     * 说明：
     * 1、比较完毕之后每轮次数，n-1，n-，...，2,1，比较的次数是一个公差为1的等差数列，数列的和去掉较小公因子，故时间复杂度：O(n^2)。
     * 2、最外层循环不参数与比较，控制比较的的次数；内层循环进行数字的比较并交换位置：每次都是相邻的2个元素进行比较
     * 3、数组控制台输出可以直接使用：Arrays.toString(arr)
     *
     * @Description:冒泡降序排序
     * @date:2020年1月28日
     */
    public static void ABubbleSortDescTest(int[] arr) {
        //外层循环控制需要比较的次数，一共是n-1次：两数先比较后交换，左边的元素只能到倒数第二个元素(下标：arr.length-2)，每一轮比较完之后，最后一个位置为最大值或者最小值。
        for (int i = 0; i <= arr.length - 2; i++) {
            //内层循环进行冒泡，因为每完成一次外层循环，数组的后面就会多一个由小到大的有序序列，因此可以不用比较
            for (int j = 0; j <= arr.length - 2 - i; j++) {//因为每次比较之后,末尾的数字都是每一轮的极值，...，为了减少比较的次数，提高排序的效率，最大的下标只能到：arr.length-2-i。
                if (arr[j] < arr[j + 1]) {//每一轮比较，大的放后面。
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
    }

    /**
     * @Description:冒泡升序排序
     * @date:2020年1月28日
     */
    public static void ABubbleSortAscTest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//比较的轮数：下标从0开始，最后一个原色的下标为n-1。
            for (int j = 0; j < arr.length - 1 - i; j++) {//每一轮比较的次数:从下标0开始，截至n-1-i。每一个循环结束，最后一个位置最大or最小。故循环次数为arr.length-1-i。
                if (arr[j] > arr[j + 1]) {//每一轮都从0下标元素与0+1元素比较，交换位置。
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
    }

    /**
     * 手写一个对数器：生成一个长度、数值都随机的数组
     *
     * @return
     */
    public static int[] getRandomLenRandomValue(int maxLen, int maxValue) {
        int[] arr = new int[(int) (Math.random() * maxLen)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }

    /**
     * 数组的复制操作，单独写一个方法目的是在新数组开辟一个新的空间。
     * 如果写成赋值，实际是在内存中指定的是同一块内存。
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i];
        }
        return arr2;
    }

    /**
     * 判断数组是否是为递减的排序数列
     *
     * @param arr
     * @return
     */
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2) {//数组长度为0或者1时，就是有序的，返回 true.
            return true;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                return false;
            }
            max = Math.max(max,arr[i]);
        }
        return true;
    }

    /**
     * 可控样本数组大小
     * @param args
     */
    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue = 100;
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = getRandomLenRandomValue(maxLen, maxValue);
            int[] arr2 = copyArray(arr1);
            ABubbleSortDescTest(arr1);//降序
            if (!isSorted(arr1)) {
                System.out.println("选择排序错了");
                System.out.println(Arrays.toString(arr2));
                break;
            }
        }
    }
}
