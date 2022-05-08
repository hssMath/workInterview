package CLeetCodeExercise.ebinarycal;

import java.util.Arrays;

/**
 * 338. ����λ����������һ������ n ������ 0 <= i <= n �е�ÿ�� i ������������Ʊ�ʾ�� 1 �ĸ���������һ������Ϊ n + 1 ������ ans ��Ϊ�𰸡�
 */
public class A34BitSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(21)));
//        System.out.println(Arrays.toString(countBitsByHashMap(21)));
    }

    /**
     * ˼·1��ʹ�� x=x&x(x-1)�������һ�����Ķ���������1�ļ�����
     * 1����ȡn�����У�ָ��ĳ����Ȼ��ת��Ϊ�����ƺ�1�ĸ���
     * 2����ǰ��ʹ������ǰ�������һ���ݹ����
     * @param num
     * @return
     */
    public static int[] countBits(int num) {
        int[] bits = new int[num + 1];//�½�һ����ʱ������飬��Ϊ�����Ԫ���±��0��ʼ�����Խ������ĳ���Ϊ num+1
        for (int i = 1; i <= num; i++) {//��һ����ֵĬ����0����1��ʼ��ȡ��1��Ԫ�صĶ���������1�ĸ�����
            bits[i] = bits[i & (i - 1)] + 1;//ÿ�ζ����ú����
        }
        return bits;
    }


    /**
     * ˼·2����ȡ��0��ָ�����ֵĶ������ַ���������
     * @param num
     * @return
     */
    public static int[] countBitsByHashMap(int num) {
        int[] bits = new int[num + 1];//�½�һ����ʱ������飬��Ϊ�����Ԫ���±��0��ʼ�����Խ������ĳ���Ϊ num+1
        for (int i = 0; i <= num; i++) {
            bits[i] = getNum(Integer.toBinaryString(i), "1");
        }
        return bits;
    }

    /**
     * ��ȡ����������1�ĸ���
     *
     * @param originStr
     * @param targetStr
     * @return
     */
    public static int getNum(String originStr, String targetStr) {
        String result = originStr.replaceAll(targetStr, "");
        int i = originStr.length() - result.length();
        return i;
    }
}
