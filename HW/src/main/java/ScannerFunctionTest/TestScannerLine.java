package ScannerFunctionTest;

import java.util.Scanner;

public class TestScannerLine {
	/**
	 * ����̨����һ���Կո�Ϊ�ָ����Ĵ�����
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String intput  = in.nextLine();
		String[] arr = intput.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		in.close();
	}
}
