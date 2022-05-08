package CLeetCodeExercise.dtree;

import Tool.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class A27TreeRorwardFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1, new TreeNode(), new TreeNode(2, new TreeNode(3), new TreeNode()));
        list = (ArrayList<Integer>) accessTreeByStack(root, list);//访问树的方法
        System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }

    /**
     * 使用递归实现二叉树的中序遍历：左子树->根节点->右子树。
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByDiedai(TreeNode root, List<Integer> list) {
        if (root == null) return null;
        list.add(root.val);//再找根节点
        accessTreeByDiedai(root.left, list);//先去找左子树
        accessTreeByDiedai(root.right, list);//再去找右子树
        return list;
    }

    /**
     * 循环迭代遍历，O(n)
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByStack(TreeNode root, List<Integer> list) {
        List<Integer> res = new ArrayList<Integer>();//用来存放数的的节点值

        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return res;
    }
}