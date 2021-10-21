package SortAlgorithm;

import java.util.Arrays;

public class ESelectSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("ѡ������ǰ��"+Arrays.toString(arr));
		selectSort(arr);
		System.out.println("ѡ������ǰ��"+Arrays.toString(arr));
	}

	/**
	 * 
	 * @Description:ѡ������
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020��2��11��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {//�������е���
			int minIndex = i;//��һ��Ϊ��¼����С����
			for (int j = i+1; j < arr.length; j++) {//�ѵ�ǰ���������ͺ������е������ν��бȽϣ�����¼����С�����±�
				if (arr[minIndex]>arr[j]) {//�����������ȼ�¼����С����С
					minIndex = j;//��¼����С�����±�
				}	
			}
			//�����С�����͵�ǰ���������±겻һ��:˵���±�ΪminIndex�����ȵ�ǰ����������С
			if (i!=minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}	
