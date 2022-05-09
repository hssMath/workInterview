package Aapplication.duigu;

import java.util.HashMap;
import java.util.Map;

/**
 * ��¥�����⣬һ��ֻ����1��2̨�ף���n�׵�¥�ݣ�����¥���ж�����������
 * ������
 *      ¥������Ϊ 1 ���� 1 ��������1                      f(1) = 1
 *      ¥������Ϊ 2 ���� 2 ��������11,2                   f(2) = 2
 *      ¥������Ϊ 3 ���� 3 ��������111��12,21             f(3) = 3
 *      ¥������Ϊ 4 ���� 5 ��������1111,112,121,211,22    f(4) = 5
 */
public class A1ClimbStairs {
    public static void main(String[] args) {
        System.out.println(getDuiGui(5));
    }

    public static int GetFor(int n){
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    /**
     * ʹ�õݹ��㷨ʵ�֣��ݹ����ֹ������f(1) = 1��f(2) = 2��ʱ�临�Ӷȸߡ�O(n��2�η�)
     * ��ʵ����һ��������
     * @param num
     * @return
     */
    public static int getDuiGui(int num){
        if (num == 1) {
            return 1;
        }else if (num == 2) {
            return 2;
        }else{
            return getDuiGui(num-1)+getDuiGui(num-2);
        }
    }

    /**
     * ʹ�õݹ�� for ѭ���㷨ʵ��
     * @param num
     * @return
     */
    public static int getSum(int num){
        Map<Integer,Integer> storeMap = new HashMap<>();//����������n��¥�ݵ��������м�ֵ�������õ���ʱ��ֱ��ȡֵ�������˶���ظ��������⡣ʱ�临�Ӷȸߡ�O(n)
        if (num == 1) {
            return 1;
        }else if (num == 2) {
            return 2;
        }
        if (null != storeMap.get(num)) {
            return storeMap.get(num);
        }else {
            int result = getSum(num - 1) + getSum(num - 2);
            storeMap.put(num,result);
            return result;
        }
    }
}