package SortAlgorithm;

import java.util.Arrays;

public class BQuickSort {

	public static void main(String[] args) {
		int []arr = new int[]{2,4,10,1,7,9};
		System.out.println("快速排序前："+Arrays.toString(arr));
		qucikSort(arr, 0, arr.length-1);
		System.out.println("快速排序后："+Arrays.toString(arr));
	}
	/**
	 * 
	 * @Description:快速排序
	 * @param:@param arr
	 * @param:@param start
	 * @param:@param end   
	 * @author:heshuanshuan
	 * @date:2020年2月4日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	private static void qucikSort(int[] arr,int start,int end) {
		if (start<end) {
			int stard = arr[start];//把数组中的第0个元素作为标准数
			int low = start;	//记录需要排序的下标
			int high = end;		//记录需要排序的下标	
			while (low<high) {//循环找比标准数大的数和比标准数小的数
				while (low<high && stard<=arr[high]) {//右边的数字>标准数：移动右边的下标 
					high--;
				}
				arr[low]=arr[high];//使用右边high下标的数字替换左边下标为low的数字
				
				while (low<high && arr[low]<stard ) {//左边数字<=标准数
					low++;
				}
				arr[high]=arr[low];//使用左边下标为low的数字替换右边下标为high的数字
				
				//把标准数给数组中低所在位置的元素
				arr[low] =stard;
				
				// 处理所有比标准数小的数字
				qucikSort(arr, start,low);
//				System.out.println(Arrays.toString(arr));
				// 处理所有比标准数大的数字
				qucikSort(arr, low+1,end);
//				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
