package SortAlgorithm;

import java.util.Arrays;

public class BQuickSort {

	public static void main(String[] args) {
		int []arr = new int[]{2,4,10,1,7,9};
		System.out.println("��������ǰ��"+Arrays.toString(arr));
		qucikSort(arr, 0, arr.length-1);
		System.out.println("���������"+Arrays.toString(arr));
	}
	/**
	 * 
	 * @Description:��������
	 * @param:@param arr
	 * @param:@param start
	 * @param:@param end   
	 * @author:heshuanshuan
	 * @date:2020��2��4��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	private static void qucikSort(int[] arr,int start,int end) {
		if (start<end) {
			int stard = arr[start];//�������еĵ�0��Ԫ����Ϊ��׼��
			int low = start;	//��¼��Ҫ������±�
			int high = end;		//��¼��Ҫ������±�	
			while (low<high) {//ѭ���ұȱ�׼��������ͱȱ�׼��С����
				while (low<high && stard<=arr[high]) {//�ұߵ�����>��׼�����ƶ��ұߵ��±� 
					high--;
				}
				arr[low]=arr[high];//ʹ���ұ�high�±�������滻����±�Ϊlow������
				
				while (low<high && arr[low]<stard ) {//�������<=��׼��
					low++;
				}
				arr[high]=arr[low];//ʹ������±�Ϊlow�������滻�ұ��±�Ϊhigh������
				
				//�ѱ�׼���������е�����λ�õ�Ԫ��
				arr[low] =stard;
				
				// �������бȱ�׼��С������
				qucikSort(arr, start,low);
//				System.out.println(Arrays.toString(arr));
				// �������бȱ�׼���������
				qucikSort(arr, low+1,end);
//				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
