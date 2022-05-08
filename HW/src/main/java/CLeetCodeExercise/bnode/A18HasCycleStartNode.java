package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * ����һ�������ͷ�ڵ� head ����������ʼ�뻷�ĵ�һ���ڵ㡣��������޻����򷵻� null��
 * ��Ӧ��leetcode 142 �⡣
 * ���л�������ָ��ص�����ĵ�һ���ڵ㣬Ȼ����ָ��Ϳ�ָ��ͬʱ���һ���������ȣ���ȡ slowNode ���� fastNode ����һ���ڵ���ǻ��Ŀ�ʼ����㡣
 */
public class A18HasCycleStartNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;

        System.out.println(Solution(l1).val);
    }
    public static ListNode Solution(ListNode head){
        if (head == null) return null;
        ListNode fastNode = head;
        ListNode slowNode = head;
        boolean flag = false;
        while (fastNode.next!=null || fastNode.next.next!=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (slowNode == fastNode){//ѭ����ֹ��������ָ��ָ��Ľڵ�=��ָ��ָ��Ľڵ㣬��Ϊ��ֹ����
                flag = true;
                break;
            }
        }
        if (flag) {//˵���л�
            slowNode = head;//����л�����ָ��ص������ͷ�ڵ㡣
            while (slowNode == fastNode){//�������ָ�������ˣ��� slowNode ���� fastNode ����һ���ڵ���ǻ��Ŀ�ʼ����㡣
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
            return slowNode.next;//���������뻷�ĵ�һ���ڵ㡣
        }
        return null;//�޻�����null
    }
}
