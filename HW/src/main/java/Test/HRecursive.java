package Test;
public class HRecursive {
	public static void main(String[] args) {
		print(8);
	}
	
	/**
	 * @Description:�ݹ�-����������㵽�������ã��ٵ�����㡣
	 * �ص㣺
	 * 		1��������ֹ���������ڵݹ���ֹ��������ֱ������ѭ���ؼ��֣����м�������߼���־
	 * 		2���ŵ㣺�����࣬�������ǿ��ȱ�㣺�й����ջ������������ʹ�á�
	 * @date:2020��1��14��
	 */
	public static void print(int i) {
		if (i>0) {
			System.out.println(i);
			print(i-1);
		}else {
			System.out.println("�ݹ鷽��ִ�����");
			return ;
		}
	}
}
