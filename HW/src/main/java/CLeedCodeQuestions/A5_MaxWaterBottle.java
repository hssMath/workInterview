package CLeedCodeQuestions;

import java.util.Scanner;

public class A5_MaxWaterBottle {
    /**
     * 描述
     *      有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3
     *      个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
     * 输入描述：输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。
     * 输出描述：对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
     */
    public static void main(String[] args) {
//    解题思路1（简洁）：
//        这道题看起来比较复杂，三瓶换一瓶，如果只剩下最后两瓶那么跟老板借一瓶喝了变成三个空瓶，最后把赠送的一瓶还给老板。
//        但是从数学角度来说，开始count = 0；就是如果给定的数是偶数，每次减3加1相当于每次减2，count就要自加1，偶数减2计算到最后肯定是2，
//        也就是偶数瓶汽水最后都是剩下两瓶空瓶，这样就可以借一瓶变三个空瓶，还老板一个实瓶，恰好count==偶数/2；如果开始就是奇数瓶，那么最后就剩下一瓶实瓶，
//        一瓶实瓶不可以等价的借一瓶变成三个空瓶再还了，所以得浪费，那么问题又变成：奇数瓶-1=偶数瓶 的问题，又可以利用偶数瓶的方法解决。然而我们都知道，
//        在java语言中除法运算是向下取整的，即3/2 = 1，因而变相的解决了奇数瓶的问题。所以这道题用了比较取巧的方法，直接瓶数除以2。

//        Scanner s = new Scanner(System.in);
//        do {
//            int a = s.nextInt();
//            int count = 0;
//            if (a == 0)
//                return;
//            else if (a == 2)
//                System.out.println("1");
//            else if (a == 1)
//                System.out.println("0");
//            else {
//                count = a / 2;
//                System.out.println(count);
//            }
//        } while (s.hasNext());
//        s.close();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println(getNum(num));
            System.out.println(Drink(num));
        }
    }
    // 解题思路2（递归算法）：
    public static int Drink(int n) {
        if (n <= 0)
            return 0;
        else if (n == 3)
            return 1;
        else if (n == 2)
            return 1;
        else//此时表明对应为3的倍数，递归
        {
            int h = 0;
            h = n / 3;
            return h + Drink(n - 3 * h + h);
        }
    }

    /**
     *  解题思路3：正常算法
     *    若手中只有1个空瓶，则一瓶汽水也喝不到
     *    若手中有2个空瓶，则可以通过向Boss借一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板
     *    若手中有大于等于3个的空瓶，则可以先把能兑奖的汽水瓶兑完，喝完它，这样子手中剩下的空瓶数可以重复第一步与第二部进行递归计算
     */
    public static int getNum(Integer glass_bottom_num) {
        int count = 0;
        while (glass_bottom_num >= 3) {
            int temp = glass_bottom_num / 3;  //计算喝完整瓶=喝完后后剩下的空瓶
            count += temp;  //兑换的瓶数加上喝完之后的空瓶数
            int remainder = glass_bottom_num % 3;  //计算兑换完整瓶之后的空瓶数
            glass_bottom_num = remainder + temp;  //空瓶数 = 余数 + 商
        }
        if (glass_bottom_num == 2) {
            count += 1;
        }
        return count;
    }
}