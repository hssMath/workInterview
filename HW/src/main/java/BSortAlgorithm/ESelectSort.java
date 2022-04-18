package BSortAlgorithm;

import java.util.Arrays;

public class ESelectSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("ѡ������ǰ��"+Arrays.toString(arr));
		selectSort(arr);
		System.out.println("ѡ������ǰ��"+Arrays.toString(arr));
//		PrintlnString(arr);
	}

	/**
	 * 
	 * @Description:ѡ������
	 * ���õ�һ���͵ڶ����ȣ���С�ķŵ�һλ�ã��ٺ�ʣ�µ����еĶ���һ�Σ������ǵ�һ��λ���ϵ�������С�ģ����õڶ�����������ʣ�µ����ȣ��Ѵ�С�ķŵڶ���λ�ã����Űѵ���С�ŵ�������λ�ã�ֱ����������
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
			System.out.println(Arrays.toString(arr));
		}
	}

	/**
	 *
	 *@name    ����ı������
	 *@description ���˵��������������һ�������ӡһ��Ԫ�غ�һ�����ţ��������һ����ֻ��ӡһ����������
	 *@time    ����ʱ��:2017-3-14����08:42:44
	 *@param arr
	 *@author   ��˩˩
	 *@history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void PrintlnString(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i!=arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.println(arr[i]+"]");
			}
		}
	}
}	
