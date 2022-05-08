package B2SelectAlgorithm;

/**
 * 704 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 *  写一个函数搜索数组 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * @Description:二分法查找使用while是最优的循环，因为while可以直接带循环终止条件，而for循环只能在循环方法体中添加终止条件。
 * 一般使用的时候，都是while加一个终止条件，同时循环体中添加一个终止条件，2个条件共同作用，实现循环的终止并返回。
 * @date:2019年11月2日
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(BinarySearch.getMiddleWhileIndex(arr, 5));
    }

    /**
     * 二分法，通过下标的变化实现二分的比较，所谓二分，全程必须有一对首、位指针进行二分，具体思路：
     * 1.首先，做一个非空判断，
     * 2.左下标定义为0,右下标定义为数组的长度-1，即：arr.length - 1
     * 3.使用 while 循环，来设置终止条件更为方便一下。
     * 4.先使用取余操作，获取中间元素的下标（left+right）/2+left，然后让目标元素与中间元素进行首次比较。
     *      5.1如果目标元素比中间元素大，则让左边的下标=中间元素下标+1，右边元素下标不变。
     *      5.2如果目标元素比中间元素大小，则让右边的下标=中间元素下标-1，左边元素下标不变。
     * 6.直到while里面的中间下标的元素=目标元素，则退出循环，退出循环可以通过2种方式：
     *      6.1. 通过 return 直接跳出整个方法，同时返回方法期望的结果。
     *      6.2. 通过if判断，达到某个条件，直接break跳出方法的while循环体，然后再返回方法期望的结果。
     *      一般采用 return 的方式，因为直接高效。
     * 7.否则返回-1，没有指定的元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int getMiddleWhileIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     *
     * @Description:二分法for循环查找
     * @date:2019年11月2日
     */
//	public static int getMiddleForIndex(int num) {
//		int[] arr = {1,2,3,4,5,6,7,8};
//		//二分法，通过下标的变化实现二分的比较
//		int start = 0;
//		int end = arr.length-1;
//		int mid = (end+start)/2;//返回值为int，会自动截断取整
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
