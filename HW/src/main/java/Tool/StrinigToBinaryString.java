package Tool;

public class StrinigToBinaryString {
    /**
     * ����ĸת��Ϊ��Ӧ�Ķ�������
     * @param str
     * @return int
     */
    public static int toBinaryString(String str) {
        String result = "";
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            result += Integer.toBinaryString(strChar[i]);//ֱ�ӽ���ĸת��Ϊ��Ӧ��ASCII�����֣��ٽ�ASCII��ת��Ϊ��Ӧ�Ķ�������
        }
        return result.length();
    }
}