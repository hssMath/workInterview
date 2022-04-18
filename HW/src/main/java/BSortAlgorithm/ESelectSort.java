package BSortAlgorithm;

import java.util.Arrays;

public class ESelectSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("选择排序前："+Arrays.toString(arr));
		selectSort(arr);
		System.out.println("选择排序前："+Arrays.toString(arr));
//		PrintlnString(arr);
	}

	/**
	 * 
	 * @Description:选择排序
	 * 先用第一个和第二个比，把小的放第一位置，再和剩下的所有的都比一次，其结果是第一个位置上的数是最小的；再用第二个数与其他剩下的数比，把次小的放第二个位置；借着把第三小放到第三个位置，直至排完所有
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020年2月11日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {//遍历所有的数
			int minIndex = i;//第一个为记录的最小的数
			for (int j = i+1; j < arr.length; j++) {//把当前遍历的数和后面所有的数依次进行比较，并记录下最小数的下标
				if (arr[minIndex]>arr[j]) {//如果后面的数比记录的最小的数小
					minIndex = j;//记录下最小数的下标
				}	
			}
			//如果最小的数和当前遍历数的下标不一致:说明下标为minIndex的数比当前遍历的数更小
			if (i!=minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	/**
	 *
	 *@name    数组的遍历输出
	 *@description 相关说明：如果不是最后一个，则打印一个元素和一个逗号；若是最后一个则只打印一个右中括号
	 *@time    创建时间:2017-3-14下午08:42:44
	 *@param arr
	 *@author   何拴拴
	 *@history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void PrintlnString(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.println(arr[i]+"]");
			}
		}
	}
}	
