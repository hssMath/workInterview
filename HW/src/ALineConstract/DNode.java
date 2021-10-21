package ALineConstract;
/**
 * 
 * @decription:��������2������
 * @class_name��Array
 * @author hss
 * @author��heshuanshuan 
 * @date 2019��12��29��
 */
public class DNode {
	private int data;//�ڵ�����
	private DNode next;//��һ���ڵ�
	
	/**
	 * ���ڵ���ӽڵ�����ֵ
	 * @param value
	 */
	public DNode(int value) {
		this.data=value;
	} 
	/*
	 *	Ϊ�ڵ�׷�ӽڵ㣺��1�棺ֻ��һ����һ��
	 */
//	public void append(Note note) {
//		this.next=note;
//	}
	/*
	 *	Ϊ�ڵ�׷�ӽڵ㣺��2��:��һ���ӵڶ�������һ���ӵ�����
	 */
//	public void append(Note note) {
//		Note currentNote = null;//��ǰ�ڵ�
//		while (true) {//ѭ�������
//			Note nextNote = currentNote.next;//��ǰ�ڵ����һ���ڵ�
//			if (nextNote==null) {//��ǰ�ڵ����һ���ڵ�Ϊ�գ���ǰ�ڵ������һ���ڵ�
//				break;
//			}
//			currentNote = nextNote;//��ǰ�ڵ�Ϊ���һ���ڵ�
//		}
//		currentNote.next=note;//Ϊ���һ���ڵ�׷�ӽڵ�
//	}
	/*
	 *	1.Ϊ�ڵ�׷�ӽڵ㣺��3��:��һ��append�ڶ������ڶ���append����������������append
	 *		ע���õ���whileѭ���������һ���ڵ㣬�ҵ�������һ���ڵ㣬���½ڵ�׷�ӵ����һ���ڵ�֮��                                                                                                                                                          
	 */
	public DNode append(DNode dNode) {
		DNode currentNote = this;//thisΪ��ǰ����,Ҳ���ǵ�һ���ڵ�
		while (true) {//ѭ�������
			DNode nextNote = currentNote.next();//��ǰ�ڵ����һ���ڵ�
			if (nextNote==null) {//��ǰ�ڵ����һ���ڵ�Ϊ�գ���ǰ�ڵ������һ���ڵ�
				break;
			}
			currentNote = nextNote;//��ǰ�ڵ㸳����ǰ�ڵ㣬ѭ������ʱ��ǰ�ڵ�Ϊ���һ���ڵ�
		}
		currentNote.next=dNode;//Ϊ���һ���ڵ�׷�ӽڵ�
		return currentNote;
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
	public DNode next() {
		return this.next;
	}
	
	/**
	 * 
	 * @Description:4.ɾ����ǰ�ڵ����һ���ڵ�;��ǰ�ڵ㲻��ɾ��
	 * 	ʵ�ַ�ʽ��
	 * 		1.ȡ�����¸��ڵ�
	 * 		2.�����¸��ڵ���Ϊ��ǰ�ڵ���¸��ڵ�
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019��12��11��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public void removeNext() {
		DNode newNext = next.next;
		this.next=newNext;
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
	public void after(DNode dNode) {//n1.next.after(note5)
		DNode nextNote = next;// �ֳɵ�����n1=1��2��4		n1.next=1,2		next=4
		this.next=dNode;//this=1,2
		dNode.next=nextNote;
	}
	/**
	 * 
	 * @Description:��ʾ���нڵ���Ϣ
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019��12��11��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public void show() {
		DNode currentNote = this;
		while (true) {
			System.out.print(currentNote.data+" ");
			currentNote = currentNote.next;
			if (null==currentNote) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		/**
		 * 	���ȣ���������һ���ڵ㣬����������������append����Ҫָ��λ����ӡ�ɾ������Ҫָ���������±�Ķ���
		 * 	0.������new֮��ڵ���Ŀ�����޵�
		 *	1.������ӽڵ����ƴ�ڵ�
		 *	2.������ɾ���ڵ�����ɾ������һ���ڵ㣬���ɾ���Ľڵ㣬��ɾ��������ڵ�ӵ��������޳�
		 *	3.��������ӽڵ㣬�¸��ڵ���Ϊ���¸��ڵ㣬�½ڵ���Ϊ��һ���ڵ�
		 */ 
		
		DNode n1 = new DNode(1);
		DNode n2 = new DNode(2);
		DNode n3 = new DNode(3);
		DNode n4 = new DNode(4);
		DNode n5 = new DNode(5);
		DNode n6 = new DNode(6);
		DNode n7 = new DNode(7);
//		n1.append(n2);
//		n2.append(n3);
//		System.out.println(n1.next().getData());//1��ֻ��һ������һ����λ����
		
//		n1.append(n2);
//		n1.append(n3);
//		System.out.println(n1.next().getData());//2����һ���ӵڶ�������һ���ӵ�����
		
		n1.append(n2).append(n3).append(n4).append(n5).append(n6).append(n7);//ƴһ��֮��n1����һ������
//		System.out.println(n1.next.getData());//3����һ���ӵڶ������ڶ����ӵ����������Ž�
		n1.show();
		System.out.println();
		
		
		n1.next.removeNext();//������ɾ���ڵ�
		n1.show();
		System.out.println();
		
		DNode note33 = new DNode(33);
		n1.next.after(note33);//���������ڵ�
		n1.show();
		System.out.println();
		
		n1.after(n7);//after�����������2���ڵ�
		n1.show();
		System.out.println();
	}
}
