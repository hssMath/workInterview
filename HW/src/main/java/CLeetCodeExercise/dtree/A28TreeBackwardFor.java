package CLeetCodeExercise.dtree;

import Tool.TreeNode;

import java.util.*;

/**
 * ����һ�ö������ĸ��ڵ� root ��������ڵ�ֵ�� ������� ��
 * ��Ӧ leetcode �� 145 ��
 */
public class A28TreeBackwardFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1, new TreeNode(), new TreeNode(2, new TreeNode(3), new TreeNode()));
        list = (ArrayList<Integer>) accessTreeByStack(root, list);//�������ķ���
        System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }

    /**
     * ʹ�õݹ�ʵ�ֶ����������������������->���ڵ�->��������
     *
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByDiedai(TreeNode root, List<Integer> list) {
        if (root == null) return null;
        accessTreeByDiedai(root.left, list);//��ȥ��������
        accessTreeByDiedai(root.right, list);//��ȥ��������
        list.add(root.val);//���Ҹ��ڵ�
        return list;
    }

    /**
     * ѭ��������O(n)
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
