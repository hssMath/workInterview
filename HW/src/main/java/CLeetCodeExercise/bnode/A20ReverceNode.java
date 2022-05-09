package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * 反转链表：给你单链表的头节点 head ，返回反转后的链表。
 * 对应 leetcode 的第 206 题,反转链表
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
     * 具体过程：
     *  1、遍历整个链表，每到一个节点，断开当前节点与后面节点的指针，并用临时变量记录后一个节点。
     *  2、然后当前节点指向上一个节点，即可以将指针逆向。首次执行的节点为 null。
     *  3、再轮换当前指针与上一个指针，让它们进入下一个节点及下一个节点的前序节点。
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
