package ADataConstract;
/**
 * @decription:˫������:��3������ɣ�����2ͷ��˫�������м䲿���ǽڵ�ֵ
 * @class_name��DoubleNode
 * @author hss
 * @author��heshuanshuan 
 * @date 2020��1��1��
 */
public class EMultitonNode {
	private EMultitonNode pre = this;//��һ���ڵ�ָ���Լ�
	private EMultitonNode next = this;//��һ���ڵ�ָ���Լ�
	private final int data;
	
	
	//��ʼ��˫������
	public EMultitonNode(int data) {
		this.data=data;
	}
	
	//���ӽڵ�
	public void after(EMultitonNode node) {
		EMultitonNode nextNext = next;//��ȡ����һ������ڵ�3/3�δ�λ�õĽڵ㣬��Ϊ��ʱ������˫��ѭ��������3�������
		this.next=node;// ���õ�һ���������һ���ڵ�ָ�ڶ������壩���½ڵ���Ϊ��ǰ�ڵ����һ�ڵ�
		node.pre=this;//���ڶ����������һ���ڵ�ָ���һ�������ڵ㣩�ѵ�ǰ�ڵ���Ϊ �½ڵ��ǰһ���ڵ�
		
		node.next = nextNext;//���ڶ�������ڵ��3/3���ڵ�ָ����ʱ����[��һ�������ڵ�3/3�ڵ�]��
		nextNext.pre=node;//��ʱ��������һ���ڵ�ָ��ڶ�����ɱ���
	}
	
	public static void main(String[] args) {
		EMultitonNode doubleNode22 = new EMultitonNode(22);
		EMultitonNode doubleNode33 = new EMultitonNode(33);
		EMultitonNode doubleNode44 = new EMultitonNode(44);
		doubleNode22.after(doubleNode33);
		doubleNode33.after(doubleNode44);
	}
}
