package CLeetCodeExercise.istring;

/**
 * 494. Ŀ��ͣ�����һ���������� nums ��һ������ target,�������е�ÿ������ǰ��� '+' �� '-' ��Ȼ�������������������Թ���һ�����ʽ ��
 * ���磬nums = [2, 1] �������� 2 ֮ǰ��� '+' ���� 1 ֮ǰ��� '-' ��Ȼ���������õ����ʽ "+2-1"�����ؿ���ͨ��������������ġ�
 * ���������� target �Ĳ�ͬ ���ʽ ����Ŀ��
 */
public class A41SelectSerialNumSumToTarget {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1};
        System.out.println(findTargetSumWays(arr, 0, 3));
    }

    /**
     * �����ݹ��㷨:�ݹ鷽��ʵ��
     * @param arr   �Ǹ��̶�����
     * @param index
     * @param target
     * @return
     */
    public static int process1(int[] arr, int index, int target) {
        if (index == arr.length) {//�ݹ�ɨ������
            return target == 0 ? 1 : 0;//��0���з���������0��û����
        }
        //δɨ�����
        return process1(arr,index + 1,target - arr[index])+process1(arr, index + 1, target + arr[index]);
    }

    /**
     * sum(P) ��ʾǰ�����Ϊ+�ļ��ϣ�sum(N) ��ʾǰ�����Ϊ���ŵļ���
     * ������Ŀ����ת��Ϊ: sum(P) - sum(N) = target
     *               => sum(nums) + sum(P) - sum(N) = target + sum(nums)
     *               => 2 * sum(P) = target + sum(nums)
     *               => sum(P) = (target + sum(nums)) / 2
     * �����Ŀת��Ϊ01������Ҳ��������ϳ�����Ϊsum(P)�ķ�ʽ�ж�����
     */
    public static int findTargetSumWays(int[] nums, int i, int target) {
        int sum = 0;//����ĺ�
        for (int num : nums) {
            sum += num;
        }
        if (sum < target || (sum + target) % 2 == 1) {//targe��������Ϊ��������� or (target + sum(nums))��������2
            return 0;
        }

        //�������⣺һ��arr�У����������ۼӺ�=Ŀ����������ж�����
        int w = (sum + target) / 2;
        int[] dp = new int[w + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = w; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[w];
    }
}