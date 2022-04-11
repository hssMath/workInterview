package FirstWrittenTest;

import java.util.Scanner;

public class TestScannerLine {
	/**
	 * 控制台输入一行以空格为分隔符的纯数字
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String intput  = in.nextLine();
		String[] arr = intput.toString().split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		in.close();
	}
}
