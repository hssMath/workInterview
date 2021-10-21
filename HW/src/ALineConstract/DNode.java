package ALineConstract;
/**
 * 
 * @decription:单链表：有2个属性
 * @class_name：Array
 * @author hss
 * @author：heshuanshuan 
 * @date 2019年12月29日
 */
public class DNode {
	private int data;//节点内容
	private DNode next;//下一个节点
	
	/**
	 * 给节点添加节点内容值
	 * @param value
	 */
	public DNode(int value) {
		this.data=value;
	} 
	/*
	 *	为节点追加节点：第1版：只能一个接一个
	 */
//	public void append(Note note) {
//		this.next=note;
//	}
	/*
	 *	为节点追加节点：第2版:第一个接第二个，第一个接第三个
	 */
//	public void append(Note note) {
//		Note currentNote = null;//当前节点
//		while (true) {//循环向后找
//			Note nextNote = currentNote.next;//当前节点的下一个节点
//			if (nextNote==null) {//当前节点的下一个节点为空，当前节点是最后一个节点
//				break;
//			}
//			currentNote = nextNote;//当前节点为最后一个节点
//		}
//		currentNote.next=note;//为最后一个节点追加节点
//	}
	/*
	 *	1.为节点追加节点：第3版:第一个append第二个，第二个append第三个，可以连着append
	 *		注意用的是while循环，找最后一个节点，找到最后最后一个节点，把新节点追加到最后一个节点之后                                                                                                                                                          
	 */
	public DNode append(DNode dNode) {
		DNode currentNote = this;//this为当前链表,也就是第一个节点
		while (true) {//循环向后找
			DNode nextNote = currentNote.next();//当前节点的下一个节点
			if (nextNote==null) {//当前节点的下一个节点为空，当前节点是最后一个节点
				break;
			}
			currentNote = nextNote;//当前节点赋给当前节点，循环跳出时当前节点为最后一个节点
		}
		currentNote.next=dNode;//为最后一个节点追加节点
		return currentNote;
	}
	/*
	 * 2.获得当前节点的节点值
	 */
	public int getData() {
		return this.data;
	}
	/*
	 * 3.当前节点的下一个节点
	 */
	public DNode next() {
		return this.next;
	}
	
	/**
	 * 
	 * @Description:4.删除当前节点的下一个节点;当前节点不可删除
	 * 	实现方式：
	 * 		1.取出下下个节点
	 * 		2.把下下个节点作为当前节点的下个节点
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019年12月11日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public void removeNext() {
		DNode newNext = next.next;
		this.next=newNext;
	}
	
	/**
	 * 
	 * @Description:5.给一个节点插入一个新节点，其实是把新节点放在当前节点的后面一个节点
	 * 		取出当前节点的下一个节点，作为下下一个节点；
	 * 		把新节点作为下一个节点
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019年12月17日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public void after(DNode dNode) {//n1.next.after(note5)
		DNode nextNote = next;// 现成的链表n1=1，2，4		n1.next=1,2		next=4
		this.next=dNode;//this=1,2
		dNode.next=nextNote;
	}
	/**
	 * 
	 * @Description:显示所有节点信息
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019年12月11日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
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
		 * 	首先，单链表是一串节点，对于整个操作就是append；需要指定位置添加、删除都需要指定类似于下标的东西
		 * 	0.单链表new之后节点数目是有限的
		 *	1.单链表加节点就是拼节点
		 *	2.单链表删除节点首先删除的是一个节点，其次删除的节点，把删除的这个节点从单链表中剔除
		 *	3.单链表添加节点，下个节点作为下下个节点，新节点作为下一个节点
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
//		System.out.println(n1.next().getData());//1：只能一个和另一个首位相连
		
//		n1.append(n2);
//		n1.append(n3);
//		System.out.println(n1.next().getData());//2：第一个接第二个，第一个接第三个
		
		n1.append(n2).append(n3).append(n4).append(n5).append(n6).append(n7);//拼一块之后，n1就是一个整体
//		System.out.println(n1.next.getData());//3：第一个接第二个，第二个接第三个，连着接
		n1.show();
		System.out.println();
		
		
		n1.next.removeNext();//单链接删除节点
		n1.show();
		System.out.println();
		
		DNode note33 = new DNode(33);
		n1.next.after(note33);//单链表插入节点
		n1.show();
		System.out.println();
		
		n1.after(n7);//after方法必须得有2个节点
		n1.show();
		System.out.println();
	}
}
