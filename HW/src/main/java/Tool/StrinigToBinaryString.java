package Tool;

public class StrinigToBinaryString {
    /**
     * 将字母转换为对应的二进制码
     * @param str
     * @return int
     */
    public static int toBinaryString(String str) {
        String result = "";
        char[] strChar = str.toCharArray();
        for (int i = 0; i < strChar.length; i++) {
            result += Integer.toBinaryString(strChar[i]);//直接将字母转换为对应的ASCII码数字，再将ASCII码转换为对应的二进制码
        }
        return result.length();
    }
}