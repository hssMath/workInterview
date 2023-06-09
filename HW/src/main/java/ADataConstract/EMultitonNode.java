package ADataConstract;
/**
 * @decription:双向链表:由3部分组成，其中2头是双向链表，中间部分是节点值
 * @class_name：DoubleNode
 * @author hss
 * @author：heshuanshuan 
 * @date 2020年1月1日
 */
public class EMultitonNode {
	private EMultitonNode pre = this;//上一个节点指向自己
	private EMultitonNode next = this;//下一个节点指向自己
	private final int data;
	
	
	//初始化双向链表：
	public EMultitonNode(int data) {
		this.data=data;
	}
	
	//增加节点
	public void after(EMultitonNode node) {
		EMultitonNode nextNext = next;//（取出第一个整体节点3/3段处位置的节点，作为临时变量）双向循环链表由3部分组成
		this.next=node;// （让第一个整体的下一个节点指第二个整体）把新节点作为当前节点的下一节点
		node.pre=this;//（第二个整体的上一个节点指向第一个完整节点）把当前节点作为 新节点的前一个节点
		
		node.next = nextNext;//（第二个整体节点的3/3处节点指向临时变量[第一个完整节点3/3节点]）
		nextNext.pre=node;//临时变量的上一个节点指向第二个完成变量
	}
	
	public static void main(String[] args) {
		EMultitonNode doubleNode22 = new EMultitonNode(22);
		EMultitonNode doubleNode33 = new EMultitonNode(33);
		EMultitonNode doubleNode44 = new EMultitonNode(44);
		doubleNode22.after(doubleNode33);
		doubleNode33.after(doubleNode44);
	}
}
