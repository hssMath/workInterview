import java.util.Scanner;

/**
 * 
 * @decription:BSortAlgorithm
 * @class_name：	最少分发子弹的数目
 * @author hss
 * @author：heshuanshuan 
 * @date 2020年2月19日
 */
public class A8_MinDistributionBullets20200214 {
	@SuppressWarnings({ "resource", "unlikely-arg-type", "unused" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String intput  = in.nextLine();
		String[] arrString = intput.toString().split(" ");
		int[] arrInt = new int[arrString.length];
		for (int i = 0; i < arrString.length; i++) {
			arrInt[i] = Integer.parseInt(arrString[i]);
		}
		getNum(arrInt);
    }
	
	/**
	 * 
	 * @Description:(作用)
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020年2月19日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void getNum(int[] arr) {
		int total  = arr.length;//子弹总数
        for (int i = 1; i < arr.length; i++) {//遍历所有的数字
        	if (arr[i-1]>arr[i]) {//当前数(arr[i])>前一个(arr[i-1])
        		int tempValue = arr[i];//存储当前元素
        		int j;
        		for (j = i-1; j>=0 && arr[j]>tempValue;j--) {//遍历当前数字前面
        			arr[j+1]= arr[j];
        		}
        		arr[j+1] =  tempValue;//把临时变量（外层for循环的当前元素）赋给不满足条件的后一个元素值：此时temp就是最小值
        	}
        }
        for (int i = 0; i < arr.length-1; i++) {
        	if (arr[i]<=arr[i+1]) {
        		total++;
        	}
        }
        System.out.println(total);
	}
}
