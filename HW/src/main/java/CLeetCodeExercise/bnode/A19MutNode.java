package CLeetCodeExercise.bnode;

import Tool.ListNode;

/**
 * �ཻ�������������������ͷ�ڵ� headA �� headB �������ҳ������������������ཻ����ʼ�ڵ㡣����������������ཻ�ڵ㣬�ͷ��� null��
 * ��Ӧleetcoe�� 160 ��
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
     * ʹ��˫ָ�뷨��˼·��
     *  1.��һ�� while ѭ����������˫�����������һ���ǿ��жϣ���֤֮��Ĵ������жϵ�������Ϊ�գ����������ύʱ���ֿ�ָ�������ʾ��
     *  2.����ʱ��2������ֱ��½�һ��ָ�룬������ԵĽڵ㲻Ϊ�գ���ȡ���Ӧ�� next �ڵ㡣
     *  3.ֱ����������һ�������next�ڵ�Ϊ��ʱ����ָ��ָ������һ��������ʱ���ڶ��������ָ���δ���ڶ����ڵ㡣���൱�����ܿ�һ����ָ��ת����·�̶�1���������ϣ�ͬʱ�ܵ������������׷���ܵÿ��ָ���ˣ�
     *  4.���2��ָ������ˣ�˵���͵��ཻ�ڵ��ˡ�
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {//���ַ�ʽ������Ҫ����2������ĳ��ȴ�С���졣
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
            if (pA == pB && pA == null && pB == null) {//��2������Ĳ���һ��ʱ��ָ��Ľڵ㶼Ϊnull����û���ཻ�ڵ㣬����null��
                return null;
            }
        }
        return pA;
    }

    /**
     * ʹ�ñȽϷ���˼·��
     * 1.ͨ��������ȡ2������ĳ��ȣ�����ȡ2������ĳ��Ȳ
     * 2.ȥ������Ľڵ㣬ʹ��2����������ͬ�ĳ���λ�ý��бȽϡ�
     * 3�����2��������ȣ����ġ���������õ�������Ľڵ���бȽϣ������˳�ѭ���������������Ⱦͼ�����2������� next ���бȽϣ������2������Ϊ��ʱ���ͻ�ȡ�����ཻ�ཻ�ڵ㣻���������Ϊ�գ�˵��û���ཻ�ڵ㣬ͨ��while�����˳�ѭ����
     * ע�⣺��2���ǿ��жϣ���ʼ����Ľ��зǿ��жϣ���ʼ������next���ٽ��и����жϡ�
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNodeByFor(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;//��ʼ����Ľ��зǿ��жϡ�
        ListNode leftNode = headA;
        ListNode rightNode = headB;
        int L1 = 0;
        int L2 = 0;
        int diff = 0;
        while (leftNode!=null){//ͳ������headA�ĳ���
            L1++;
            leftNode = leftNode.next;
        }
        while (rightNode!=null){//ͳ������headA�ĳ���
            L2++;
            rightNode = rightNode.next;
        }
        if(L1 < L2){//�������ĳ���>=�ұ�����ĳ���
            leftNode = headB;rightNode = headA;diff =L2- L1;
        }else{
            leftNode = headA;rightNode = headB;diff =L1- L2;
        }
        for(int i = 0; i < diff; i++){//��Ϊ���ȴ����������࣬�ó��ȴ�ĵ�������̵�������ͬ�ĳ��ȿ�ʼ�Ƚϡ�
            leftNode = leftNode. next;
        }
        while(leftNode != null && rightNode !=null) {//��ʼ������next���ٽ��и����жϡ���Ϊ�Ǵ���ͬλ�ý��бȽϣ���2����Ҫ���һ���ǿ��жϡ�
            if(leftNode == rightNode){//���2��������ȣ����˳�ѭ���������������Ⱦͼ�����2�������next���бȽϣ������2������Ϊ��ʱ���ͻ�ȡ�����ཻ�ཻ�ڵ㣻���������Ϊ�գ�˵��û���ཻ�ڵ㣬ͨ��while�����˳�ѭ����
                return leftNode ;
            }
            leftNode= leftNode.next;
            rightNode= rightNode.next;
        }
        return null;
    }
}
