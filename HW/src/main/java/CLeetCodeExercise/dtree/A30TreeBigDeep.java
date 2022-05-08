package CLeetCodeExercise.dtree;

import Tool.TreeNode;

/**
 * 104. 二叉树的最大深度:
 *      给定一个二叉树，找出其最大深度；二叉树的深度为根节点到最远叶子节点的最长路径上的节点数；说明: 叶子节点是指没有子节点的节点。
 */
public class A30TreeBigDeep {

    /**
     * 通过递归实现获取二叉树的最大深度
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