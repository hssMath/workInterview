package Aapplication.duigu;

import java.util.HashMap;
import java.util.Map;

/**
 * 爬楼梯问题，一次只能走1、2台阶，若n阶的楼梯，爬到楼顶有多少种爬法？
 * 解析：
 *      楼梯数若为 1 ，有 1 种爬法：1                      f(1) = 1
 *      楼梯数若为 2 ，有 2 种爬法：11,2                   f(2) = 2
 *      楼梯数若为 3 ，有 3 种爬法：111，12,21             f(3) = 3
 *      楼梯数若为 4 ，有 5 种爬法：1111,112,121,211,22    f(4) = 5
 */
public class A1ClimbStairs {
    public static void main(String[] args) {
        System.out.println(getDuiGui(5));
    }

    public static int GetFor(int n){
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    /**
     * 使用递归算法实现：递归的终止条件，f(1) = 1，f(2) = 2。时间复杂度高。O(n的2次方)
     * 其实就是一个树化。
     * @param num
     * @return
     */
    public static int getDuiGui(int num){
        if (num == 1) {
            return 1;
        }else if (num == 2) {
            return 2;
        }else{
            return getDuiGui(num-1)+getDuiGui(num-2);
        }
    }

    /**
     * 使用递归的 for 循环算法实现
     * @param num
     * @return
     */
    public static int getSum(int num){
        Map<Integer,Integer> storeMap = new HashMap<>();//保存求解过的n个楼梯的爬法的中间值，后面用到的时候直接取值。减少了多次重复计算问题。时间复杂度高。O(n)
        if (num == 1) {
            return 1;
        }else if (num == 2) {
            return 2;
        }
        if (null != storeMap.get(num)) {
            return storeMap.get(num);
        }else {
            int result = getSum(num - 1) + getSum(num - 2);
            storeMap.put(num,result);
            return result;
        }
    }
}