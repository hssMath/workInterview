package Tool;

public class ArrayPrintln {
    /**
     *
     *@name    ����ı������
     *@description ���˵��������������һ�������ӡһ��Ԫ�غ�һ�����ţ��������һ����ֻ��ӡһ����������
     *@time    ����ʱ��:2017-3-14����08:42:44
     *@param arr
     */
    public static void PrintlnString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1) {
                System.out.print(arr[i]+",");
            }else {
                System.out.println(arr[i]+"]");
            }
        }
    }
}
