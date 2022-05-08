package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * 删除单链表中的重复元素：给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * 对应 leetcode 的第 83 题
 */
public class A16DeleteNodeDuplicates {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(1);
        ListNode l13 = new ListNode(2);
        ListNode l14 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;//创建单链表l11
        ListNode.show(deleteNodeDuplicates(l11));
    }

    /**
     * 思路：因为是升序排列故此处用值比较的方式。
     * 1.链表是升序排列的，重复元素是相邻的，所以就可以用当前节点的 val 与当前节点的下个节点的 val，进行比较。
     * 2.如果相等，使得当前节点的 next 指向当前节点的 下下个节点。
     * 3.因为链表中可能有多组重复，所以使用while循环遍历直到 最后一个节点的下个节点为空时 跳出循环，最终返回原链表。
     * @param listNode
     */
    public static ListNode deleteNodeDuplicates(ListNode listNode){
        ListNode currenListNode = listNode;
        while (null != currenListNode.next){
            if (currenListNode.next.val == currenListNode.val) {
                currenListNode.next = currenListNode.next.next;
            }else {
                currenListNode = currenListNode.next;
            }
        }
        return listNode;
    }
}
