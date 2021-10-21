package BSortAlgorithm;

import java.util.Arrays;

public class ABubbleSort {
	public static void main(String[] args) {
		int []arr = new int[]{2,8,5,8,9,7};
		System.out.println("ð������ǰ��"+Arrays.toString(arr));
		arr = ABubbleSortTest(arr);
		System.out.println("ð�������"+Arrays.toString(arr));
	}
	
	/**
	 * 
	 * @Description:ð������
	 * @param:@param arr
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2020��1��28��
	 * @return:int[] 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static int[] ABubbleSortTest(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {//�Ƚϵ�����
			for (int j = 0; j < arr.length-1-i; j++) {//ÿһ�ֱȽϵĴ���
				if (arr[j]>arr[j+1]) {//ÿһ�ֶ���0�±�Ԫ����0+1Ԫ�رȽ�
					int k = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k; 
				}
			}
		}
		return arr;
	}
}
