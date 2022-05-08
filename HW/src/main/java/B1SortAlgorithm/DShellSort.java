package B1SortAlgorithm;

import java.util.Arrays;

public class DShellSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("希尔排序前："+Arrays.toString(arr));
		shellSort(arr);
		System.out.println("希尔排序前："+Arrays.toString(arr));
	}
	/**
	 * 
	 * @Description:希尔排序
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020年2月11日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void shellSort(int[] arr) {
		int k =1;
		for (int d = arr.length/2; d > 0; d/=2) {//遍历所有的步长，直到的d>0
			
			for (int i = d; i < arr.length; i++) {//遍历所有元素：为了给下一步挨着比较做准备
				for (int j = i-d; j >= 0; j-=d) {//遍历本组所有元素：从大到小通过减的方式实现"步长"内多元素大小比较
					if (arr[j]>arr[j+d]) {//当前元素>加上步长后的那个元素
						int temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
			
			System.out.println("第"+k+"次排序"+Arrays.toString(arr));
			k++;
		}
	}
}
