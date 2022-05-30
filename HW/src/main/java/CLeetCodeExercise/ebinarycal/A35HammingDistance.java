package CLeetCodeExercise.ebinarycal;

/**
 * 461. �������룺��������֮��� �������� ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ�������������� x �� y�����㲢��������֮��ĺ������롣
 */
public class A35HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    /**
     * ˼·��ʹ�� x=x&(x-1)��ȡ����������1�ĸ���
     *
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance(int x, int y) {
        int distance = 0;
        for (int xor = x ^ y; xor != 0; xor &= (xor - 1)) {
            distance++;
        }
        return distance;
    }
}
