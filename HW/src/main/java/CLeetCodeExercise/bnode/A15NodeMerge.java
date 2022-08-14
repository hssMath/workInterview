package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * leetcode 合并2个有序链表：将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 对应的是 leetcode 的第 21 题
 */
public class A15NodeMerge {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l11.next.next = l13;//创建单链表l11

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l21.next.next = l23;//创建单链表l21

        ListNode.show(mergeTwoLists(l11,l21));
    }

    /**
     * 合并链表，思路：通过新建一个值为0的临时节点，然后通过一个while循环遍历取两个链表的节点比较大小追加到这个节点上，返回临时节点的next。
     * 1.使用双指针,因为两个链表是数值类型，且是递增的，故可以使用节点的值比较的方式。
     * 2.需要新建一个值为0的临时空链表，来储存合并的链表（原因:合并后的链表长度=leftHead的链表长度+rightHead的链表长度）
     * 3.通过 while 循环遍历+节点值比较的方式来给临时空链表进行追加节点。
     * 4.如果有个链表的 next 为空时，跳出循环，将后面长出来的进行拼接。
     * @param leftHead
     * @param rightHead
     * @return
     */
    public static ListNode mergeTwoLists(ListNode leftHead, ListNode rightHead) {
        ListNode preheated = new ListNode(0);//新建一个值为0的临时节点，然后通过一个while循环遍历取两个链表的节点比较大小追加到这个节点上，返回临时节点的next。
        ListNode prev = preheated;
        while (leftHead != null && rightHead != null) {//如果有一个为空，就跳出循环了。
            if (leftHead.val <= rightHead.val) {//比较2个链表，把小的链表给追加给临时空链表。
                prev.next = leftHead;
                leftHead = leftHead.next;
            } else {
                prev.next = rightHead;
                rightHead = rightHead.next;
            }
            prev = prev.next;//用来获取临时链表的下一个节点，然后不断用新的节点链表来覆盖不理想的节点链表。
        }
        prev.next = leftHead == null ? rightHead : leftHead; // 合并后 leftHead 和 rightHead 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        return preheated.next;
    }
}
