package CLeetCodeExercise.bnode;

import Tool.ListNode;

import java.util.ArrayList;

/**
 * 给一个单链表的头结点，判断是否为回文链表：
 *      给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false。
 */
public class A21IsPalindrome {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(IsPalindrome(l1));
    }

    /**
     * 思路：使用值比较的方式
     * 1.将单链表转化为集合。
     * 2.使用双指针，对数组进行循环遍历，首、位元素进行对比，不想等返回false，相等返回true。
     * @param head
     * @return
     */
    public static boolean IsPalindrome(ListNode head){
        if(head==null) return false;
        ArrayList<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0,j=list.size()-1; i < list.size(); i++,j--) {
            if (list.get(i)!=list.get(j)){
                return false;
            }
        }
        return true;
    }


    public boolean isPalindromeByJava(ListNode head) {
        if (head == null || head.next == null) return true;//要实现 O(n) 的时间复杂度和 O(1) 的空间复杂度，需要翻转后半部分

        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {//根据快、慢指针，找到链表的中点。
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while(slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head){
        if (head.next == null) {// 递归到最后一个节点，返回新的新的头结点
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
