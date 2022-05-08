package B1SortAlgorithm;

import java.util.Arrays;

public class ABubbleSort {
	public static void main(String[] args) {
		int []arr1 = new int[]{7,6,5,8,9,10,4,3,2};
		int []arr2 = new int[]{7,6,5,8,9,10,4,3,2};
		System.out.println("ð������ǰ��"+Arrays.toString(arr1));
		ABubbleSortDescTest(arr1);
		System.out.println("ð�����������"+Arrays.toString(arr1));
		ABubbleSortAscTest(arr2);
		System.out.println("ð�ݽ��������"+Arrays.toString(arr2));
	}
	
	/**
	 * ˼·����Ҫ���õ������ݽ�������ð������ʱ�临�Ӷ�O(n^2)��
	 *  1����һ�ֿ�ʼ����ȡ��1Ԫ�����2��Ԫ�ؽ��бȽϣ���2��Ԫ�����3��Ԫ�ؽ��бȽϣ�...��������2��Ԫ���뵹����1��Ԫ�ؽ��бȽϣ���ķź��棬��һ�ֱȽ����֮�����һ��Ԫ��Ϊ���ֵ����һ�ֱȽϵĴ��������鳤��-1��
	 *  2���ڶ��ֱȽϣ������õ�1��Ԫ�����2��Ԫ�ؽ��бȽϣ���2��Ԫ�����3��Ԫ�ؽ��бȽϣ�...��������3��Ԫ���뵹����2��Ԫ�ؽ��бȽϣ���Ϊ��һ�ֱȽ�֮������ֵ�Ѿ������һλ�ˣ�û��Ҫ�ٶ�Ƚ�һ���ˡ��ڶ��ֵıȽϴ���Ϊ�����鳤��-2.
	 *  3��...ֱ��������ѭ������Ԫ�ص����һ��λ��ʱ������ѭ����
	 * ˵����
	 * 	1���Ƚ����֮��ÿ�ִ�����n-1��n-��...��2,1���ȽϵĴ�����һ������Ϊ1�ĵȲ����У����еĺ�ȥ����С�����ӣ���ʱ�临�Ӷȣ�O(n^2)��
	 * 	2�������ѭ����������Ƚϣ����ƱȽϵĵĴ������ڲ�ѭ���������ֵıȽϲ�����λ�ã�ÿ�ζ������ڵ�2��Ԫ�ؽ��бȽ�
	 * 	3���������̨�������ֱ��ʹ�ã�Arrays.toString(arr)
	 * @Description:ð����������
	 * @date:2020��1��28��
	 */
	public static void ABubbleSortDescTest(int[] arr) {
		//���ѭ��������Ҫ�ȽϵĴ�����һ����n-1�Σ������ȱȽϺ󽻻�����ߵ�Ԫ��ֻ�ܵ������ڶ���Ԫ��(�±꣺arr.length-2)��ÿһ�ֱȽ���֮�����һ��λ��Ϊ���ֵ������Сֵ��
		for (int i = 0; i <= arr.length-2; i++) {
			//�ڲ�ѭ������ð�ݣ���Ϊÿ���һ�����ѭ��������ĺ���ͻ��һ����С������������У���˿��Բ��ñȽ�
			for (int j = 0; j <= arr.length-2-i; j++) {//��Ϊÿ�αȽ�֮��,ĩβ�����ֶ���ÿһ�ֵļ�ֵ��...��Ϊ�˼��ٱȽϵĴ�������������Ч�ʣ������±�ֻ�ܵ���arr.length-2-i��
				if (arr[j]>arr[j+1]) {//ÿһ�ֱȽϣ���ķź��档
					int k = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
	}
	/**
	 *
	 * @Description:ð�ݽ�������
	 * @date:2020��1��28��
	 */
	public static void ABubbleSortAscTest(int[] arr) {
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
	}
}
