package Test;

//斐波那契数列
public class TestDigui {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 20; i++) {
            System.out.println(i + ":" + function(i));
        }
    }

    public static int function(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return function(x - 1) + function(x - 2);
        }
    }
}
