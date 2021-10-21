package ALineConstract;
/**
 * 
 * @decription:循环链表
 * @class_name：LoopNote
 * @author hss
 * @author：heshuanshuan 
 * @date 2019年12月29日
 */
public class ELoopNode {
	private int data;//节点内容
	private ELoopNode next = this;//下一个节点
	
	/**
	 * 给节点添加节点内容
	 * @param value
	 */
	public ELoopNode(int value) {
		this.data=value;
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
	public ELoopNode next() {
		return this.next;
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
	public void after(ELoopNode note) { 
		ELoopNode nextNote = next;//取出下一节点，作为下下个节点
		this.next=note;//传入的节点作为当前节点的下一个节点
		note.next=nextNote;//下下一个节点作为新节点的下一个节点
	}
	
	public static void main(String[] args) {
		/*
		 * n1、n2、n3、n4：每一个都是独立的循环链表
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
		 * 与单链表的区别：
		 * 	1.单链表有开始节点、最后一个节点之分；循环链表没有
		 * 	2.单链表可以连着append；循环链表必须第一个接第一个，第二个接第三个，after
		 */
	}
}

