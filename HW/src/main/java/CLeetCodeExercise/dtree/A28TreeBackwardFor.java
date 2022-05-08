package CLeetCodeExercise.dtree;

import Tool.TreeNode;

import java.util.*;

/**
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 * 对应 leetcode 的 145 题
 */
public class A28TreeBackwardFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1, new TreeNode(), new TreeNode(2, new TreeNode(3), new TreeNode()));
        list = (ArrayList<Integer>) accessTreeByStack(root, list);//访问树的方法
        System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }

    /**
     * 使用递归实现二叉树的中序遍历：左子树->根节点->右子树。
     *
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByDiedai(TreeNode root, List<Integer> list) {
        if (root == null) return null;
        accessTreeByDiedai(root.left, list);//先去找左子树
        accessTreeByDiedai(root.right, list);//再去找右子树
        list.add(root.val);//再找根节点
        return list;
    }

    /**
     * 循环遍历，O(n)
     *
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByStack(TreeNode root, List<Integer> list) {
        List<Integer> res = new ArrayList<Integer> ();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode prevAccess = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prevAccess) {
                res.add(root.val);
                prevAccess = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }
}
