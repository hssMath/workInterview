package B2SelectAlgorithm;

/**
 * 704 ����һ�� n ��Ԫ������ģ������������� nums ��һ��Ŀ��ֵ target��дһ�������������� nums �е� target��
 * ���Ŀ��ֵ���ڷ����±꣬���򷵻� -1��
 * ע�⣺
 * 1�����ַ�����ʹ��while�����ŵ�ѭ������Ϊwhile����ֱ�Ӵ�ѭ����ֹ������
 * 2����forѭ��ֻ����ѭ���������������ֹ������
 * һ��ʹ�õ�ʱ�򣬶���while��һ����ֹ������ͬʱѭ���������һ����ֹ������2��������ͬ���ã�ʵ��ѭ������ֹ�����ء�
 *
 * @date:2019��11��2��
 */
public class A41BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(A41BinarySearch.getMiddleWhileIndex(arr, 5));
    }

    /**
     * ���ַ���ͨ���±�ı仯ʵ�ֶ��ֵıȽϣ���ν���֣�ȫ�̱�����һ���ס�λָ����ж��֣�����˼·��
     * 1.���ȣ���һ���ǿ��жϣ�
     * 2.���±궨��Ϊ0,���±궨��Ϊ����ĳ���-1������arr.length - 1
     * 3.ʹ�� while ѭ������������ֹ������Ϊ����һ�¡�
     * 4.��ʹ��ȡ���������ȡ�м�Ԫ�ص��±꣨left+R��/2+left��Ȼ����Ŀ��Ԫ�����м�Ԫ�ؽ����״αȽϡ�
     *      5.1���Ŀ��Ԫ�ر��м�Ԫ�ش�������ߵ��±�=�м�Ԫ���±�+1���ұ�Ԫ���±겻�䡣
     *      5.2���Ŀ��Ԫ�ر��м�Ԫ�ش�С�������ұߵ��±�=�м�Ԫ���±�-1�����Ԫ���±겻�䡣
     * 6.ֱ��while������м��±��Ԫ��=Ŀ��Ԫ�أ����˳�ѭ�����˳�ѭ������ͨ��2�ַ�ʽ��
     *      6.1. ͨ�� return ֱ����������������ͬʱ���ط��������Ľ����
     *      6.2. ͨ��if�жϣ��ﵽĳ��������ֱ��break����������whileѭ���壬Ȼ���ٷ��ط��������Ľ����
     * һ����� return �ķ�ʽ����Ϊֱ�Ӹ�Ч��
     * 7.���򷵻�-1��û��ָ����Ԫ�ء�
     *
     * @param nums
     * @param target
     * @return
     */
    public static int getMiddleWhileIndex(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int L = 0;
        int R = nums.length - 1;
        while (L <= R) {//�˴�һ��д����ѭ����ֹ������
            int mid = L + (R - L) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return -1;
    }

    /**
     *
     * @Description:���ַ�forѭ������
     * @date:2019��11��2��
     */
//	public static int getMiddleForIndex(int num) {
//		int[] arr = {1,2,3,4,5,6,7,8};
//		//���ַ���ͨ���±�ı仯ʵ�ֶ��ֵıȽ�
//		int start = 0;
//		int end = arr.length-1;
//		int mid = (end+start)/2;//����ֵΪint�����Զ��ض�ȡ��
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[mid]==num) {
//				break;
//			}else {
//				if (arr[i]<num) {
//					start=i+1;
//				} else {
//					end=i-1;
//				}
//				mid = (end+start)/2;
//			}
//		}
//		return mid;
//	}
}
