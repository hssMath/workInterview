package CLeetCodeExercise.jfunction;

/**
 * 根据 F15 等待率得到 F17 上的数：首先得到 [0,1)概率发生器，计算需要几个二进制位才可以放下，然后进行左移然后求和最后转为整形，再+1即可实现。
 */
public class A43GetF17ByF15 {
    public static void main(String[] args) {
        int testTime = 10000000;
        int[] arr = new int[8];
        for (int i = 0; i < testTime; i++) {
            arr[getF17UseGetF07()]++;//遇到一个数字就让改数组进行自加运算；
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + "这个数，出现了" + arr[i] + "次");
        }
    }

    /**
     * 等概率返回 [1,5) 上的随机数字；该函数不可再改，是一个黑盒函数，只能被调用使用。
     * 1、2、3、4、5 的概率分别为：20%
     *
     * @return
     */
    public static int getf15() {
        return (int) (Math.random() * 5) + 1;
    }

    /**
     * 先使用 getf15 构造一个等概率返回：0~1 的函数
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
     * 根据 get01 等概率的得到最终结果在 000~111 之间的数，得到 0-7 等待率返回
     *
     * @return
     */
    public static int getF07Use01() {
        return (get01() << 2) + (get01() << 1) + (get01() << 0);
    }

    /**
     * 根据 getF07Use01 等概率的 getF06函数，然后将结果进行+1操作，进而得到 1~7 函数。
     * 注意：
     * 1、目标是1~7等概率的获取：所以只能先取到0~6，再+1.
     * 2、错误：使用 getF07Use01*6+1得到是1和7是等概率的，
     *
     * @return
     */
    public static int getF17UseGetF07() {
        int ans = 0;
        do {
            ans = (get01() << 2) + (get01() << 1) + (get01() << 0);//位运算的加法是按照位运算进行的，结果会转化为10进制的整数
        } while (ans == 7);
        return ans + 1;
    }
}
