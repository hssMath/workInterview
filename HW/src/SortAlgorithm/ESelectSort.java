package SortAlgorithm;

import java.util.Arrays;

public class ESelectSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("选择排序前："+Arrays.toString(arr));
		selectSort(arr);
		System.out.println("选择排序前："+Arrays.toString(arr));
	}

	/**
	 * 
	 * @Description:选择排序
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
		}
	}
}	
