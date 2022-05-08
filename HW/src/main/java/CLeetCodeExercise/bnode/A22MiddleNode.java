package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * ����������м��㣺����һ��ͷ���Ϊ head �ķǿյ���������������м���;����������м��㣬�򷵻صڶ����м��㡣
 * leetcode 876
 */
public class A22MiddleNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        System.out.println(middleNode(l1).val);
    }

    /**
     * ˼·��
     *  1.ͨ����ָ�뵽���β���жϣ���Ϊ��ָ������ֻ�п�ָ����ܵ����β��
     *  2.��ָ�뵽���β�жϣ���ָ����¸��ڵ�Ϊ��&&�Լ�����Ϊ��
     *  3.������ָ�롣
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head){
        if(head==null) return null;
        ListNode fast = head;//˫ָ�����õĶ���ͬһ������
        ListNode slow = head;//˫ָ�����õĶ���ͬһ������
        while (fast!=null && fast.next!=null ){//��ָ�뵽������β��������ָ�뷵�ؾ�ok�ˡ�
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
