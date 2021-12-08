package SortAlgorithm;

import java.util.Arrays;

public class ABubbleSort {
	public static void main(String[] args) {
		int []arr = new int[]{7,6,5,8,9,10,4,3,2};
		System.out.println("冒泡排序前："+Arrays.toString(arr));//数组打印为字符串可以直接使用：Arrays.toString(arr)
		arr = ABubbleSortSmallToBigTest(arr);
		System.out.println("冒泡（小->大）排序后："+Arrays.toString(arr));
		arr = ABubbleSortBigToSmallTest(arr);
		System.out.println("冒泡（大->小）排序后："+Arrays.toString(arr));
	}
	
	/**
	 * 
	 * @Description:冒泡（小->大）排序
	 * @param:@param arr
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2020年1月28日
	 * @return:int[] 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static int[] ABubbleSortSmallToBigTest(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {//比较的轮数：下标从0开始，最后一个原色的下标为n-1。
			for (int j = 0; j < arr.length-1-i; j++) {//每一轮比较的次数:从下标0开始，截至n-1-i。每一个循环结束，最后一个位置最大or最小。故循环次数为arr.length-1-i。
				if (arr[j]>arr[j+1]) {//每一轮都从0下标元素与0+1元素比较，交换位置。
					int k = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	/**
	 *
	 * @Description:冒泡（大->小）排序
	 * @param:@param arr
	 * @param:@return
	 * @author:heshuanshuan
	 * @date:2020年1月28日
	 * @return:int[]
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static int[] ABubbleSortBigToSmallTest(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {//比较的轮数：下标从0开始，最后一个原色的下标为n-1。
			for (int j = 0; j < arr.length-1-i; j++) {//每一轮比较的次数:从下标0开始，截至n-1-i。每一个循环结束，最后一个位置最大or最小。故循环次数为arr.length-1-i。
				if (arr[j]<arr[j+1]) {//每一轮都从0下标元素与0+1元素比较，交换位置。
					int k = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
}
