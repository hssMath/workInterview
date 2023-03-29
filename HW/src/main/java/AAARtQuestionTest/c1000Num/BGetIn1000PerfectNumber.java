package AAARtQuestionTest.c1000Num;

/**
 * 获取1000以内的完数
 */
public class BGetIn1000PerfectNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int factor = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    factor += j;
                }
            }
            if (i == factor) {
                System.out.print(i+" ");
            }
        }
    }
}
