package B1SortAlgorithm;

import java.util.Arrays;

public class FQuickSort {
	public static void main(String[] args) {
		int []arr = new int[]{2,4,10,1,7,9};
		System.out.println("��������ǰ��"+Arrays.toString(arr));
		qucikSort(arr, 0, arr.length-1);
		System.out.println("���������"+Arrays.toString(arr));
	}
	/**
	 * ˼·��˫ָ��
	 * @Description:��������
	 * @param:@param arr ����
	 * @param:@param start ָ������ĵ�һ��Ԫ�ص��±�
	 * @param:@param end   ָ����������һ��Ԫ�ص��±�
	 * @date:2020��2��4��
	 */
	private static void qucikSort(int[] arr,int start,int end) {
		if(start>=end) return;//���û��Ԫ�ػ�ֻ��һ��Ԫ��ֱ�ӷ��أ���Ϊһ��Ԫ���Ѿ�������������
		int low = start;	//��һ��ָ��ָ������ĵ�һ��Ԫ��
		int high = end;		//�ڶ���ָ��ָ����������һ��Ԫ��
		int newstart = arr[(start+end)/2];//Ĭ�ϰ������еĵ�1��Ԫ����Ϊ��׼��

		while (low<high) {//ѭ���ұȱ�׼��������ͱȱ�׼��С����
			while (low<high && newstart<=arr[high]) {//�����ұߵ�ָ�뿪ʼ�ҵ�һ�����ڻ�׼�����������ƶ��ұߵ��±�
				high--;
			}
			arr[low]=arr[high];//ʹ���ұ�high�±�������滻����±�Ϊlow������

			while (low<high && arr[low]<newstart ) {//�������<=��׼��
				low++;
			}
			arr[high]=arr[low];//ʹ������±�Ϊlow�������滻�ұ��±�Ϊhigh������

			//�ѱ�׼���������е�����λ�õ�Ԫ��
			arr[low] =newstart;

			// �������бȱ�׼��С������
			qucikSort(arr, start,low);
			// �������бȱ�׼���������
			qucikSort(arr, low+1,end);
		}
	}

//	//��������
//	public void quickSort(int[] arr,int left,int right) {
//		//���û��Ԫ�ػ�ֻ��һ��Ԫ��ֱ�ӷ��أ���Ϊһ��Ԫ���Ѿ�������������
//		if(left>=right)	return;
//
//		int start = left;//��һ��ָ��ָ������ĵ�һ��Ԫ��
//		//�ڶ���ָ��ָ����������һ��Ԫ��
//		int end = right;
//
//		//����ֱ��ѡ��Ļ�׼���󲿷ֶ����Ե�һ��Ԫ��Ϊ��׼
//		int temp = arr[start];
//		while(start<end) {
//			//�ӵڶ���ָ�뿪ʼ�ҵ���һ��С�ڻ�׼����������
//			//��Ϊѭ���˳�����������arr[end]<temp
//			while(start<end&&arr[end]>=temp)
//				end--;
//			//���ҵ���С�ڻ�׼�������ڻ�׼�������
//			if(start<end)
//				arr[start++] = arr[end];
//
//			//�ӵ�һ��ָ�뿪ʼ�ҵ�һ�����ڻ�׼��������
//			while(start<end&&arr[start]<temp)
//				start++;
//			//���ҵ��Ĵ��ڻ�׼�������ڻ�׼�����ұ�
//			if(start<end)
//				arr[end--] = arr[start];
//		}
//		//�ѻ�׼�������м䣬ѭ������֮�󣬻�׼����߶��Ȼ�׼��С����׼���ұ߶��Ȼ�׼����
//		arr[start] = temp;
//
//		//��׼����߽��п�������
//		quickSort(arr, left, start-1);
//		//��׼���ұ߽��п�������
//		quickSort(arr, start+1, right);
//	}

}
