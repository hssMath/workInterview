package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * ������k���ڵ�or����������һ����������������е�����k���ڵ㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ�������������β�ڵ��ǵ�����1���ڵ㡣
 * ���磬һ��������6���ڵ�,��ͷ�ڵ㿪ʼ�����ǵ�ֵ������1��2��3��4��5��6���������ĵ�����3���ڵ���ֵΪ4�Ľڵ㡣
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
     * ˼·��
     * 0.ͨ��˫ָ���ڿ��Բ���Ҫ֪������ĳ��ȣ���Ϊ����ָ��֮��ļ���ǹ̶��ģ�����ָ���Ƶ�β������ָ����ǵ����ĵڼ����ڵ㡣
     * 1.ͨ�������ĵ����ڼ���������ʼ����ָ��ĳ�ʼֵ��
     * 2.�졢��ָ�붼����1��λ�Ʊ�����������ָ���ߵ�ͷʱ����ָ��Ҳ���ߵ���ָ���Ľڵ㡣
     * ʱ�临�Ӷȣ�O(n),�ռ临�Ӷ�O(1)
     * ע�⣺
     *      1.forѭ��������ʼ��ָ��λ�õ�ָ�롣
     *      2.�졢��ָ��ÿ�ƶ�һ�Ρ�
     * @param head
     * @param k
     * @return
     */
    public static ListNode kthNodeFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        if (k <= 0 || head == null) return null;//��׳���ж�
        for (int i = 1; i < k; i++) {//��ָ��������ǰ�ƶ�k-1�Σ���Ϊ��ʼ�Ŀ�ָ�롣
            if (fast != null) {
                fast = fast.next;
            }
        }
        while (fast.next != null) {//��ָ���ߵ�ͷʱ����ָ�����ָ���Ľڵ㡣
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
