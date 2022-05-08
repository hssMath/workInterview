package CLeetCodeExercise.ebinarycal;

public class A000BinaryShow {
    /**
     * 1248
     * @param args
     */
    public static void main(String[] args) {
        int num4 = 4;
        int num6 = 6;
        System.out.println(num4+"二进制："+Integer.toBinaryString(num4));
        System.out.println(num6+"二进制："+Integer.toBinaryString(num6));

        //正数右移，高位补0；负数右移，高位补1；低位都补0。
        System.out.println(num4+"右移1位："+Integer.toBinaryString(num4>>1));
        //有符号左移符号保留，正数高位补0；负数左移，高位补1；低位都补0。
        System.out.println(num4+"左移1位："+Integer.toBinaryString(num4<<1));
    }
}
