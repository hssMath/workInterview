package CLeetCodeExercise.istring;

/**
 *  ��B����ߣ�G���ұߣ�����G����ߣ�B���ұߣ�������Ҫ���ν�����
 */
public class A40BOrGInOneSide {
    public static void main(String[] args) {
        System.out.println(minSteps("BGBGGG"));
    }

    /**
     * ˼·��
     *  1�����е��ǽ����Ĵ������㣬����Ҫ������ʵ�ַ��Ľ���
     *  2����Ŀ˵����B����ߣ�G���ұߣ�����G����ߣ�B���ұߡ���һ�ָ��š�
     *  3��ǰ���G����Ҫ�ٸ���ͬ�Ľ��и�����
     * ע�⣺
     *  1��ʱ�临�Ӷȣ�O��n��
     * @param s
     * @return
     */
    public static int minSteps(String s) {
        if (s.length() == 0 || null ==s) return 0;
        char[] str = s.toCharArray();
        int step1 = 0;
        int l1 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'G') {
                step1 += i - l1;
                l1++;
            }
        }
        int step2 = 0;
        int l2 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'B') {
                step2 += i - l2;
                l2++;
            }
        }
        return Math.min(step1,step2);
    }
}
