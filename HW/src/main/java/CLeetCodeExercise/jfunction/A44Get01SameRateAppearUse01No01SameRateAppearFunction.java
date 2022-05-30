package CLeetCodeExercise.jfunction;

/**
 * 使用 0,1 不等概率出现的黑盒函数，实现 0,1等概率出现的函数
 */
public class A44Get01SameRateAppearUse01No01SameRateAppearFunction {

    public static void main(String[] args) {
        int testTime = 10000000;
        int[] arr = new int[2];
        for (int i = 0; i < testTime; i++) {
            arr[get01SameRateAppearUse()]++;//遇到一个数字就让改数组进行自加运算；
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(i + "这个数，出现了" + arr[i] + "次");
        }
    }

    /**
     * 以0.84的概率返回0，以0.16的概率返回1。这两个概率实际是不知道的。
     * @return
     */
    public static int get01NoSameRateAppear() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    /**
     * 等概率的返回：0，1 函数
     * @return
     */
    public static int get01SameRateAppearUse(){
        int val1 = 0;
        int val2 = 0;
        do {
            val1 = get01NoSameRateAppear();
            val2 = get01NoSameRateAppear();
        }while (val1==val2);//取2次，如果第一次=第二次，重取。最后返回任意一个
        return val1;
    }
}