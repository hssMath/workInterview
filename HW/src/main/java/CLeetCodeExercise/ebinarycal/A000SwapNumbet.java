package CLeetCodeExercise.ebinarycal;

public class A000SwapNumbet {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(9));

        //ʵ������ķ������߼���
        System.out.println(9 >> 1);
        System.out.println(9 << 1);
        int a = 4, b = 5;
        System.out.println("ԭʼ���ݣ�a:" + a + "��b:" + b);

        //ͨ���м���ʱ��������ý���λ�ú�Ľ��
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a + "��b:" + b);

        //ͨ��2������֮�ͣ��Ⱥ�-b��a���ٺ�-a��b����ý���λ�ú�Ľ����
        a = a + b;//�Ȼ��2��֮�ͣ�Ȼ��ͨ��:��-a����b����-b��a��
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + "��b:" + b);

        /**
         * �ȶ�2����������������㣬�Ƚ������b������������b���ٽ������b������������a����ý���λ�ú�Ľ����
         * ˵����
         *      1���κ�����0������㣬�����κ�����
         *      2.����������㽻���ɡ�
         */
        a = a ^ b;  //0100^0101 => 0001
        b = a ^ b;//b=(a ^ b) ^ b = a ^��b ^ b��= a   0001^0000 => 0001
        a = a ^ b;//a=(a ^ b) ^ a = (a ^ a) ^ b = b   0000^0001 => 0001
        System.out.println("a:" + a + "��b:" + b);
    }
}
