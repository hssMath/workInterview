package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * ɾ���������е��ظ�Ԫ�أ�����һ��������������ͷ head �� ɾ�������ظ���Ԫ�أ�ʹÿ��Ԫ��ֻ����һ�� ������ ����������� ��
 * ��Ӧ leetcode �ĵ� 83 ��
 */
public class A16DeleteNodeDuplicates {
    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(1);
        ListNode l13 = new ListNode(2);
        ListNode l14 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;//����������l11
        ListNode.show(deleteNodeDuplicates(l11));
    }

    /**
     * ˼·����Ϊ���������йʴ˴���ֵ�Ƚϵķ�ʽ��
     * 1.�������������еģ��ظ�Ԫ�������ڵģ����ԾͿ����õ�ǰ�ڵ�� val �뵱ǰ�ڵ���¸��ڵ�� val�����бȽϡ�
     * 2.�����ȣ�ʹ�õ�ǰ�ڵ�� next ָ��ǰ�ڵ�� ���¸��ڵ㡣
     * 3.��Ϊ�����п����ж����ظ�������ʹ��whileѭ������ֱ�� ���һ���ڵ���¸��ڵ�Ϊ��ʱ ����ѭ�������շ���ԭ����
     * @param listNode
     */
    public static ListNode deleteNodeDuplicates(ListNode listNode){
        ListNode currenListNode = listNode;
        while (null != currenListNode.next){
            if (currenListNode.next.val == currenListNode.val) {
                currenListNode.next = currenListNode.next.next;
            }else {
                currenListNode = currenListNode.next;
            }
        }
        return listNode;
    }
}
