package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * leetcode �ϲ�2������������������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ�
 * ��Ӧ���� leetcode �ĵ� 21 ��
 */
public class A15NodeMerge {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l11.next.next = l13;//����������l11

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l21.next.next = l23;//����������l21

        ListNode.show(mergeTwoLists(l11,l21));
    }

    /**
     * �ϲ�����˼·��ͨ���½�һ��ֵΪ0����ʱ�ڵ㣬Ȼ��ͨ��һ��whileѭ������ȡ��������Ľڵ�Ƚϴ�С׷�ӵ�����ڵ��ϣ�������ʱ�ڵ��next��
     * 1.ʹ��˫ָ��,��Ϊ������������ֵ���ͣ����ǵ����ģ��ʿ���ʹ�ýڵ��ֵ�Ƚϵķ�ʽ��
     * 2.��Ҫ�½�һ��ֵΪ0����ʱ������������ϲ�������ԭ��:�ϲ����������=leftHead��������+rightHead�������ȣ�
     * 3.ͨ�� while ѭ������+�ڵ�ֵ�Ƚϵķ�ʽ������ʱ���������׷�ӽڵ㡣
     * 4.����и������ next Ϊ��ʱ������ѭ���������泤�����Ľ���ƴ�ӡ�
     * @param leftHead
     * @param rightHead
     * @return
     */
    public static ListNode mergeTwoLists(ListNode leftHead, ListNode rightHead) {
        ListNode preheated = new ListNode(0);//�½�һ��ֵΪ0����ʱ�ڵ㣬Ȼ��ͨ��һ��whileѭ������ȡ��������Ľڵ�Ƚϴ�С׷�ӵ�����ڵ��ϣ�������ʱ�ڵ��next��
        ListNode prev = preheated;
        while (leftHead != null && rightHead != null) {//�����һ��Ϊ�գ�������ѭ���ˡ�
            if (leftHead.val <= rightHead.val) {//�Ƚ�2��������С�������׷�Ӹ���ʱ������
                prev.next = leftHead;
                leftHead = leftHead.next;
            } else {
                prev.next = rightHead;
                rightHead = rightHead.next;
            }
            prev = prev.next;//������ȡ��ʱ�������һ���ڵ㣬Ȼ�󲻶����µĽڵ����������ǲ�����Ľڵ�����
        }
        prev.next = leftHead == null ? rightHead : leftHead; // �ϲ��� leftHead �� rightHead ���ֻ��һ����δ���ϲ��꣬����ֱ�ӽ�����ĩβָ��δ�ϲ����������
        return preheated.next;
    }
}
