package ALineConstract;
public class GRecursive {
	public static void main(String[] args) {
		print(8);
	}
	
	/**
	 * 
	 * @Description:�ݹ�-����������㵽�������ã��ٵ�����㡣
	 * 		�ص㣺
	 * 			1.��ֱ������ѭ���ؼ��֣����м�������߼���־
	 * @param:@param i   
	 * @author:heshuanshuan
	 * @date:2020��1��14��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static void print(int i) {
		if (i>0) {
			System.out.println(i);
			print(i-1);
		}
	}
}
