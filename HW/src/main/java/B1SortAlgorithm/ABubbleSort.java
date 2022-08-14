package B1SortAlgorithm;

import java.util.Arrays;

public class ABubbleSort {
    /**
     * ˼·����Ҫ���õ������ݽ�������ð������ʱ�临�Ӷ�O(n^2)��
     * 1����һ�ֿ�ʼ����ȡ��1Ԫ�����2��Ԫ�ؽ��бȽϣ���2��Ԫ�����3��Ԫ�ؽ��бȽϣ�...��������2��Ԫ���뵹����1��Ԫ�ؽ��бȽϣ���ķź��棬��һ�ֱȽ����֮�����һ��Ԫ��Ϊ���ֵ����һ�ֱȽϵĴ��������鳤��-1��
     * 2���ڶ��ֱȽϣ������õ�1��Ԫ�����2��Ԫ�ؽ��бȽϣ���2��Ԫ�����3��Ԫ�ؽ��бȽϣ�...��������3��Ԫ���뵹����2��Ԫ�ؽ��бȽϣ���Ϊ��һ�ֱȽ�֮������ֵ�Ѿ������һλ�ˣ�û��Ҫ�ٶ�Ƚ�һ���ˡ��ڶ��ֵıȽϴ���Ϊ�����鳤��-2.
     * 3��...ֱ��������ѭ������Ԫ�ص����һ��λ��ʱ������ѭ����
     * ˵����
     * 1���Ƚ����֮��ÿ�ִ�����n-1��n-��...��2,1���ȽϵĴ�����һ������Ϊ1�ĵȲ����У����еĺ�ȥ����С�����ӣ���ʱ�临�Ӷȣ�O(n^2)��
     * 2�������ѭ����������Ƚϣ����ƱȽϵĵĴ������ڲ�ѭ���������ֵıȽϲ�����λ�ã�ÿ�ζ������ڵ�2��Ԫ�ؽ��бȽ�
     * 3���������̨�������ֱ��ʹ�ã�Arrays.toString(arr)
     *
     * @Description:ð�ݽ�������
     * @date:2020��1��28��
     */
    public static void ABubbleSortDescTest(int[] arr) {
        //���ѭ��������Ҫ�ȽϵĴ�����һ����n-1�Σ������ȱȽϺ󽻻�����ߵ�Ԫ��ֻ�ܵ������ڶ���Ԫ��(�±꣺arr.length-2)��ÿһ�ֱȽ���֮�����һ��λ��Ϊ���ֵ������Сֵ��
        for (int i = 0; i <= arr.length - 2; i++) {
            //�ڲ�ѭ������ð�ݣ���Ϊÿ���һ�����ѭ��������ĺ���ͻ��һ����С������������У���˿��Բ��ñȽ�
            for (int j = 0; j <= arr.length - 2 - i; j++) {//��Ϊÿ�αȽ�֮��,ĩβ�����ֶ���ÿһ�ֵļ�ֵ��...��Ϊ�˼��ٱȽϵĴ�������������Ч�ʣ������±�ֻ�ܵ���arr.length-2-i��
                if (arr[j] < arr[j + 1]) {//ÿһ�ֱȽϣ���ķź��档
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
    }

    /**
     * @Description:ð����������
     * @date:2020��1��28��
     */
    public static void ABubbleSortAscTest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//�Ƚϵ��������±��0��ʼ�����һ��ԭɫ���±�Ϊn-1��
            for (int j = 0; j < arr.length - 1 - i; j++) {//ÿһ�ֱȽϵĴ���:���±�0��ʼ������n-1-i��ÿһ��ѭ�����������һ��λ�����or��С����ѭ������Ϊarr.length-1-i��
                if (arr[j] > arr[j + 1]) {//ÿһ�ֶ���0�±�Ԫ����0+1Ԫ�رȽϣ�����λ�á�
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
    }

    /**
     * ��дһ��������������һ�����ȡ���ֵ�����������
     *
     * @return
     */
    public static int[] getRandomLenRandomValue(int maxLen, int maxValue) {
        int[] arr = new int[(int) (Math.random() * maxLen)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }

    /**
     * ����ĸ��Ʋ���������дһ������Ŀ�����������鿪��һ���µĿռ䡣
     * ���д�ɸ�ֵ��ʵ�������ڴ���ָ������ͬһ���ڴ档
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i];
        }
        return arr2;
    }

    /**
     * �ж������Ƿ���Ϊ�ݼ�����������
     *
     * @param arr
     * @return
     */
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2) {//���鳤��Ϊ0����1ʱ����������ģ����� true.
            return true;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                return false;
            }
            max = Math.max(max,arr[i]);
        }
        return true;
    }

    /**
     * �ɿ����������С
     * @param args
     */
    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue = 100;
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = getRandomLenRandomValue(maxLen, maxValue);
            int[] arr2 = copyArray(arr1);
            ABubbleSortDescTest(arr1);//����
            if (!isSorted(arr1)) {
                System.out.println("ѡ���������");
                System.out.println(Arrays.toString(arr2));
                break;
            }
        }
    }
}
