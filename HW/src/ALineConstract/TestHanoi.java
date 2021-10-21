package ALineConstract;
/**
 * 
 * @decription:汉诺塔问题
 * @class_name：TestHanoi
 * @author hss
 * @author：heshuanshuan 
 * @date 2020年1月15日
 */
public class TestHanoi {
	public static void main(String[] args) {
		moveHanoi(3, "A", "B", "C");
	}
	private static void moveHanoi(int n,String from,String in,String to) {
		int i = 0;
		if (n==1) {//只有一个盘子
			System.out.println(i+":第"+n+"个盘子从"+from+"移动到"+to);
		}else {
			int j = 0;
			
			moveHanoi(n-1, from, to, in);//移动上面所有的盘子到中间位置
			j+=1;
			System.out.println(j+":第"+n+"个盘子从"+from+"移动到"+to);
			
			j+=1;
			moveHanoi(n-1, in, from, to);//把所有的盘子从中间位置移动到目标位置
			System.out.println(j+":第"+n+"个盘子从"+from+"移动到"+to);
		}
	}
}
