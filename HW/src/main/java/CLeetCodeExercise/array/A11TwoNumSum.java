package CLeetCodeExercise.array;


import java.util.Arrays;
import java.util.HashMap;

/**
 * ����֮�ͣ���һ�������һ��Ŀ����targer����ȡ2��֮�͵������±ꡣ
 */
public class A11TwoNumSum {
    public static void main(String[] args) {
        System.out.println(getByHashMap(new int[]{2, 10, 1, 7, 9, 4}, 6));
    }

    /**
     * ˼·��
     *    ʹ�� sum-�����е�i���������� hashmap���������� hashmap ���ҵ����ͷ���2��������±ꣻ����Ҳ�����put�� hashmap �У�ʱ�临�Ӷ� => O(n)
     * ���������ѭ�����������һ���������ҵ���
     *
     * @param arr
     * @param targer
     * @return
     */
    public static String getByHashMap(int[] arr, int targer) {
        int []result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();//����hashmap���û���ҵ���ֵ
        for (int i = 0; i <= arr.length - 1; i++) {//��������10������������±�Ϊ9��
            int value = targer - arr[i];//��ȡĿ�������i�����Ĳ�
            Integer anotherIndex = hashMap.get(value);//�� hashmap ���Ƿ����ҵ� key Ϊ��ֵ���±�
            if (null != anotherIndex){//�ҵ��ˣ����ص�ǰ���±�i������һ���±�
                result[0] = anotherIndex;
                result[1] = i;
            }else {//���û���ҵ�����ӵ�map��
                hashMap.put(arr[i],i);
            }
        }
        return Arrays.toString(result);
    }

    /**
     * ������٣����Ƽ�ʹ�ã�ʹ��forѭ����ʱ�临�Ӷ� =��O(n��2�η�)
     *  1���õ�һ����������ÿ����������ӣ������=Ŀ�����ͷ����������±ꣻ��������ڣ�
     *  2�������õ�2����������ÿ����������ӣ������=Ŀ�������ͷ����������±ꣻ
     *  3��ֱ�������ڶ����������һ�������бȽϡ�
     * @param arr
     * @param targer
     * @return
     */
    public static String getByFor(int[] arr, int targer) {
        int []result = new int[2];
        for (int i = 0; i <= arr.length - 2; i++) {//��������10������������±�Ϊ9����Ƚϵ�����������ߵ����±�ֻ�ܵ�8��
            for (int j = i + 1; j <= arr.length - 1; j++) {//��������10������������±�Ϊ9����Ƚϵ����������ұߵ����±�ֻ�ܵ�9��
                if (arr[i] + arr[j] == targer) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return Arrays.toString(result);
    }
}
