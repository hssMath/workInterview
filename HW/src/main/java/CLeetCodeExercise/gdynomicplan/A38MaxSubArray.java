package CLeetCodeExercise.gdynomicplan;

/**
 * 53. ���������ͣ�����һ���������� nums �������ҳ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�
 *      ������ �������е�һ���������֡�
 */
public class A38MaxSubArray {
    public static void main(String[] args) {
        int[] sums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(sums));
    }
    /**
     * ��̬�滮ʵ�֣�ԭ�򣺵������������е�ĳ��Ԫ��ֵʱ�����Ԫ���Ǽ��뵽��ǰ������������or��Ϊ�µ��������еĳ�ʼԪ�ء���Ϊһ�ֶ�׶δ�������⡣
     * ˼·��
     *  1��dp����ͬ�±��ֵ=ԭ����ʱ����ǰ��Ԫ�ؾͻ��Ϊ�µ��������еĳ�ʼԪ�ء�
     *  2��������������Ϊ��4��-1��2��1��
     *  3��ʱ�临�Ӷ�O(n)���ռ临�Ӷ�O(n)
     * ע��
     *  1��ȡ���ֵ��ʹ�ã�Math.max(4, 5)
     *  2�����ֵ��һ�������һ��Ԫ�ء�
     */
//    public static int maxSubArray(int[] nums) {
//        int[] dp = new int[nums.length];//�½�һ����ʱ��dp���飬���ü��������
//        dp[0] = nums[0];//��ʱ�����ԭ����ĵ�һ��Ԫ����ͬ
//        int result = dp[0];//������ʾ��������������ֵ���״�Ĭ�ϸ�ԭ����������һ��Ԫ��ֵ��ͨ��ѭ����������ʱ��ÿ�αȽ��ж��Ƿ���¸�ֵ������һ�飬��󷵻ظ�ֵ��
//        for (int i = 1; i < nums.length; i++) {//ɨ����������ÿһ��Ԫ��
//            //״̬ת�ƹ�ʽ��ȡԭ����ĵ�i��Ԫ������ʱ����ĵ�i-1��Ԫ�����֮����ԭ����ĵ�i��Ԫ�رȽ�ȡ2�������ֵ����ֵ����ʱ����ĵ�i��Ԫ�ء�
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
//            if (dp[i] > result) result = dp[i];// result ����dp[i]�����ֵ�������ʱ�����ֵ����Ĭ�ϵ� result����ʹ�� result �������ֵ��
//        }
//        return result;
//    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int pre = result;
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            if (pre > result) result = pre;
        }
        return result;
    }


}
