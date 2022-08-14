package B2SelectAlgorithm;

import java.util.Arrays;

/**
 * Ѱ�Ҵ���ָ�����������±�
 */
public class A42LeftmostIndexNoLessTargetNum {
    public static void main(String[] args) {
        int testTime = 10000;
        int maxLen = 10;
        int maxValue = 12;
        for (int i = 0; i < testTime; i++) {
            int[] arr = getGeranter(maxLen, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) + (int) (maxValue * Math.random());
            int index = getLeftmostIndexNoLessTargetNum(arr, value);
            int testIndex = test(arr, value);
            if (index != testIndex) {
                System.out.println(Arrays.toString(arr));
                break;
            }
        }
    }

    /**
     * �������
     *
     * @param maxLen
     * @param maxValue
     * @return
     */
    public static int[] getGeranter(int maxLen, int maxValue) {
        int maxSize = (int) (Math.random() * maxLen);
        int[] arr = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }

    /**
     * arr������ģ�>=num�������±�
     *
     * @param arr
     * @param target
     * @return
     */
    public static int getLeftmostIndexNoLessTargetNum(int[] arr, int target) {
        if (arr.length == 0 || arr == null) return -1;

        int L = 0;
        int R = arr.length - 1;
        int ans = -1;//���� while �����ϸ��£��˴�Ĭ��-1����ʾ�����в����� >=ָ���������˴��ͻ�ά�� -1��
        while (L <= R) {//L<=R�ͼ���
            int mid = (L + R) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return ans;
    }

    /**
     * ����Ŀ�꺯���Ƿ���ȷ��ʹ�õ��Ǳ�������
     *
     * @param arr
     * @param num
     * @return
     */
    public static int test(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                return i;
            }
        }
        return -1;
    }
}
