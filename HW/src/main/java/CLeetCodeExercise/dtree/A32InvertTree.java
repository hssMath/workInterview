package CLeetCodeExercise.dtree;

import Tool.TreeNode;

/**
 * 226����һ�ö������ĸ��ڵ� root ����ת��ö�����������������ڵ㡣
 */
public class A32InvertTree {
    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2,new TreeNode(1),new TreeNode(3));
        TreeNode treeNode7 = new TreeNode(7,new TreeNode(6),new TreeNode(9));
        TreeNode treeNode4 = new TreeNode(4,treeNode2,treeNode7);
        TreeNode invertTreeNode = invertTree(treeNode4);
        System.out.println(invertTreeNode);
    }

    /**
     * ʹ��˫�ݹ�,˼·��
     * @param root
     * @return
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

}
