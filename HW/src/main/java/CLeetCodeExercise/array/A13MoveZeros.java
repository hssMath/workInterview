package CLeetCodeExercise.array;

import java.util.Arrays;

/**
 * ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ�����еķ���Ԫ�ذ�ԭ����˳�������ǰ�档��ע�⣬�����ڲ���������������ԭ�ض�������в�����
 * Ҫ��
 *    1.��ԭ����Ļ����ϲ��������ܿ�����������顣
 *    2.�������ٲ���������
 */
public class A13MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * ˼·����һ��forѭ������ȡ�������еķ�0Ԫ�ز���ֵ����������� index��ȡ��֮�󣬴ӽ��ŵ��±꿪ʼʹ�õڶ���forѭ����0��ֱ�����������±ꡣ
     * ��ʽ��
     *    1.����һ��index��ʹ��forѭ����ԭ����ѭ�����飬�������0��ֻ����0ֵ�ƶ�����indexλ��,Ȼ��index + 1��
     *    2.��������֮��ǰ��ŵ�ȫ�Ƿ�0Ԫ�أ�ʣ���Ԫ��ȫ�ǿյģ�indexֵ��ʾΪ��0�ĸ���Ҳ��ʾ������±꣬�������index������ʣ��λ�ò�0��
     * @param nums
     */
    public static void moveZeros(int[] nums){
        if (nums == null || nums.length <= 1) {//����Ϊ�գ������κδ����˳�������
            return;
        }
        int index = 0;//��������������±�
        for (int i = 0; i < nums.length; i++) {//��һ��ѭ������0���ַ�������ǰ�棻
            if (nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {//�ڶ���ѭ����ʣ��Ŀ�λ��0��
            nums[i] = 0;
        }
    }

}