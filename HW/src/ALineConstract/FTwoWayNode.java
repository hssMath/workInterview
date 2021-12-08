package ALineConstract;
/**
 * @decription:˫������:��3������ɣ�����2ͷ��˫�������м䲿���ǽڵ�ֵ
 * @class_name��DoubleNode
 * @author hss
 * @author��heshuanshuan 
 * @date 2020��1��1��
 */
public class FTwoWayNode {
	private FTwoWayNode pre = this;//��һ���ڵ�ָ���Լ�
	private FTwoWayNode next = this;//��һ���ڵ�ָ���Լ�
	private int data;
	
	
	//��ʼ��˫������
	public FTwoWayNode(int data) {
		this.data=data;
	}
	
	//���ӽڵ�
	public void after(FTwoWayNode node) {
		FTwoWayNode nextNext = next;//��ȡ����һ������ڵ�3/3�δ�λ�õĽڵ㣬��Ϊ��ʱ������˫��ѭ��������3�������
		this.next=node;// ���õ�һ���������һ���ڵ�ָ�ڶ������壩���½ڵ���Ϊ��ǰ�ڵ����һ�ڵ�
		node.pre=this;//���ڶ����������һ���ڵ�ָ���һ�������ڵ㣩�ѵ�ǰ�ڵ���Ϊ �½ڵ��ǰһ���ڵ�
		
		node.next = nextNext;//���ڶ�������ڵ��3/3���ڵ�ָ����ʱ����[��һ�������ڵ�3/3�ڵ�]��
		nextNext.pre=node;//��ʱ��������һ���ڵ�ָ��ڶ�����ɱ���
	}
	
	public static void main(String[] args) {
		FTwoWayNode doubleNode22 = new FTwoWayNode(22);
		FTwoWayNode doubleNode33 = new FTwoWayNode(33);
		FTwoWayNode doubleNode44 = new FTwoWayNode(44);
		doubleNode22.after(doubleNode33);
		doubleNode33.after(doubleNode44);
	}
}
