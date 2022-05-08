package CLeetCodeExercise.gdynomicplan;

/**
 * 121. ������Ʊ�����ʱ��������һ������ prices �����ĵ� i ��Ԫ�� prices[i] ��ʾһ֧������Ʊ�� i ��ļ۸�
 * ��ֻ��ѡ�� ĳһ�� ������ֻ��Ʊ����ѡ���� δ����ĳһ����ͬ������ �����ù�Ʊ�����һ���㷨�����������ܻ�ȡ���������
 * ��������Դ���ʽ����л�ȡ�������������㲻�ܻ�ȡ�κ����󣬷��� 0 ��
 */
public class A39MaxProfit {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    /**
     * ��̬�滮��
     *  ������Ҫ�ҳ�������������������֮�������ֵ������������󣩡����⣬�ڶ������֣������۸񣩱�����ڵ�һ�����֣�����۸񣩡�
     *  ��ʽ�ϣ�����ÿ�� i �� j������ j > i��������Ҫ�ҳ� max(prices[j] - prices[i])��
     * ˼·��
     *      1��ʹ��2����ʱ�����洢��͹ɼۺ͵�ǰ���ܻ�õ��������
     *      2.ѭ��ѭ�����������prices����ǰ�۸�С����С�Ĺ�ֵʱ�޸� min_prices,�����жϵ�ǰ��õ����������������ʱ�޸� max_profit
     *      3��һ�α���-���Ӷȷ���:
     *          3.1 ʱ�临�Ӷ�: O(n)��ֻ�����һ�Ρ�
     *          3.2 �ռ临�Ӷ�: 0(1),ֻʹ��������������
     * @param prices �۸�����
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices==null) return 0;
        int minprice = Integer.MAX_VALUE;//��¼�ɼ���͵Ĺɼ�
        int maxprofit = 0;//��¼��ǰ���ܻ�õ��������
        for (int i = 0; i < prices.length; i++) {           //ѭ����������� prices ����
            if (prices[i] < minprice) {                     //��ǰ�۸�С����С�Ĺ�ֵʱ�޸� min_prices,
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {  //��ǰ��õ����������������ʱ�޸� max_profit
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    /**
     * ������٣�ִ�г�ʱ����������д��
     */
//    public static int maxProfit(int[] prices) {
//        int maxprofit = 0;//��Ʊ��ͼ۸�
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
