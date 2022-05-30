package CLeetCodeExercise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. �ҵ�������������ʧ�����֣�����һ���� n ������������ nums ������ nums[i] ������ [1, n] �ڡ������ҳ������� [1, n]
 *      ��Χ�ڵ�û�г����� nums �е����֣������������ʽ���ؽ����
 * Ҫ���ڲ�ʹ�ö���ռ���ʱ�临�Ӷ�Ϊ O(n) ������½���������
 */
public class A14FindDiscoveryNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    /**
     * ˼·��һ�����飬��ÿ��Ԫ�ض��������֣���ÿ��Ԫ�ص���ֵ-1�����ҵ����±�����֡���û�г��֣�����ֵ-1���±��Ӧ��
     * 1   2    3    4   5   6   3     ��7�����֣� ��ÿ����ֵ���õ� nums[x?1]����%n��Ȼ������ n��
     * 8   9    10   11  12  13  3
     *
     * 4,   3,    2,    7,  8,  2,  3,  1
     * 12, 19,    18,   15, 8,  2,  11, 9
     *
     * ���������е�ÿ��Ԫ�أ���Ԫ����-1���õ�nums[x?1] %n����+n��

     * ˼·(ԭ���޸ķ�������Ԫ����-1��Ȼ���nȡ�༴Ϊ��Ԫ������ʵ��ֵ���ٰ�Ԫ��+n��������� )��
     *      ���� nums �����е�ÿ��Ԫ�أ�ÿ����һ���� x������ nums[x?1]����%n��Ȼ������ n������ nums ������������ [1,n]�У������Ժ�
     * ��Щ����Ȼ���� n��������Ǳ��� nums���� nums[i] δ���� n����˵��û���������� i+1���������Ǿ��ҵ���ȱʧ�����֡�
     * ע�⣬�����Ǳ�����ĳ��λ��ʱ�����е��������Ѿ������ӹ��������Ҫ�� n ȡģ����ԭ����������ֵ��
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;//{4, 3, 2, 7, 8, 2, 3, 1};
        for (int num : nums) {
            int x = (num - 1) % n;//�� n ȡģ����ԭ����������ֵ�������Ǳ�����ĳ��λ��ʱ�����е��������Ѿ������ӹ��������Ҫ�˴���
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
