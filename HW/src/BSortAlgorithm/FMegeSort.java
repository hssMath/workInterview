package BSortAlgorithm;

import java.util.Arrays;

public class FMegeSort {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,5,	2,4,6,8,10};
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
//		mege(arr, 0, 2 , arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 
	 * @Description:归并排序
	 * @param:@param arr
	 * @param:@param low
	 * @param:@param high   
	 * @author:heshuanshuan
	 * @date:2020年2月13日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void mergeSort(int[] arr,int low,int high) {
		int middle = (high+low)/2;
		if (low<high) {
			mergeSort(arr, low, middle);//处理左边:从数组低位置到中间位置
			mergeSort(arr, middle+1, high);//处理右边:从数组中间位置到结束位置
			mege(arr, low, middle, high);//归并
		}
	}
	/**
	 * @Description：归并排序
	 * @param:@param arr
	 * @param:@param low
	 * @param:@param moddlie
	 * @param:@param high   
	 * @author:heshuanshuan
	 * @date:2020年2月13日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static void mege(int[] arr,int low,int moddlie,int high) {
		int[] temp = new int[high-low+1];//用于存储归并后的临时数组
		int i = low;//记录第1个数组中需要遍历开始的下标
		int j = moddlie+1;//记录第2个数组中需要遍历开始的下标
		int index = 0;	//用于记录在临时数组中存放的下标
		
		while (i<= moddlie && j<=high) {//遍历2个数组取出最小的数，放入到临时数组中
			if (arr[i]<=arr[j]) {
				temp[index] = arr[i];
				i++;
			}else {
				temp[index] = arr[j];
				j++;
			}
			index++;
		}
		System.out.println("temp1:"+Arrays.toString(temp));
		
		//处理多余的左边数据
		while (i<=moddlie) {
			temp[index] = arr[i];
			i++;
			index++;
		}
		//处理多余的右边数据
		while (j<=high) {
			temp[index] = arr[j];
			j++;
			index++;
		}
		System.out.println("temp2:"+Arrays.toString(temp));
		//把临时数组中的数据重新存入原数组
		for (int k = 0; k < temp.length; k++) {
			arr[k+low] = temp[k];
		}
	}
}
