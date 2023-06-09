package Test;
/**
 * @decription:斐波那契数列
 * @class_name：FiboracciSequence
 * @author hss
 * @author：heshuanshuan 
 * @date 2020年1月14日
 */
public class TestRecursiveFiboracciSequence {
	public static void main(String[] args) {
		System.out.println("1:"+fiboracci(1));
		System.out.println("2:"+fiboracci(2));
		System.out.println("3:"+fiboracci(3));
		System.out.println("4:"+fiboracci(4));
		System.out.println("5:"+fiboracci(5));
		System.out.println("6:"+fiboracci(6));
	}
	
	/**
	 * 斐波那契数列-递归方法
	 * @param i
	 * @return
	 */
	public static int fiboracci(int i) {
		if (i==1||i==2) {
			return 1;
		}else {
			return fiboracci(i-1)+fiboracci(i-2);
		}
	}
}
