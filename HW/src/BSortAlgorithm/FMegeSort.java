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
	 * @Description:�鲢����
	 * @param:@param arr
	 * @param:@param low
	 * @param:@param high   
	 * @author:heshuanshuan
	 * @date:2020��2��13��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void mergeSort(int[] arr,int low,int high) {
		int middle = (high+low)/2;
		if (low<high) {
			mergeSort(arr, low, middle);//�������:�������λ�õ��м�λ��
			mergeSort(arr, middle+1, high);//�����ұ�:�������м�λ�õ�����λ��
			mege(arr, low, middle, high);//�鲢
		}
	}
	/**
	 * @Description���鲢����
	 * @param:@param arr
	 * @param:@param low
	 * @param:@param moddlie
	 * @param:@param high   
	 * @author:heshuanshuan
	 * @date:2020��2��13��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void mege(int[] arr,int low,int moddlie,int high) {
		int[] temp = new int[high-low+1];//���ڴ洢�鲢�����ʱ����
		int i = low;//��¼��1����������Ҫ������ʼ���±�
		int j = moddlie+1;//��¼��2����������Ҫ������ʼ���±�
		int index = 0;	//���ڼ�¼����ʱ�����д�ŵ��±�
		
		while (i<= moddlie && j<=high) {//����2������ȡ����С���������뵽��ʱ������
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
		
		//���������������
		while (i<=moddlie) {
			temp[index] = arr[i];
			i++;
			index++;
		}
		//���������ұ�����
		while (j<=high) {
			temp[index] = arr[j];
			j++;
			index++;
		}
		System.out.println("temp2:"+Arrays.toString(temp));
		//����ʱ�����е��������´���ԭ����
		for (int k = 0; k < temp.length; k++) {
			arr[k+low] = temp[k];
		}
	}
}
