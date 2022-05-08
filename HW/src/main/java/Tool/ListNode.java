package Tool;
/**
 * Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /**
     * 打印输出链表的值
     * @param listNode
     */
    public static void show(ListNode listNode) {
        ListNode currentNote = listNode;
        while (null!=currentNote) {//循环退出条件最好写在这里，避免在函数内部使用死循环。
            System.out.print(currentNote.val+" ");
            currentNote = currentNote.next;
        }
    }
}