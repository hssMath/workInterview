package ALineConstract;
/**
 * 
 * @decription:��ŵ������
 * @class_name��TestHanoi
 * @author hss
 * @author��heshuanshuan 
 * @date 2020��1��15��
 */
public class TestHanoi {
	public static void main(String[] args) {
		moveHanoi(3, "A", "B", "C");
	}
	private static void moveHanoi(int n,String from,String in,String to) {
		int i = 0;
		if (n==1) {//ֻ��һ������
			System.out.println(i+":��"+n+"�����Ӵ�"+from+"�ƶ���"+to);
		}else {
			int j = 0;
			
			moveHanoi(n-1, from, to, in);//�ƶ��������е����ӵ��м�λ��
			j+=1;
			System.out.println(j+":��"+n+"�����Ӵ�"+from+"�ƶ���"+to);
			
			j+=1;
			moveHanoi(n-1, in, from, to);//�����е����Ӵ��м�λ���ƶ���Ŀ��λ��
			System.out.println(j+":��"+n+"�����Ӵ�"+from+"�ƶ���"+to);
		}
	}
}
