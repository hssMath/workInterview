package CLeetCodeExercise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ���� n ������������ nums ������ nums[i] ������ [1, n] �ڡ������ҳ������� [1, n] ��Χ�ڵ�û�г����� nums �е����֣������������ʽ���ؽ����
 * Ҫ���ڲ�ʹ�ö���ռ���ʱ�临�Ӷ�Ϊ O(n) ������½�����������
 */
public class A14FindDiscoveryNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDiscoveryNumbers(nums));
    }

    /**
     * ˼·��һ�����飬��ÿ��Ԫ�ض��������֣���ÿ��Ԫ�ص���ֵ-1�����ҵ����±�����֡���û�г��֣�����ֵ-1���±��Ӧ��
     * 1   2    3    4   5   6   3     ��7�����֣� ÿ����ֵ-1���±���б��
     * -1  -2   -3   -4  -5  -6  3
     *
     * ���������е�ÿ��Ԫ�أ���Ԫ��-1%(Ԫ�ظ���)�����2����
     * @param nums
     * @return
     */
    public static List<Integer> findDiscoveryNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <nums.length ; i++) {//��ȡ��i��Ԫ��-1���볤��ȡ�࣬����i��Ԫ��+ȡ��Ľ����
            int x = (nums[i] - 1) % n;//��nȡģ����ԭ����������ֵ
            nums[x] += n;
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {//�ж�������С�����鳤�ȵ�Ԫ���±�+1,����ȱ�ٵ�Ԫ�ء�
            if (nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
