package CLeetCodeExercise.bnode;

import Tool.ListNode;

import java.util.ArrayList;

/**
 * ��һ���������ͷ��㣬�ж��Ƿ�Ϊ��������
 *      ����һ���������ͷ�ڵ� head �������жϸ������Ƿ�Ϊ������������ǣ����� true �����򣬷��� false��
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
     * ˼·��ʹ��ֵ�Ƚϵķ�ʽ
     * 1.��������ת��Ϊ���ϡ�
     * 2.ʹ��˫ָ�룬���������ѭ���������ס�λԪ�ؽ��жԱȣ�����ȷ���false����ȷ���true��
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
        if (head == null || head.next == null) return true;//Ҫʵ�� O(n) ��ʱ�临�ӶȺ� O(1) �Ŀռ临�Ӷȣ���Ҫ��ת��벿��

        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {//���ݿ졢��ָ�룬�ҵ�������е㡣
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
        if (head.next == null) {// �ݹ鵽���һ���ڵ㣬�����µ��µ�ͷ���
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
