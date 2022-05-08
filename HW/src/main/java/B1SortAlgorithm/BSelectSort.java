package B1SortAlgorithm;

import java.util.Arrays;
/**
 * 可以看成是冒泡排序的优化
 */
public class BSelectSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("选择排序前："+Arrays.toString(arr));
		selectSortASC(arr);
		System.out.println("选择排序后："+Arrays.toString(arr));
	}

	/**
	 * 思路：
	 * 	1、循环遍历，用第1个和第2个比，把较小数放在下标为0的位置，再用下标为0的元素与剩余的元素都比较一次，下标为0的元素为数组的最小值。
	 * 	2、再用第2个数与其他剩下的数比，把第二个数之后的最小数放在第二个位置；
	 * 	3、...直至排完所有，完成排序。
	 * @Description:选择排序
	 * @date:2020年2月11日
	 */
	public static void selectSortASC(int[] arr) {
		for (int i = 0; i <= arr.length-2; i++) {
			for (int j = i + 1; j <= arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
	}
}
