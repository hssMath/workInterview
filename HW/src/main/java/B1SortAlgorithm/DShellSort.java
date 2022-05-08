package B1SortAlgorithm;

import java.util.Arrays;

public class DShellSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("ϣ������ǰ��"+Arrays.toString(arr));
		shellSort(arr);
		System.out.println("ϣ������ǰ��"+Arrays.toString(arr));
	}
	/**
	 * 
	 * @Description:ϣ������
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020��2��11��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void shellSort(int[] arr) {
		int k =1;
		for (int d = arr.length/2; d > 0; d/=2) {//�������еĲ�����ֱ����d>0
			
			for (int i = d; i < arr.length; i++) {//��������Ԫ�أ�Ϊ�˸���һ�����űȽ���׼��
				for (int j = i-d; j >= 0; j-=d) {//������������Ԫ�أ��Ӵ�Сͨ�����ķ�ʽʵ��"����"�ڶ�Ԫ�ش�С�Ƚ�
					if (arr[j]>arr[j+d]) {//��ǰԪ��>���ϲ�������Ǹ�Ԫ��
						int temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
			
			System.out.println("��"+k+"������"+Arrays.toString(arr));
			k++;
		}
	}
}
