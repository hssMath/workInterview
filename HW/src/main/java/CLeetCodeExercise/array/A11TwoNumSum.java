package CLeetCodeExercise.array;


import java.util.Arrays;
import java.util.HashMap;

/**
 * NC61 两数之和：给出一个整型数组 numbers 和一个目标值 target，请在数组中找出两个加起来等于目标值的数的下标，返回的下标按升序排列。
 * 注意：（注：返回的数组下标从1开始算起，保证target一定可以由数组里面2个数字相加得到）
 */
public class A11TwoNumSum {
    public static void main(String[] args) {
        System.out.println(getByHashMap(new int[]{20,70,110,150}, 90));
        getByHashMap(new int[]{20,70,110,150}, 90);
    }

    /**
     * 思路：
     *    使用 sum-数组中第i个数，引入 hashmap，若差能在 hashmap 中找到，就返回2个数组的下标；如果找不到就put到 hashmap 中：
     *    时间复杂度 => O(n)，最差的情况，循环遍历到最后一个数，才找到。
     * @param arr
     * @param target
     * @return
     */
    public static String getByHashMap(int[] arr, int target) {
        int []result = new int[2];

        //引入hashmap存放数组元素值和数组下标。
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {// 假如若有10个数，其最大下标为9。
            int value = target - arr[i];// 获取目标数与第i个数的差
            if (hashMap.containsKey(value)){// 找到了，返回当前的下标i和另外一个下标
                Integer anotherIndex = hashMap.get(value);// hashmap 中是否能找到 key 为差值的下标
                result[0] = anotherIndex+1;
                result[1] = i+1;
            }else {//如果没有找到，添加到map中
                hashMap.put(arr[i],i);
            }
        }
        Arrays.sort(result); // Arrays类之只是提供了默认的升序排列，要对基础类型的数组进行降序排序，使用for反转
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
