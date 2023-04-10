package CLeetCodeExercise.array;


import java.util.Arrays;
import java.util.HashMap;

/**
 * NC61 ����֮�ͣ�����һ���������� numbers ��һ��Ŀ��ֵ target�������������ҳ���������������Ŀ��ֵ�������±꣬���ص��±갴�������С�
 * ע�⣺��ע�����ص������±��1��ʼ���𣬱�֤targetһ����������������2��������ӵõ���
 */
public class A11TwoNumSum {
    public static void main(String[] args) {
        System.out.println(getByHashMap(new int[]{20,70,110,150}, 90));
        getByHashMap(new int[]{20,70,110,150}, 90);
    }

    /**
     * ˼·��
     *    ʹ�� sum-�����е�i���������� hashmap���������� hashmap ���ҵ����ͷ���2��������±ꣻ����Ҳ�����put�� hashmap �У�
     *    ʱ�临�Ӷ� => O(n)�����������ѭ�����������һ���������ҵ���
     * @param arr
     * @param target
     * @return
     */
    public static String getByHashMap(int[] arr, int target) {
        int []result = new int[2];

        //����hashmap�������Ԫ��ֵ�������±ꡣ
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {// ��������10������������±�Ϊ9��
            int value = target - arr[i];// ��ȡĿ�������i�����Ĳ�
            if (hashMap.containsKey(value)){// �ҵ��ˣ����ص�ǰ���±�i������һ���±�
                Integer anotherIndex = hashMap.get(value);// hashmap ���Ƿ����ҵ� key Ϊ��ֵ���±�
                result[0] = anotherIndex+1;
                result[1] = i+1;
            }else {//���û���ҵ�����ӵ�map��
                hashMap.put(arr[i],i);
            }
        }
        Arrays.sort(result); // Arrays��ֻ֮���ṩ��Ĭ�ϵ��������У�Ҫ�Ի������͵�������н�������ʹ��for��ת
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
