package CLeetCodeExercise.ebinarycal;

public class A000SwapNumbet {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(9));

        //实现数组的翻倍或者减半
        System.out.println(9 >> 1);
        System.out.println(9 << 1);
        int a = 4, b = 5;
        System.out.println("原始数据：a:" + a + "，b:" + b);

        //通过中间临时变量，获得交换位置后的结果
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a + "，b:" + b);

        //通过2个变量之和，先和-b得a，再和-a得b，获得交换位置后的结果。
        a = a + b;//先获得2数之和，然后通过:和-a赋得b；和-b得a。
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + "，b:" + b);

        /**
         * 先对2个变量进行异或运算，先将结果与b进行异或运算得b，再将结果与b进行异或运算得a，获得交换位置后的结果。
         * 说明：
         *      1、任何数与0异或运算，等于任何数；
         *      2.异或运算满足交换律。
         */
        a = a ^ b;  //0100^0101 => 0001
        b = a ^ b;//b=(a ^ b) ^ b = a ^（b ^ b）= a   0001^0000 => 0001
        a = a ^ b;//a=(a ^ b) ^ a = (a ^ a) ^ b = b   0000^0001 => 0001
        System.out.println("a:" + a + "，b:" + b);
    }
}
