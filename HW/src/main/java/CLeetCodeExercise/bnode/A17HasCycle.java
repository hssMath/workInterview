package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * ����һ�������ж��������Ƿ��л�����Ӧ Leetcode �ĵ� 141 �⡣
 * 1.�Ƿ����ʹ�ã����� boolean ���͵�ֵ
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
     * ˼·��������ʵ��Ŀ�귴������������ƶϡ��ƶ��Ĳ����ڹ�����һ����1��2��������
     *  1.ʹ��˫ָ�룬����ָ��һ����1���ڵ㣬�ÿ�ָ��һ����2���ڵ㡣
     *  2.���ܵĿ�Ľڵ�ĵ����¸��ڵ� == �ܵ������¸��ڵ�ʱ����һ�������ˣ�˵���л���
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head){
        if (null == head) return false;//����Ҫ��ӷǿյ��ж�
        ListNode fastPtr  = head,slowPtr  = head;//ͨ��ԭ������һ���졢��ָ�롣
        while (fastPtr.next != null || fastPtr.next.next != null){//1��ʹ�ÿ�ָ�������жϣ�����Ϊ����Ϊ2��2�������������ָ����¸��ڵ�Ϊ�ղ��ҿ�ָ����¸��ڵ�Ϊ�ա�˵��û�л���
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {////ѭ����ֹ��������ָ��ָ��Ľڵ�=��ָ��ָ��Ľڵ㣬��Ϊ��ֹ������˵���л���
                return true;
            }
        }
        return false;
    }
}
