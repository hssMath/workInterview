package ZTest;

public class FullCpu {
    public static void main(String[] args) {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                }
            }).start();
        }
    }
}













