package Tool;

/**
 * -Xss256k ：设置栈内存的大小
 */
public class TestStackError {
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}