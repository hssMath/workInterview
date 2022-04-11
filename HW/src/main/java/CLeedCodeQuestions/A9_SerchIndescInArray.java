package CLeedCodeQuestions;

public class A9_SerchIndescInArray {
    /**
     * ����n(n<1000)��Ԫ�صġ��������� Ai������v,��v�������е��±�,��������� -1��
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
