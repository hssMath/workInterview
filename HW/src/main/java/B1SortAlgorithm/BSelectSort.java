package B1SortAlgorithm;

import java.util.Arrays;
/**
 * ���Կ�����ð��������Ż�
 */
public class BSelectSort {
	public static void main(String[] args) {
		int []arr = new int[] {3,4,2,6,5,8,1,0,9};
		System.out.println("ѡ������ǰ��"+Arrays.toString(arr));
		selectSortASC(arr);
		System.out.println("ѡ�������"+Arrays.toString(arr));
	}

	/**
	 * ˼·��
	 * 	1��ѭ���������õ�1���͵�2���ȣ��ѽ�С�������±�Ϊ0��λ�ã������±�Ϊ0��Ԫ����ʣ���Ԫ�ض��Ƚ�һ�Σ��±�Ϊ0��Ԫ��Ϊ�������Сֵ��
	 * 	2�����õ�2����������ʣ�µ����ȣ��ѵڶ�����֮�����С�����ڵڶ���λ�ã�
	 * 	3��...ֱ���������У��������
	 * @Description:ѡ������
	 * @date:2020��2��11��
	 */
	public static void selectSortASC(int[] arr) {
		for (int i = 0; i <= arr.length-2; i++) {
			for (int j = i + 1; j <= arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
	}
}
