package ALineConstract;
public class LineSelect {
	/**
	 * 
	 * @Description:���ַ�����ʹ��while�����ŵ�ѭ��
	 * @param:   
	 * @author:heshuanshuan
	 * @return 
	 * @date:2019��11��2��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static int getMiddleWhileIndex(int num) {
		int[] arr = {1,2,3,4,5,6,7,8};
		//���ַ���ͨ���±�ı仯ʵ�ֶ��ֵıȽ�
		int begin = 0;
		int end = arr.length-1;
		int miidle = (end+begin)/2;//����ֵΪint�����Զ��ض�ȡ��
		
		while (true) {//��whilr����Ϊ����Ҫforѭ����forѭ����Ҫi++��while���Բ���.ֱ��ָ���±���бȽ�
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
	 * @Description:���ַ�forѭ������
	 * @param:   
	 * @author:heshuanshuan
	 * @return 
	 * @date:2019��11��2��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
//	public static int getMiddleForIndex(int num) {
//		int[] arr = {1,2,3,4,5,6,7,8};
//		//���ַ���ͨ���±�ı仯ʵ�ֶ��ֵıȽ�
//		int begin = 0;
//		int end = arr.length-1;
//		int miidle = (end+begin)/2;//����ֵΪint�����Զ��ض�ȡ��
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
