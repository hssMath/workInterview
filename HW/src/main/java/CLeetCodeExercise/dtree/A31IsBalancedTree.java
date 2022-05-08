package CLeetCodeExercise.dtree;

import Tool.TreeNode;

/**
 * 110.ƽ�������������һ�����������ж����Ƿ��Ǹ߶�ƽ��Ķ�����;
 *      һ�ø߶�ƽ�����������Ϊ��һ��������ÿ���ڵ��������������(�Ը��ڵ��Ϊ2����)�ĸ߶Ȳ�ľ���ֵ������ 1 ��
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
        if(root == null){//������ƽ�������
            return true;
        }
        return recur(root) != -1;//���ǿ��������еݹ��жϡ�
    }

    /**
     * ʹ�á�˫�ݹ顱�ж�һ�����Ƿ�Ϊƽ������������壺һ����������������������������(�Ը��ڵ��Ϊ2����)�ĸ߶Ȳ�ľ���ֵ������ 1 ��
     * ˼·��
     * 1.��root�ڵ�������������ҽڵ㣬��ʼ���¶��Ͻ��жԱȣ��ȵݹ�����������ڵ㣬Ȼ���ȡ�����ӽڵ㵽��null�ĳ��ȣ�Ȼ���ȡ���ӽڵ㵽null�ľ��룻
     * 2.��һ�ξ���϶���<=1�ģ��϶���ƽ�����������Ϊ�ǵݹ飬�����������ĸ��ڵ����������ϵģ���ʱ���ڵ�ֵ��3��
     *
     *
     * ���Ӷȷ�����
     *      ʱ�临�Ӷ� O(N)�� N Ϊ���Ľڵ������������£���Ҫ�ݹ�����������нڵ㡣
     *      �ռ临�Ӷ� O(N)�� �������£����˻�Ϊ����ʱ����ϵͳ�ݹ���Ҫʹ�� O(N) ��ջ�ռ䡣
     *
     * ע�⣺
     *      1.��ľ���ֵʹ��=> Math.abs(left - right)
     *      2.���ص����ֲ���-1������true������ƽ���������
     *      3.��Ϊ�ǵݹ飬�����������ĸ��ڵ����������ϵġ�
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
