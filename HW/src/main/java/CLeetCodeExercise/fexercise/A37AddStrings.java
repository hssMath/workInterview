package CLeetCodeExercise.fexercise;

/**
 * 415. �ַ�����ӣ����������ַ�����ʽ�ķǸ����� num1 �� num2 ���������ǵĺͲ�ͬ�����ַ�����ʽ���ء�
 * ע��:�㲻��ʹ���κ΃Ƚ������ڴ���������Ŀ⣨���� BigInteger����Ҳ����ֱ�ӽ�������ַ���ת��Ϊ������ʽ��
 */
public class A37AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("9","99999999999999999999999999999999999999999999999999999999999994"));
    }

    /**
     * ˼·������ַ�������2���ַ������ұ��ַ�-�ַ�0�������õ�2���ַ�����ʵֵ��Ȼ��2����ʵֵ����λ��������ӣ��õ���֮����10ȡ�࣬��ȡ������ʼ����ƴ�ӣ�
     *      Ȼ���ȡ��λ�ı�����ѭ���������в�����
     * ע��:
     *  1��ͨ��ɨ���ַ����ĵ����ַ����ַ�0�Ĳ�ֵ����ȡ��ʵ����ֵ��
     *  2��ÿ��ȡ����ʵֵ����10ȡ�࣬���֮����ȡ��λ������������ѭ����
     * @param num1
     * @param num2
     */
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();//�û�����ַ�����ƴ��
        int carry = 0;//��¼��λ�ı���
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {//i��j���е�����
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);//ȡ��ʮ��ǧ�������
            carry = (x + y + carry) / 10;//��һλ��ֵ+1��
        }
        return sb.reverse().toString();
    }
}