package BSortAlgorithm;

import java.util.Arrays;

public class CInsetSort {
	public static void main(String[] args) {
		int []arr = new int[]{2,1,5,3,6,9};
		System.out.println("插入排序前："+Arrays.toString(arr));
		insertSort(arr);
		System.out.println("插入排序后："+Arrays.toString(arr));
		
	}
	
	/**
	 * 
	 * @Description:插入排序
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020年2月9日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void insertSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {//遍历所有的数字
			if (arr[i-1]>arr[i]) {//当前数(arr[i])>前一个(arr[i-1])
				int temp = arr[i];//存储当前元素
				int j;
				for (j = i-1; j>=0 && arr[j]>temp;j--) {//遍历当前数字前面
					arr[j+1]= arr[j];
				}
				arr[j+1] =  temp;//把临时变量（外层for循环的当前元素）赋给不满足条件的后一个元素值：此时temp就是最小值
			}
		}
	}
}
