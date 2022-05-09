package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * ��ת�������㵥�����ͷ�ڵ� head �����ط�ת�������
 * ��Ӧ leetcode �ĵ� 206 ��,��ת����
 */
public class A20ReverceNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode reverseList = reverseList(l1);
        while (reverseList != null) {
            System.out.println(reverseList.val);
            reverseList = reverseList.next;
        }
    }

    /**
     * ������̣�
     *  1��������������ÿ��һ���ڵ㣬�Ͽ���ǰ�ڵ������ڵ��ָ�룬������ʱ������¼��һ���ڵ㡣
     *  2��Ȼ��ǰ�ڵ�ָ����һ���ڵ㣬�����Խ�ָ�������״�ִ�еĽڵ�Ϊ null��
     *  3�����ֻ���ǰָ������һ��ָ�룬�����ǽ�����һ���ڵ㼰��һ���ڵ��ǰ��ڵ㡣
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode next = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = next;
        }
        return preNode;
    }
}
