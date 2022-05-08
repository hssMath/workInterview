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
     * ��ӡ��������ֵ
     * @param listNode
     */
    public static void show(ListNode listNode) {
        ListNode currentNote = listNode;
        while (null!=currentNote) {//ѭ���˳��������д����������ں����ڲ�ʹ����ѭ����
            System.out.print(currentNote.val+" ");
            currentNote = currentNote.next;
        }
    }
}