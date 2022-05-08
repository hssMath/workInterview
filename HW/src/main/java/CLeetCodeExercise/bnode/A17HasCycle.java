package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * 给定一个链表，判断链表中是否有环，对应 Leetcode 的第 141 题。
 * 1.是否存在使用，返回 boolean 类型的值
 */
public class A17HasCycle {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;
        System.out.println(A17HasCycle.hasCycle(l1));
    }

    /**
     * 思路：以最终实现目标反向出发，进行推断。移动的步数在工程上一般用1、2个步长。
     *  1.使用双指针，让慢指针一次跑1个节点，让快指针一次跑2个节点。
     *  2.当跑的快的节点的的下下个节点 == 跑的慢的下个节点时，第一次相遇了，说明有环。
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head){
        if (null == head) return false;//链表都要添加非空的判断
        ListNode fastPtr  = head,slowPtr  = head;//通过原链表创建一个快、慢指针。
        while (fastPtr.next != null || fastPtr.next.next != null){//1、使用快指针来作判断，是因为步长为2；2、如果出现了慢指针的下个节点为空并且快指针的下个节点为空。说明没有环。
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {////循环终止条件：快指针指向的节点=慢指针指向的节点，则为终止条件，说明有环。
                return true;
            }
        }
        return false;
    }
}
