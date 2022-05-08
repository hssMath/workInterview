package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * 相交链表：给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，就返回 null。
 * 对应leetcoe的 160 题
 */
public class A19MutNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        //4,1,8,4,5

        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = l3;
        l3.next = l4;
        l4.next = l5;
        //5,6,1,8,4,5

        if (null != getIntersectionNode(l1, n1)) {
            System.out.println(getIntersectionNode(l1, n1).val);
        }else {
            getIntersectionNode(l1, n1);
        }
    }

    /**
     * 使用双指针法，思路：
     *  1.用一个 while 循环遍历两个双链表，首先添加一个非空判断，保证之后的处理与判断的链表都不为空，进而避免提交时出现空指针错误提示。
     *  2.遍历时，2个链表分别新建一个指针，如果各自的节点不为空，就取其对应的 next 节点。
     *  3.直到遍历出现一个链表的next节点为空时，将指针指向另外一个链表，此时，第二个链表的指针改未到第二个节点。（相当于让跑快一步的指针转换到路程短1步的链表上，同时跑的慢的链表就能追上跑得快的指针了）
     *  4.如果2个指针相等了，说明就到相交节点了。
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {//此种方式，不需要考虑2个链表的长度大小差异。
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
            if (pA == pB && pA == null && pB == null) {//若2个链表的步数一致时，指向的节点都为null，则没有相交节点，返回null。
                return null;
            }
        }
        return pA;
    }

    /**
     * 使用比较法，思路：
     * 1.通过遍历获取2个链表的长度，并获取2个链表的长度差。
     * 2.去掉多余的节点，使得2个链表都从相同的长度位置进行比较。
     * 3。如果2个链表相等（核心。链表相等用的是链表的节点进行比较），就退出循环遍历；如果不相等就继续用2个链表的 next 进行比较，如果到2个都不为空时，就获取到了相交相交节点；如果两个都为空，说明没有相交节点，通过while条件退出循环。
     * 注意：有2个非空判断：初始链表的进行非空判断；初始链表经过next后，再进行给控判断。
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNodeByFor(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;//初始链表的进行非空判断。
        ListNode leftNode = headA;
        ListNode rightNode = headB;
        int L1 = 0;
        int L2 = 0;
        int diff = 0;
        while (leftNode!=null){//统计链表headA的长度
            L1++;
            leftNode = leftNode.next;
        }
        while (rightNode!=null){//统计链表headA的长度
            L2++;
            rightNode = rightNode.next;
        }
        if(L1 < L2){//左边链表的长度>=右边链表的长度
            leftNode = headB;rightNode = headA;diff =L2- L1;
        }else{
            leftNode = headA;rightNode = headB;diff =L1- L2;
        }
        for(int i = 0; i < diff; i++){//因为长度大的链表在左侧，让长度大的的链表与短的链表相同的长度开始比较。
            leftNode = leftNode. next;
        }
        while(leftNode != null && rightNode !=null) {//初始链表经过next后，再进行给控判断。因为是从相同位置进行比较，故2者需要添加一个非空判断。
            if(leftNode == rightNode){//如果2个链表相等，就退出循环遍历；如果不相等就继续用2个链表的next进行比较，如果到2个都不为空时，就获取到了相交相交节点；如果两个都为空，说明没有相交节点，通过while条件退出循环。
                return leftNode ;
            }
            leftNode= leftNode.next;
            rightNode= rightNode.next;
        }
        return null;
    }
}
