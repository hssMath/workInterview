package ADataConstract;
/**
 * 
 * @decription:��������2������
 * @class_name��Array
 * @author hss
 * @author��heshuanshuan 
 * @date 2019��12��29��
 */
public class DSingleNode {
	private final int value;//�ڵ�����
	private DSingleNode next;//��һ���ڵ�
	
	/**
	 * ���ڵ���ӽڵ�����ֵ
	 * @param value
	 */
	public DSingleNode(int value) {
		this.value=value;
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
	public DSingleNode append(DSingleNode dSingleNode) {
		DSingleNode currentNote = this;//thisΪ��ǰ����,Ҳ���ǵ�һ���ڵ�
		while (true) {//ѭ�������
			DSingleNode nextNote = currentNote.next();//��ǰ�ڵ����һ���ڵ�
			if (nextNote==null) {//��ǰ�ڵ����һ���ڵ�Ϊ�գ���ǰ�ڵ������һ���ڵ�
				break;
			}
			currentNote = nextNote;//��ǰ�ڵ㸳����ǰ�ڵ㣬ѭ������ʱ��ǰ�ڵ�Ϊ���һ���ڵ�
		}
		currentNote.next= dSingleNode;//Ϊ���һ���ڵ�׷�ӽڵ�
		return currentNote;
	}
	/*
	 * 2.��õ�ǰ�ڵ�Ľڵ�ֵ
	 */
	public int getValue() {
		return this.value;
	}
	/*
	 * 3.��ǰ�ڵ����һ���ڵ�
	 */
	public DSingleNode next() {
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
		DSingleNode newNext = next.next;
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
	public void after(DSingleNode dSingleNode) {//n1.next.after(note5)
		DSingleNode nextNote = next;// �ֳɵ�����n1=1��2��4		n1.next=1,2		next=4
		this.next= dSingleNode;//this=1,2
		dSingleNode.next=nextNote;
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
		DSingleNode currentNote = this;
		while (true) {
			System.out.print(currentNote.value+" ");
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
		
		DSingleNode n1 = new DSingleNode(1);
		DSingleNode n2 = new DSingleNode(2);
		DSingleNode n3 = new DSingleNode(3);
		DSingleNode n4 = new DSingleNode(4);
		DSingleNode n5 = new DSingleNode(5);
		DSingleNode n6 = new DSingleNode(6);
		DSingleNode n7 = new DSingleNode(7);
//		n1.append(n2);
//		n2.append(n3);
//		System.out.println(n1.next().getValue());//1��ֻ��һ������һ����λ����
		
//		n1.append(n2);
//		n1.append(n3);
//		System.out.println(n1.next().getValue());//2����һ���ӵڶ�������һ���ӵ�����
		
		n1.append(n2).append(n3).append(n4).append(n5).append(n6).append(n7);//ƴһ��֮��n1����һ������
//		System.out.println(n1.next.getValue());//3����һ���ӵڶ������ڶ����ӵ����������Ž�
		n1.show();
		System.out.println();
		
		
		n1.next.removeNext();//������ɾ���ڵ�
		n1.show();
		System.out.println();
		
		DSingleNode note33 = new DSingleNode(33);
		n1.next.after(note33);//���������ڵ�
		n1.show();
		System.out.println();
		
		n1.after(n7);//after�����������2���ڵ�
		n1.show();
		System.out.println();
	}
}
