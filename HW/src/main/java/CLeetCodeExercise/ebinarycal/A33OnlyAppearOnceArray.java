package CLeetCodeExercise.ebinarycal;

/**
 * 136.����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
 */
public class A33OnlyAppearOnceArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }

    /**
     * ����˵����
     *  1���κ�����0���������������κ���
     *  2���κ������Լ���������������0
     *  3������������㽻����
     *
     * ˼·��
     *  1.ɨ�����飬Ȼ�����ν��������������㣬
     *  2.��Ϊ��0���κ����������κ��������һ�����ڶ��γ��֣�2����ͬ��������������0�����ۣ�����һ�ε������ᱻ���������ص������ǳ���һ�ε�����
     */
    public static int singleNumber(int[] nums){
        int result = 0;
        for (int num:nums) {
            result = result ^ num;
        }
        return result;
    }
}
