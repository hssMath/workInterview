package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * 倒数第k个节点or整数：输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点,从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 */
public class A23KthNodeFromEnd {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        System.out.println(kthNodeFromEnd(l1, 1).val);
    }

    /**
     * 思路：
     * 0.通过双指针在可以不需要知道链表的长度，因为两个指针之间的间距是固定的，当快指针移到尾部，慢指针就是倒数的第几个节点。
     * 1.通过给定的倒数第几个数，初始化快指针的初始值。
     * 2.快、慢指针都是以1个位移遍历单链表，快指针走到头时候，慢指针也就走到了指定的节点。
     * 时间复杂度：O(n),空间复杂度O(1)
     * 注意：
     *      1.for循环用来初始化指定位置的指针。
     *      2.快、慢指针每移动一次。
     * @param head
     * @param k
     * @return
     */
    public static ListNode kthNodeFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        if (k <= 0 || head == null) return null;//健壮性判断
        for (int i = 1; i < k; i++) {//快指针首先向前移动k-1次，成为初始的快指针。
            if (fast != null) {
                fast = fast.next;
            }
        }
        while (fast.next != null) {//快指针走到头时候，慢指针就是指定的节点。
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
