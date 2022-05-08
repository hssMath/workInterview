package B1SortAlgorithm;

import java.util.Arrays;

public class FQuickSort {
	public static void main(String[] args) {
		int []arr = new int[]{2,4,10,1,7,9};
		System.out.println("快速排序前："+Arrays.toString(arr));
		qucikSort(arr, 0, arr.length-1);
		System.out.println("快速排序后："+Arrays.toString(arr));
	}
	/**
	 * 思路：双指针
	 * @Description:快速排序
	 * @param:@param arr 数组
	 * @param:@param start 指定数组的第一个元素的下标
	 * @param:@param end   指定数组的最后一个元素的下标
	 * @date:2020年2月4日
	 */
	private static void qucikSort(int[] arr,int start,int end) {
		if(start>=end) return;//如果没有元素或只有一个元素直接返回，因为一个元素已经有序，无需排序
		int low = start;	//第一个指针指向数组的第一个元素
		int high = end;		//第二个指针指向数组的最后一个元素
		int newstart = arr[(start+end)/2];//默认把数组中的第1个元素作为基准数

		while (low<high) {//循环找比标准数大的数和比标准数小的数
			while (low<high && newstart<=arr[high]) {//从最右边的指针开始找第一个大于基准数的索引：移动右边的下标
				high--;
			}
			arr[low]=arr[high];//使用右边high下标的数字替换左边下标为low的数字

			while (low<high && arr[low]<newstart ) {//左边数字<=标准数
				low++;
			}
			arr[high]=arr[low];//使用左边下标为low的数字替换右边下标为high的数字

			//把标准数给数组中低所在位置的元素
			arr[low] =newstart;

			// 处理所有比标准数小的数字
			qucikSort(arr, start,low);
			// 处理所有比标准数大的数字
			qucikSort(arr, low+1,end);
		}
	}

//	//快速排序
//	public void quickSort(int[] arr,int left,int right) {
//		//如果没有元素或只有一个元素直接返回，因为一个元素已经有序，无需排序
//		if(left>=right)	return;
//
//		int start = left;//第一个指针指向数组的第一个元素
//		//第二个指针指向数组的最后一个元素
//		int end = right;
//
//		//缓存直接选择的基准，大部分都是以第一个元素为基准
//		int temp = arr[start];
//		while(start<end) {
//			//从第二个指针开始找到第一个小于基准数的索引，
//			//因为循环退出的条件就是arr[end]<temp
//			while(start<end&&arr[end]>=temp)
//				end--;
//			//把找到的小于基准的数放在基准数的左边
//			if(start<end)
//				arr[start++] = arr[end];
//
//			//从第一个指针开始找第一个大于基准数的索引
//			while(start<end&&arr[start]<temp)
//				start++;
//			//把找到的大于基准的数放在基准数的右边
//			if(start<end)
//				arr[end--] = arr[start];
//		}
//		//把基准数放在中间，循环结束之后，基准数左边都比基准数小，基准数右边都比基准数大
//		arr[start] = temp;
//
//		//基准数左边进行快速排序
//		quickSort(arr, left, start-1);
//		//基准数右边进行快速排序
//		quickSort(arr, start+1, right);
//	}

}
