package CLeetCodeExercise.jfunction;

/**
 * ʹ�� 0,1 ���ȸ��ʳ��ֵĺںк�����ʵ�� 0,1�ȸ��ʳ��ֵĺ���
 */
public class A44Get01SameRateAppearUse01No01SameRateAppearFunction {

    public static void main(String[] args) {
        int testTime = 10000000;
        int[] arr = new int[2];
        for (int i = 0; i < testTime; i++) {
            arr[get01SameRateAppearUse()]++;//����һ�����־��ø���������Լ����㣻
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "�������������" + arr[i] + "��");
        }
    }

    /**
     * ��0.84�ĸ��ʷ���0����0.16�ĸ��ʷ���1������������ʵ���ǲ�֪���ġ�
     * @return
     */
    public static int get01NoSameRateAppear() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    /**
     * �ȸ��ʵķ��أ�0��1 ����
     * @return
     */
    public static int get01SameRateAppearUse(){
        int val1 = 0;
        int val2 = 0;
        do {
            val1 = get01NoSameRateAppear();
            val2 = get01NoSameRateAppear();
        }while (val1==val2);//ȡ2�Σ������һ��=�ڶ��Σ���ȡ����󷵻�����һ��
        return val1;
    }
}