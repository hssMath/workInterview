package CLeetCodeExercise.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 448. �ҵ�������������ʧ�����֣�����һ���� n ������������ arr ������ arr[i] ������ [1, n] �ڡ������ҳ������� [1, n] ��Χ��
 *      ��û�г����� arr �е����֣������������ʽ���ؽ����
 * Ҫ���ڲ�ʹ�ö���ռ���ʱ�临�Ӷ�Ϊ O(n) ������½���������
 */
public class A14FindDiscoveryNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3};
//        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("��ʼ���飺"+ Arrays.toString(arr));
        System.out.println(findDisappearedNumbers(arr));
    }

    /**
     * ˼·��
     *      һ����ÿ��Ԫ�ض��������֣���ÿ��Ԫ��ֵ-1��%n�õ�һ�����±꣬ ��� arr[���±�]+n���õ����±�λ�õ�����Ԫ�ء�
     *      ����Ȼ�������<=n��Ԫ��ֵ�±�+1��ֵ�ŵ�һ����list�С�
     * eg1��
     *      [1   2    3    4   5   6   3]
     *      ���������飺
     *      [8   9    10   11  12  13  3]
     *      �������<=n��Ԫ���±�+1��ֵ�ŵ�һ����list�У�
     *      �õ���[7]
     *
     * eg2��
     *      [4,   3,    2,    7,  8,  2,  3,  1]
     *      ���������飺
     *      [12, 19,    18,   15, 8,  2,  11, 9]
     *      �������<=n��Ԫ���±�+1��ֵ�ŵ�һ����list�У�
     *      �õ���[5,6]
     *
     * ��⣺(ԭ���޸�ԭ����Ϊһ�������飺��������Ԫ��ֵ��-1��%n�õ�һ�������±ꡱ����� arr[���±�]+n���õ������±ꡱλ�õ�����Ԫ�أ����
     *      �����ң����� arr ������������ [1,n]�У������Ժ���Щ����Ȼ���� n��������Ǳ��� arr���� arr[i] <= n����˵��û����������
     *      ��i+1�����������Ǿ��ҵ���ȱʧ�����֡�
     * ע�⣬�����Ǳ�����ĳ��λ��ʱ����������������Ѿ������ӹ��������Ҫ+n���ٵõ�������ֵ��
     */
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;//{4, 3, 2, 7, 8, 2, 3, 1};
        for (int num : arr) {
            int x = (num - 1) % n;// �� n ȡģ����ԭ����������ֵ�������Ǳ�����ĳ��λ��ʱ�����е��������Ѿ������ӹ��������Ҫ�˴���
            arr[x] += n;
            System.out.println("arr["+x+"]="+arr[x]);
        }
        System.out.println("�м����飺"+ Arrays.toString(arr));

        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
