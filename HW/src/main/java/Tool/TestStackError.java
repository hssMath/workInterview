package Tool;

/**
 * -Xss256k ������ջ�ڴ�Ĵ�С
 */
public class TestStackError {
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}