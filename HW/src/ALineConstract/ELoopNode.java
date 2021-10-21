package ALineConstract;
/**
 * 
 * @decription:ѭ������
 * @class_name��LoopNote
 * @author hss
 * @author��heshuanshuan 
 * @date 2019��12��29��
 */
public class ELoopNode {
	private int data;//�ڵ�����
	private ELoopNode next = this;//��һ���ڵ�
	
	/**
	 * ���ڵ���ӽڵ�����
	 * @param value
	 */
	public ELoopNode(int value) {
		this.data=value;
	} 
	/*
	 * 2.��õ�ǰ�ڵ�Ľڵ�ֵ
	 */
	public int getData() {
		return this.data;
	}
	/*
	 * 3.��ǰ�ڵ����һ���ڵ�
	 */
	public ELoopNode next() {
		return this.next;
	}
	
	/**
	 * 
	 * @Description:5.��һ���ڵ����һ���½ڵ㣬��ʵ�ǰ��½ڵ���ڵ�ǰ�ڵ�ĺ���һ���ڵ�
	 * 		ȡ����ǰ�ڵ����һ���ڵ㣬��Ϊ����һ���ڵ㣻
	 * 		���½ڵ���Ϊ��һ���ڵ�
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019��12��17��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public void after(ELoopNode note) { 
		ELoopNode nextNote = next;//ȡ����һ�ڵ㣬��Ϊ���¸��ڵ�
		this.next=note;//����Ľڵ���Ϊ��ǰ�ڵ����һ���ڵ�
		note.next=nextNote;//����һ���ڵ���Ϊ�½ڵ����һ���ڵ�
	}
	
	public static void main(String[] args) {
		/*
		 * n1��n2��n3��n4��ÿһ�����Ƕ�����ѭ������
		 */
		ELoopNode n1 = new ELoopNode(1);
		ELoopNode n2 = new ELoopNode(2);
		ELoopNode n3 = new ELoopNode(3);
		ELoopNode n4 = new ELoopNode(4);
		
		n1.after(n2);
		n2.after(n3);
		n3.after(n4);//12341234
		System.out.println(n1.next.getData());
		System.out.println(n2.next.getData());
		System.out.println(n3.next.getData());
		System.out.println(n4.next.getData());
		/**
		 * �뵥���������
		 * 	1.�������п�ʼ�ڵ㡢���һ���ڵ�֮�֣�ѭ������û��
		 * 	2.�������������append��ѭ����������һ���ӵ�һ�����ڶ����ӵ�������after
		 */
	}
}

