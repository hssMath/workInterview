import java.util.Scanner;

/**
 * 
 * @decription:BSortAlgorithm
 * @class_name��	���ٷַ��ӵ�����Ŀ
 * @author hss
 * @author��heshuanshuan 
 * @date 2020��2��19��
 */
public class A8_MinDistributionBullets20200214 {
	@SuppressWarnings({ "resource", "unlikely-arg-type", "unused" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String intput  = in.nextLine();
		String[] arrString = intput.toString().split(" ");
		int[] arrInt = new int[arrString.length];
		for (int i = 0; i < arrString.length; i++) {
			arrInt[i] = Integer.parseInt(arrString[i]);
		}
		getNum(arrInt);
    }
	
	/**
	 * 
	 * @Description:(����)
	 * @param:@param arr   
	 * @author:heshuanshuan
	 * @date:2020��2��19��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void getNum(int[] arr) {
		int total  = arr.length;//�ӵ�����
        for (int i = 1; i < arr.length; i++) {//�������е�����
        	if (arr[i-1]>arr[i]) {//��ǰ��(arr[i])>ǰһ��(arr[i-1])
        		int tempValue = arr[i];//�洢��ǰԪ��
        		int j;
        		for (j = i-1; j>=0 && arr[j]>tempValue;j--) {//������ǰ����ǰ��
        			arr[j+1]= arr[j];
        		}
        		arr[j+1] =  tempValue;//����ʱ���������forѭ���ĵ�ǰԪ�أ����������������ĺ�һ��Ԫ��ֵ����ʱtemp������Сֵ
        	}
        }
        for (int i = 0; i < arr.length-1; i++) {
        	if (arr[i]<=arr[i+1]) {
        		total++;
        	}
        }
        System.out.println(total);
	}
}
