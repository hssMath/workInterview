package ALineConstract;
public class GRecursive {
	public static void main(String[] args) {
		print(8);
	}
	
	/**
	 * 
	 * @Description:递归-作用是最外层到最里层调用，再到最外层。
	 * 		特点：
	 * 			1.无直接跳出循环关键字，但有间接跳出逻辑标志
	 * @param:@param i   
	 * @author:heshuanshuan
	 * @date:2020年1月14日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void print(int i) {
		if (i>0) {
			System.out.println(i);
			print(i-1);
		}
	}
}
