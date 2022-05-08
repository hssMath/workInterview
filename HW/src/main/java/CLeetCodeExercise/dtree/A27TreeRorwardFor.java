package CLeetCodeExercise.dtree;

import Tool.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ����������ĸ��ڵ� root ���������ڵ�ֵ�� ǰ�� ������
 */
public class A27TreeRorwardFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1, new TreeNode(), new TreeNode(2, new TreeNode(3), new TreeNode()));
        list = (ArrayList<Integer>) accessTreeByStack(root, list);//�������ķ���
        System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }

    /**
     * ʹ�õݹ�ʵ�ֶ����������������������->���ڵ�->��������
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByDiedai(TreeNode root, List<Integer> list) {
        if (root == null) return null;
        list.add(root.val);//���Ҹ��ڵ�
        accessTreeByDiedai(root.left, list);//��ȥ��������
        accessTreeByDiedai(root.right, list);//��ȥ��������
        return list;
    }

    /**
     * ѭ������������O(n)
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByStack(TreeNode root, List<Integer> list) {
        List<Integer> res = new ArrayList<Integer>();//����������ĵĽڵ�ֵ

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