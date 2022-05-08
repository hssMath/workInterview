package CLeetCodeExercise.dtree;

import Tool.TreeNode;

/**
 * 101. �Գƶ�����������һ���������ĸ��ڵ� root��������Ƿ���Գơ�
 */
public class A29IsSymmetricTree {
    public static void main(String[] args) {

    }

    /**
     * ���õݹ�ʵ��
     * @param left
     * @param right
     * @return
     */
    boolean deepCheck(TreeNode left, TreeNode right) {
        //�ݹ����ֹ�����������ڵ㶼Ϊ��;���������ڵ�����1��Ϊ��;���������ڵ��ֵ�����
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        //�ٵݹ�ıȽ���ڵ�����Ӻ��ҽڵ���Һ����Լ��Ƚ���ڵ���Һ��� ���ҽڵ������
        return deepCheck(left.left, right.right) && deepCheck(left.right, right.left);
    }
}
