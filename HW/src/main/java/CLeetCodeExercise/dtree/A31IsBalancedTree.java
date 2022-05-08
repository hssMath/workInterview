package CLeetCodeExercise.dtree;

import Tool.TreeNode;

/**
 * 110.平衡二叉树：给定一个二叉树，判断它是否是高度平衡的二叉树;
 *      一棵高度平衡二叉树定义为：一个二叉树每个节点的左、右两个子树(以根节点分为2部分)的高度差的绝对值不超过 1 。
 */
public class A31IsBalancedTree {
    private static final int i =0;
    public static void main(String[] args) {
//        TreeNode treeNode9 = new TreeNode(9,null,null);
//        TreeNode treeNode20 = new TreeNode(20,new TreeNode(15),new TreeNode(7));
//        TreeNode treeNode3 = new TreeNode(3,treeNode9,treeNode20);
//        System.out.println(isBalanced(treeNode3));

        TreeNode treeNode23 = new TreeNode(3,new TreeNode(4),new TreeNode(4));
        TreeNode treeNode22 = new TreeNode(2,treeNode23,new TreeNode(3));
        TreeNode treeNode21 = new TreeNode(1,treeNode22,new TreeNode(2));
        System.out.println(isBalanced(treeNode21));
    }


    public static boolean isBalanced(TreeNode root) {
        if(root == null){//空树是平衡二叉树
            return true;
        }
        return recur(root) != -1;//不是空树，进行递归判断。
    }

    /**
     * 使用“双递归”判断一个树是否为平衡二叉树，定义：一个二叉树的所有子树的左、右子树(以根节点分为2部分)的高度差的绝对值不超过 1 。
     * 思路：
     * 1.从root节点的最左子树左、右节点，开始自下而上进行对比，先递归遍历获得最左节点，然后获取最左子节点到左null的长度，然后获取右子节点到null的距离；
     * 2.第一次距离肯定是<=1的，肯定是平衡二叉树。因为是递归，所以左子树的根节点是自下往上的，此时根节点值是3，
     *
     *
     * 复杂度分析：
     *      时间复杂度 O(N)： N 为树的节点数；最差情况下，需要递归遍历树的所有节点。
     *      空间复杂度 O(N)： 最差情况下（树退化为链表时），系统递归需要使用 O(N) 的栈空间。
     *
     * 注意：
     *      1.差的绝对值使用=> Math.abs(left - right)
     *      2.返回的数字不是-1，就是true，就是平衡二叉树。
     *      3.因为是递归，所以左子树的根节点是自下往上的。
     */
    private static int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
