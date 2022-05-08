package Tool;

public class ArrayPrintln {
    /**
     *
     *@name    数组的遍历输出
     *@description 相关说明：如果不是最后一个，则打印一个元素和一个逗号；若是最后一个则只打印一个右中括号
     *@time    创建时间:2017-3-14下午08:42:44
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
