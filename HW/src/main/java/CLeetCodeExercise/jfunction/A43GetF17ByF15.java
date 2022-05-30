package CLeetCodeExercise.jfunction;

/**
 * ���� F15 �ȴ��ʵõ� F17 �ϵ��������ȵõ� [0,1)���ʷ�������������Ҫ����������λ�ſ��Է��£�Ȼ���������Ȼ��������תΪ���Σ���+1����ʵ�֡�
 */
public class A43GetF17ByF15 {
    public static void main(String[] args) {
        int testTime = 10000000;
        int[] arr = new int[8];
        for (int i = 0; i < testTime; i++) {
            arr[getF17UseGetF07()]++;//����һ�����־��ø���������Լ����㣻
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + "�������������" + arr[i] + "��");
        }
    }

    /**
     * �ȸ��ʷ��� [1,5) �ϵ�������֣��ú��������ٸģ���һ���ںк�����ֻ�ܱ�����ʹ�á�
     * 1��2��3��4��5 �ĸ��ʷֱ�Ϊ��20%
     *
     * @return
     */
    public static int getf15() {
        return (int) (Math.random() * 5) + 1;
    }

    /**
     * ��ʹ�� getf15 ����һ���ȸ��ʷ��أ�0~1 �ĺ���
     *
     * @return
     */
    public static int get01() {
        int ans;
        do {
            ans = getf15();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    /**
     * ���� get01 �ȸ��ʵĵõ����ս���� 000~111 ֮��������õ� 0-7 �ȴ��ʷ���
     *
     * @return
     */
    public static int getF07Use01() {
        return (get01() << 2) + (get01() << 1) + (get01() << 0);
    }

    /**
     * ���� getF07Use01 �ȸ��ʵ� getF06������Ȼ�󽫽������+1�����������õ� 1~7 ������
     * ע�⣺
     * 1��Ŀ����1~7�ȸ��ʵĻ�ȡ������ֻ����ȡ��0~6����+1.
     * 2������ʹ�� getF07Use01*6+1�õ���1��7�ǵȸ��ʵģ�
     *
     * @return
     */
    public static int getF17UseGetF07() {
        int ans = 0;
        do {
            ans = (get01() << 2) + (get01() << 1) + (get01() << 0);//λ����ļӷ��ǰ���λ������еģ������ת��Ϊ10���Ƶ�����
        } while (ans == 7);
        return ans + 1;
    }
}
