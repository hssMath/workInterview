package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * 返回链表的中间结点：给定一个头结点为 head 的非空单链表，返回链表的中间结点;如果有两个中间结点，则返回第二个中间结点。
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
     * 思路：
     *  1.通过快指针到达表尾来判断，因为慢指针慢，只有快指针才能到达表尾。
     *  2.快指针到达表尾判断：快指针的下个节点为空&&自己不能为空
     *  3.返回慢指针。
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head){
        if(head==null) return null;
        ListNode fast = head;//双指针作用的都是同一个链表
        ListNode slow = head;//双指针作用的都是同一个链表
        while (fast!=null && fast.next!=null ){//快指针到达链表尾部，把慢指针返回就ok了。
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
