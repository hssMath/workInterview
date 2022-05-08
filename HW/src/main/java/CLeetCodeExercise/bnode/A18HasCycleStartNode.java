package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * 给定一个链表的头节点 head ，返回链表开始入环的第一个节点。如果链表无环，则返回 null。
 * 对应的leetcode 142 题。
 * 若有环，则将慢指针回到链表的第一个节点，然后慢指针和快指针同时相加一步，如果相等，则取 slowNode 或者 fastNode 的下一个节点就是环的开始的起点。
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
            if (slowNode == fastNode){//循环终止条件：快指针指向的节点=慢指针指向的节点，则为终止条件
                flag = true;
                break;
            }
        }
        if (flag) {//说明有环
            slowNode = head;//如果有环，慢指针回到链表的头节点。
            while (slowNode == fastNode){//如果快慢指针相遇了，则 slowNode 或者 fastNode 的下一个节点就是环的开始的起点。
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
            return slowNode.next;//返回链表入环的第一个节点。
        }
        return null;//无环返回null
    }
}
