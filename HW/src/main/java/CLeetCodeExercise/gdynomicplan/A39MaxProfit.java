package CLeetCodeExercise.gdynomicplan;

/**
 * 121. 买卖股票的最佳时机：给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class A39MaxProfit {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    /**
     * 动态规划：
     *  我们需要找出给定数组中两个数字之间的最大差值（即，最大利润）。此外，第二个数字（卖出价格）必须大于第一个数字（买入价格）。
     *  形式上，对于每组 i 和 j（其中 j > i）我们需要找出 max(prices[j] - prices[i])。
     * 思路：
     *      1、使用2个临时变量存储最低股价和当前所能获得的最大利润。
     *      2.循环循环迭代输入的prices，当前价格小于最小的谷值时修改 min_prices,否则判断当前获得的利润大于最大的利润时修改 max_profit
     *      3、一次遍历-复杂度分析:
     *          3.1 时间复杂度: O(n)，只需遍历一次。
     *          3.2 空间复杂度: 0(1),只使用了两个变量。
     * @param prices 价格数组
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices==null) return 0;
        int minprice = Integer.MAX_VALUE;//记录股价最低的股价
        int maxprofit = 0;//记录当前所能获得的最大利润
        for (int i = 0; i < prices.length; i++) {           //循环迭代输入的 prices 数组
            if (prices[i] < minprice) {                     //当前价格小于最小的谷值时修改 min_prices,
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {  //当前获得的利润大于最大的利润时修改 max_profit
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    /**
     * 暴力穷举：执行超时，不能这样写。
     */
//    public static int maxProfit(int[] prices) {
//        int maxprofit = 0;//股票最低价格
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//                if (profit > maxprofit) {
//                    maxprofit = profit;
//                }
//            }
//        }
//        return maxprofit;
//    }
}
