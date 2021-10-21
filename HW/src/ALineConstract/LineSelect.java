package ALineConstract;
public class LineSelect {
	/**
	 * 
	 * @Description:二分法查找使用while是最优的循环
	 * @param:   
	 * @author:heshuanshuan
	 * @return 
	 * @date:2019年11月2日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static int getMiddleWhileIndex(int num) {
		int[] arr = {1,2,3,4,5,6,7,8};
		//二分法，通过下标的变化实现二分的比较
		int begin = 0;
		int end = arr.length-1;
		int miidle = (end+begin)/2;//返回值为int，会自动截断取整
		
		while (true) {//用whilr是因为不需要for循环，for循环需要i++；while可以不用.直接指定下标进行比较
			if (begin>=end) {
				return -1;
			}
			if (arr[miidle]==num) {
				break;
			}else {
				if (arr[miidle]<num) {
					begin=miidle+1;
				} else {
					end=miidle-1;
				}
			}
			miidle = (end+begin)/2;
		}
		return miidle;
	}
	
	/**
	 * 
	 * @Description:二分法for循环查找
	 * @param:   
	 * @author:heshuanshuan
	 * @return 
	 * @date:2019年11月2日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
//	public static int getMiddleForIndex(int num) {
//		int[] arr = {1,2,3,4,5,6,7,8};
//		//二分法，通过下标的变化实现二分的比较
//		int begin = 0;
//		int end = arr.length-1;
//		int miidle = (end+begin)/2;//返回值为int，会自动截断取整
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[miidle]==num) {
//				break;
//			}else {
//				if (arr[i]<num) {
//					begin=i+1;
//				} else {
//					end=i-1;
//				}
//				miidle = (end+begin)/2;
//			}
//		}
//		return miidle;
//	}
	public static void main(String[] args) {
		System.out.println(LineSelect.getMiddleWhileIndex(99));
	}
}
