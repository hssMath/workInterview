package CLeetCodeExercise.dtree;

import Tool.TreeNode;

/**
 * 104. ��������������:
 *      ����һ�����������ҳ��������ȣ������������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
 */
public class A30TreeBigDeep {

    /**
     * ͨ���ݹ�ʵ�ֻ�ȡ��������������
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}