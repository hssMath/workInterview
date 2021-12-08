package SortAlgorithm;

import java.util.Arrays;

public class ABubbleSort {
	public static void main(String[] args) {
		int []arr = new int[]{7,6,5,8,9,10,4,3,2};
		System.out.println("ð������ǰ��"+Arrays.toString(arr));//�����ӡΪ�ַ�������ֱ��ʹ�ã�Arrays.toString(arr)
		arr = ABubbleSortSmallToBigTest(arr);
		System.out.println("ð�ݣ�С->�������"+Arrays.toString(arr));
		arr = ABubbleSortBigToSmallTest(arr);
		System.out.println("ð�ݣ���->С�������"+Arrays.toString(arr));
	}
	
	/**
	 * 
	 * @Description:ð�ݣ�С->������
	 * @param:@param arr
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2020��1��28��
	 * @return:int[] 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static int[] ABubbleSortSmallToBigTest(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {//�Ƚϵ��������±��0��ʼ�����һ��ԭɫ���±�Ϊn-1��
			for (int j = 0; j < arr.length-1-i; j++) {//ÿһ�ֱȽϵĴ���:���±�0��ʼ������n-1-i��ÿһ��ѭ�����������һ��λ�����or��С����ѭ������Ϊarr.length-1-i��
				if (arr[j]>arr[j+1]) {//ÿһ�ֶ���0�±�Ԫ����0+1Ԫ�رȽϣ�����λ�á�
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
	 * @Description:ð�ݣ���->С������
	 * @param:@param arr
	 * @param:@return
	 * @author:heshuanshuan
	 * @date:2020��1��28��
	 * @return:int[]
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static int[] ABubbleSortBigToSmallTest(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {//�Ƚϵ��������±��0��ʼ�����һ��ԭɫ���±�Ϊn-1��
			for (int j = 0; j < arr.length-1-i; j++) {//ÿһ�ֱȽϵĴ���:���±�0��ʼ������n-1-i��ÿһ��ѭ�����������һ��λ�����or��С����ѭ������Ϊarr.length-1-i��
				if (arr[j]<arr[j+1]) {//ÿһ�ֶ���0�±�Ԫ����0+1Ԫ�رȽϣ�����λ�á�
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
