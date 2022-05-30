package CLeetCodeExercise.istring;

import java.util.Arrays;

/**
 * һ���������������������ȵ����飬�ҳ����е�һ���ֲ���С����
 *  1��ȷ��һ��϶��оͿ����ö���
 */
public class A42MinIndex {
    public static void main(String[] args) {
        int testTime = 1000;
        int maxLen = 10;
        int maxValue = 100;
        System.out.println("���Կ�ʼ");
        for (int i = 0; i < testTime; i++) {
            int[] arr = randomArray(maxLen, maxValue);
            int ans = getMinIndex(arr);
            if (!check(arr, ans)) {
                System.out.println(Arrays.toString(arr));
                System.out.println(ans);
                break;
            }
        }
        System.out.println("���Խ���");
    }

    /**
     * ���ڣ�����������飬����������������ȡ�
     * ע�⣺
     *  1��Math.random()��a pseudorandom double greater than or equal to 0.0 and less than 1.0
     *  2��ʹ�� do{}while() ѭ�����������Ԫ�ء�
     * @param maxLen
     * @param maxValue
     * @return
     */
    public static int[] randomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen); // [0,maxLen) ָ����ȡ����ĳ���
        int[] arr = new int[len];
        if (len > 0) {
            arr[0] = (int) (Math.random() * maxValue);
            for (int i = 1; i < len; i++) {
                do {
                    arr[i] = (int) (Math.random() * maxValue);
                } while (arr[i] == arr[i - 1]);//�������������������ˣ������²�����
            }
        }
        return arr;
    }

    /**
     * ��֤Ŀ������Ƿ�Ϊ�ֲ���С����� minIndex Խ���˾�û�ƻ��������û��Խ���˾����ȥ��һ�¡�
     *
     * @param arr
     * @param minIndex
     * @return
     */
    public static boolean check(int[] arr, int minIndex) {
        if (arr.length == 0) return minIndex == -1;
        int left = minIndex - 1;
        int right = minIndex + 1;
        //�ж�ȡ�õ�Ŀ������+1��-1 ֮����һ����ʵ��λ��(�Ƿ���Ч)�������Ч��ȥ��֤�Ƿ�>��< Ŀ�����������Ч�������or�ұߴ�
        boolean isLeftBiggerMiddle = left >= 0 ? arr[left] < arr[minIndex] : true;
        boolean isRightBiggerMiddle = right < arr.length ? arr[minIndex] < arr[right] : true;
        return isLeftBiggerMiddle && isRightBiggerMiddle;
    }

    /**
     * ˼·��
     * 1��ʹ�þֲ���С������д���룬Ȼ����ڱ�Ե�������е����жϡ�
     * 2��ʹ�ö��ַ����ң���һ�������Ķ��ֲ��ҷ���
     * ���壺
     * 1��û������return -1
     * 2��һ������return 0
     * 3����������ȡ��Сֵ
     * 4������������������ while �߼��ж�
     *
     * @param arr
     * @return
     */
    public static int getMinIndex(int[] arr) {
        if (arr.length == 0 || arr == null) return -1;
        int N = arr.length;
        if (N == 1) return 0;
        if (arr[0] < arr[1]) return 0;//2����ʱ��ȡ��Сֵ
        if (arr[N - 1] < arr[N - 2]) return N - 1;//2����ʱ��ȡ��Сֵ


        int L = 0;
        int R = N - 1;
        while (L < R - 1) {//��ʾL��R�Ѿ����ڵ������
            int mid = (L + R) / 2;
            if (arr[mid - 1] > arr[mid] && arr[mid] < arr[mid + 1]) {// middle ͬʱ����������С
                return mid;
            } else {// arr[mid] ��ͬʱСarr[mid + 1]��arr[mid - 1]��1����>�� ��>�ң�2����<�� ��<�ң�3����<�� ��>��
                if (arr[mid - 1] < arr[mid]) {//��� middle ������ߴ�Ҫȥ������������Կ����ұߣ�������2�߶�һ����ʱ�򣬿��������ұߡ�
                    R = mid - 1;
                } else {//��� middle �����ұߴ�Ҫȥ�ұ����������Կ������
                    L = mid + 1;
                }
            }
        }
        return arr[L] < arr[R] ? L : R;
    }
}