package CLeetCodeExercise.array;


import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和：给一个数组和一个目标数targer，获取2数之和的数的下标。
 */
public class A11TwoNumSum {
    public static void main(String[] args) {
        System.out.println(getByHashMap(new int[]{2, 10, 1, 7, 9, 4}, 6));
    }

    /**
     * 思路：
     *    使用 sum-数组中第i个数，引入 hashmap，若差能在 hashmap 中找到，就返回2个数组的下标；如果找不到就put到 hashmap 中：时间复杂度 => O(n)
     * 最差的情况，循环遍历到最后一个数，才找到。
     *
     * @param arr
     * @param targer
     * @return
     */
    public static String getByHashMap(int[] arr, int targer) {
        int []result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();//引入hashmap存放没有找到的值
        for (int i = 0; i <= arr.length - 1; i++) {//假如若有10个数，其最大下标为9。
            int value = targer - arr[i];//获取目标数与第i个数的差
            Integer anotherIndex = hashMap.get(value);//在 hashmap 中是否能找到 key 为差值的下标
            if (null != anotherIndex){//找到了，返回当前的下标i和另外一个下标
                result[0] = anotherIndex;
                result[1] = i;
            }else {//如果没有找到，添加到map中
                hashMap.put(arr[i],i);
            }
        }
        return Arrays.toString(result);
    }

    /**
     * 暴力穷举，不推荐使用，使用for循环：时间复杂度 =》O(n的2次方)
     *  1、用第一个数与后面的每个数进行相加，如果和=目标数就返回两数的下标；如果不等于，
     *  2、继续用第2个数与后面的每个数进行相加，如果和=目标数，就返回两数的下标；
     *  3、直到倒数第二个数与最后一个数进行比较。
     * @param arr
     * @param targer
     * @return
     */
    public static String getByFor(int[] arr, int targer) {
        int []result = new int[2];
        for (int i = 0; i <= arr.length - 2; i++) {//假如若有10个数，其最大下标为9，相比较的两个数中左边的数下标只能到8。
            for (int j = i + 1; j <= arr.length - 1; j++) {//假如若有10个数，其最大下标为9，相比较的两个数中右边的数下标只能到9。
                if (arr[i] + arr[j] == targer) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return Arrays.toString(result);
    }
}
