package Test;
public class HRecursive {
	public static void main(String[] args) {
		print(8);
	}
	
	/**
	 * @Description:递归-作用是最外层到最里层调用，再到最外层。
	 * 特点：
	 * 		1、存在终止条件，存在递归终止条件：无直接跳出循环关键字，但有间接跳出逻辑标志
	 * 		2、优点：代码简洁，表达能力强；缺点：有过多的栈操作，不建议使用。
	 * @date:2020年1月14日
	 */
	public static void print(int i) {
		if (i>0) {
			System.out.println(i);
			print(i-1);
		}else {
			System.out.println("递归方法执行完毕");
			return ;
		}
	}
}
