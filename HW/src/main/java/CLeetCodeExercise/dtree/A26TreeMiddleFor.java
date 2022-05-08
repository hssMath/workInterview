package CLeetCodeExercise.dtree;

import Tool.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ����һ���������ĸ��ڵ� root �������������������ע�⣺���Ϊһ���������͡�
 * ��Ӧ leetcode �ĵ� 94 �⡣
 * ��Ŀ��Ҫ�����Ϊһ�����飬��Ϊ���Ľڵ�����δ֪�ģ�ֻ��ʹ��listȥ����ÿ�������Ľڵ㣬Ȼ����ͨ��listת������ʵ�֡�
 */
public class A26TreeMiddleFor {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode node2 = new TreeNode(2,new TreeNode(3),null);
        TreeNode root = new TreeNode(1, null, node2);//���ع���һ����
        list = (ArrayList<Integer>) accessTreeByDiedai(root, list);//���������������Ϊһ��list
        System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }

    /**
     * ѭ������������O(n),ʹ��ջ��˼·��
     * 1.Ĭ�ϸ������������ĸ��ڵ㣬�����һ��whileѭ�������������ڵ㲻Ϊ�ջ���ջ��Ϊ�գ��״�Ϊtrue�����Ž���ڶ���ѭ��������������ڵ㲻Ϊ�գ��״�Ϊtrue������������ root �ڵ� push ��ջ�У�
     *      ͬʱ��root�ڵ�����ӽڵ� push ��ջ�У������ν����е���ڵ㣬ֱ������������ڵ㶼 push ��ջ�С�
     * 2.ֱ�����ڵ��������Ϊʱ�˳��ڶ���ѭ����Ȼ��ʹ��pop����ȡ��ջ����һ���ڵ���Ϊ��1��root�ڵ㣬��add�ø��ڵ��ֵ��list�С�list�ĵ�1��ֵ���õ��ˡ�
     * 3.���ţ�ȡ��������ڵ�ĵ�����������Ϊ�ա���ͷ��ʼ�����1�� while�жϣ���2������Ϊ true�����Ž����2�� while�жϣ�����Ϊ false������ʹ��pop����ȡ��ջ����һ���ڵ���Ϊ��2��root�ڵ㣬��add�ø��ڵ��ֵ��list�С�list�ĵ�2��ֵ���õ��ˡ�
     * 4.���ţ�ȡ����2��root�ڵ������������ֵ��Ϊ�ա�������Ϊ��3��root�ڵ㣬�پ�����1���ж�Ϊtrue����2��while�ж�Ϊtrue��������2��root�ڵ�������������뵽ջ������Ϊ��û�����������˳��ڶ���whileѭ����
     * 5.��ʱ��ջ��Ԫ��ΪH,���ţ�ʹ��pop����ȡ��ջ����H��Ϊ��4��root�ڵ㣬��add�ø��ڵ��ֵ��list�С�list�ĵ�3��ֵ���õ��ˡ�
     * 6.�������ƣ�ȡ��ȫ��Ԫ�ء�
     *
     * ע��:
     *      1.���Ȼ������ӽڵ㽫ջѹ������ѹ�Ĺ����У�root�ᱻ���ϵ����ò�������ֵ��
     *      2.��һ��ջ����ȫ��������������������Ȼ���ջ��ȡԪ�أ�ȡ��Ԫ��ʵ��������ڵ㣬Ҳ���ǵײ㼶�ĸ��ڵ㡣
     *      3.Ȼ������ȡÿһ�����ڵ�����ӽڵ㡣����2��while���жϣ����ǿ�ȡ������list�м��ɡ�
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByStack(TreeNode root, List<Integer> list) {
        List<Integer> res = new ArrayList<Integer>();//����������ĵĽڵ�ֵ

        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    /**
     * ʹ�õݹ�ʵ�ֶ����������������������->���ڵ�->��������
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByDiedai(TreeNode root, List<Integer> list) {
        if (root == null) return null;
        accessTreeByDiedai(root.left, list);//��ȥ�����������������ĸ��ڵ㴫��ȥ
        list.add(root.val);//���Ҹ��ڵ�
        accessTreeByDiedai(root.right, list);//����������
        return list;
    }
}
