package BSortAlgorithm;

import java.util.Arrays;

public class CInsetSort {
	public static void main(String[] args) {
		int []arr = new int[]{2,1,5,3,6,9};
		System.out.println("��������ǰ��"+Arrays.toString(arr));
		insertSort(arr);
		System.out.println("���������"+Arrays.toString(arr));
		
	}
	
	/**
	 * 
	 * @Description:��������
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020��2��9��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void insertSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {//�������е�����
			if (arr[i-1]>arr[i]) {//��ǰ��(arr[i])>ǰһ��(arr[i-1])
				int temp = arr[i];//�洢��ǰԪ��
				int j;
				for (j = i-1; j>=0 && arr[j]>temp;j--) {//������ǰ����ǰ��
					arr[j+1]= arr[j];
				}
				arr[j+1] =  temp;//����ʱ���������forѭ���ĵ�ǰԪ�أ����������������ĺ�һ��Ԫ��ֵ����ʱtemp������Сֵ
			}
		}
	}
}
