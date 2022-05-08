package CLeetCodeExercise.array;

import java.util.Arrays;

/**
 * ������m��f��0Ԫ��+n��0�ĵ�������M��n��Ԫ�صĵ�������N���кϲ���Ȼ�������������M(m+n)����֤������M(m+n)�ǵ����ġ�
 * ˵����
 *      1.�ϲ���������֮��������鳤����ȷ���ġ�
 *      2.����2�������Ѿ��ǵ������ص��������
 *      3.M����ķ�0Ԫ��m��N�����n��Ԫ�ز�һ����ȡ�
 * �ⷨ��һ��forѭ������2������ֱ�����һ���±꣬ȡ��������ĵ�һ��Ԫ�ؿ�ʼ�Ƚϣ�С������forѭ���ĵ�i��Ԫ�أ�Ȼ���С���������±�+1��
 *      ֱ��һ�������Ԫ���Ѿ�ȡ�꣬�Ͳ����бȽ��ˣ�forѭ����ȡ��
 * ע�⣺i++���ȸ�ֵ���ټ��㣻
 *      ++i: �ȼ��㣬�ٸ�ֵ
 */
public class A12TArrayMerge {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);//�������÷���ֵ����Ϊ��������ͬһ��ջ�����顣
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * ʱ�临�Ӷ�O(m+n)��˼·��
     * 1���½�һ����ʱ���飬ʹ��һ��forѭ������2������ֱ�����һ���±ꣻ
     * 2��ȡ��������ĵ�һ��Ԫ�ؿ�ʼ�Ƚϣ�С������forѭ���ĵ�i��Ԫ�أ�Ȼ���С���������±�+1��ֱ��һ�������Ԫ���Ѿ�ȡ�꣬�Ͳ����бȽ��ˣ�forѭ��ֱ�ӻ�ȡ��
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n;
        int[] temp = new int[k];
        for(int index = 0,nums1Index = 0,nums2Index = 0; index < k; index++){
            if(nums1Index >= m) {                               //nums1�����Ѿ�ȡ�꣬��ȫȡnums 2�����ֵ����
                temp[index] = nums2[nums2Index++];
            }else if(nums2Index >= n){                          //nums2�����Ѿ�ȡ�꣬��ȫȡnums1�����ֵ����
                temp[index] = nums1[nums1Index++];
            }else if(nums1[nums1Index] < nums2[ nums2Index]){
                temp[index] = nums1[nums1Index++];              //nums1�����Ԫ��ֵС��nums2���飬ȡnums1�����ֵ
            }else{
                temp[index] = nums2[nums2Index++];              //*nums 2�����Ԫ��ֵС�ڵ���nums1������飬ȡnums 2�����ֵ
            }
        }
        for(int i=0;i<k;i++){
            nums1[i] = temp[i];
        }
    }
}
