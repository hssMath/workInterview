package CLeedCodeQuestions;

public class A9_SerchIndescInArray {
    /**
     * 给定n(n<1000)个元素的【有序】数组 Ai和整数v,求v在数组中的下标,不存在输出 -1。
     * @param arr
     * @param v
     * @return Integer
     */
    public static Integer twoDe(Integer[]arr, Integer v) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            int mid = (l + r) >> 1;
            if(arr[mid] == v) return mid;
            if(arr[mid] < v) {
                r = mid + 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
