package CLeetCodeExercise.ebinarycal;

public class A000BinaryShow {
    /**
     * 1248
     * @param args
     */
    public static void main(String[] args) {
        int num4 = 4;
        int num6 = 6;
        System.out.println(num4+"�����ƣ�"+Integer.toBinaryString(num4));
        System.out.println(num6+"�����ƣ�"+Integer.toBinaryString(num6));

        //�������ƣ���λ��0���������ƣ���λ��1����λ����0��
        System.out.println(num4+"����1λ��"+Integer.toBinaryString(num4>>1));
        //�з������Ʒ��ű�����������λ��0���������ƣ���λ��1����λ����0��
        System.out.println(num4+"����1λ��"+Integer.toBinaryString(num4<<1));
    }
}
