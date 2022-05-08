package CLeetCodeExercise.dtree;

import Tool.TreeNode;

/**
 * 101. 对称二叉树：给你一个二叉树的根节点 root，检查它是否轴对称。
 */
public class A29IsSymmetricTree {
    public static void main(String[] args) {

    }

    /**
     * 采用递归实现
     * @param left
     * @param right
     * @return
     */
    boolean deepCheck(TreeNode left, TreeNode right) {
        //递归的终止条件是两个节点都为空;或者两个节点中有1个为空;或者两个节点的值不相等
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        //再递归的比较左节点的左孩子和右节点的右孩子以及比较左节点的右孩子 和右节点的左孩子
        return deepCheck(left.left, right.right) && deepCheck(left.right, right.left);
    }
}
