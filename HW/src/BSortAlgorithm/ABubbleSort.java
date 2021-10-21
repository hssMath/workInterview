package BSortAlgorithm;

import java.util.Arrays;

public class ABubbleSort {
	public static void main(String[] args) {
		int []arr = new int[]{2,8,5,8,9,7};
		System.out.println("冒泡排序前："+Arrays.toString(arr));
		arr = ABubbleSortTest(arr);
		System.out.println("冒泡排序后："+Arrays.toString(arr));
	}
	
	/**
	 * 
	 * @Description:冒泡排序
	 * @param:@param arr
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2020年1月28日
	 * @return:int[] 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static int[] ABubbleSortTest(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {//比较的轮数
			for (int j = 0; j < arr.length-1-i; j++) {//每一轮比较的次数
				if (arr[j]>arr[j+1]) {//每一轮都从0下标元素与0+1元素比较
					int k = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k; 
				}
			}
		}
		return arr;
	}
}
