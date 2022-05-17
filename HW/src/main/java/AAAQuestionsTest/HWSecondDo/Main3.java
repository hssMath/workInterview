package AAAQuestionsTest.HWSecondDo;

import java.util.Scanner;

/**
 * 华为机试题：
 * 3、solo 和 koko 是两兄弟，分一堆积木，每块积木有自己的重量。现在他们将积木分成两堆，弟弟 koko 还小只会将数字转化为二进制进行计算，而且总是忘记进位。
 * 弟弟 koko 按照他计算的方式要求两堆积木重量相等，要不然就会哭。哥哥 solo 进行分积木希望尽量给弟弟少分，并且不让弟弟哭。eg：弟弟计算方式（难度3星）
 *   1100      十进制  --12
 *  +0101      十进制  --5
 * ———---
 *   1001      十进制  --9
 *
 * 输入：输入的第一行是一个整数N(2 ≤ N ≤ 15)，表示有多少块积木。第二行包含N个用空格分开的整数Ci (1 ≤ Ci ≤ 106)，表示第i块积木的重量。
 * 输出：如果能让 koko 不哭，输出 Solo 所能获得的积木的总重量，否则输出“NO”。
 */
public class Main3 {
    /**
     * 分析：koko的加法不进位，显然是在做异或运算(^)。
     * 1 ^ 1 = 0
     * 0 ^ 1 = 1
     * 1 ^ 0 = 1
     * 0 ^ 0 = 0
     * 1、转换思路：
     *      2.1 由于分积木成功的先决条件是 koko 和 solo 两方拥有相同重量的积木，也就是说，分成两堆数各自进行异或运算，运算到最后，剩下两个相等的数，那么对于相同的两个数，
     *          再做一次异或运算，结果是0。因此，对于判断是否能成功分积木，可以将所有的数执行两两取最小进行异或运算，判断最终结果是否为0即可，为0即意味着分积木成功，否则失败；
     *      2.2 那Solo怎么拿到最多的积木？很简单，只需要让koko拿最少的积木就行，在分积木成功的情况下，只需要将所有积木中重量最小的积木分给koko即可，因为剩下的积木的总重量经过异或，
     *          最终肯定会等于koko拿到积木的重量，因此只需找出所有数中最小的数以及所有数之和即可，最终Solo分得的积木的重量就=积木的总重量-最小值。
     *      2.3 最终转换为代码逻辑，只需要遍历一次数组，取出第一个为标准数与不断的与Min(标准数,下一个数)的进行异或运算和所有值之和，就能算出Solo所能分得的积木的重量。
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int num = Integer.valueOf(sc.nextLine().trim());//获得总积木数
            int[] numArr = new int[num];//定义一个积木重量的数组
            String[] numStrArr = sc.nextLine().trim().split(" ");//初始化积木重量的数组
            for (int i = 0; i < num; i++) {
                numArr[i] = Integer.valueOf(numStrArr[i]);//将积木的字符串数组改为整数数组
            }
            if (numArr.length == 0 || numArr.length == 1) {//如果积木数量=0或者1，两个人获得的积木总重量肯定“不相等”，此时弟弟肯定会哭，输出NO。
                System.out.println("NO");
                return;
            }
            if (numArr.length == 2 && numArr[0] != numArr[1]) {//如果积木数量=2，并且2块积木的重量不相等，两个人获得的积木总重量也肯定“不相等”，此时弟弟肯定会哭，输出NO。
                System.out.println("NO");
                return;
            }

            //下面进行积木数量>=3的处理
            int min = numArr[0];//获取重量数组中第一个数字为标准数依次与后面的所有数进行异或运算。
            int sum = min;//遍历一次数组时，用来记录积木的总数量
            for (int i = 1; i < numArr.length; i++) {//遍历一次数组
                sum = sum + numArr[i];//借用一次数组的遍历获得所有积木的总重量
                if (min > numArr[i]) {//借用一次数组的遍历：因为哥哥 solo 进行分积木希望尽量给弟弟少分，故将标准数重量不断的与积木重量数组中的从第二块积木开始比较重量大小，将重量小的积木与初始积木重量进行异或运算。
                    min = numArr[i];
                }
                min ^= numArr[i];
            }
            if (min != 0) {
                System.out.println("NO");//结果不为0,则无法“均分”，分积木失败。
            } else {//如果最后异或结果=0，可以均分，分积木成功。
                System.out.println(sum - min);
            }
        }
    }
}
