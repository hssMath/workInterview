package CLeetCodeExercise.dtree;

import Tool.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回它的中序遍历。注意：输出为一个数组类型。
 * 对应 leetcode 的第 94 题。
 * 题目：要求输出为一个数组，因为树的节点数是未知的，只能使用list去接收每个遍历的节点，然后再通过list转数据来实现。
 */
public class A26TreeMiddleFor {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode node2 = new TreeNode(2,new TreeNode(3),null);
        TreeNode root = new TreeNode(1, null, node2);//本地构造一个树
        list = (ArrayList<Integer>) accessTreeByDiedai(root, list);//访问树并将树输出为一个list
        System.out.println(Arrays.toString(list.toArray(new Integer[]{})));
    }

    /**
     * 循环迭代遍历，O(n),使用栈，思路：
     * 1.默认给的是整个树的根节点，进入第一个while循环遍历，若根节点不为空或者栈不为空，首次为true，接着进入第二个循环遍历，如果根节点不为空，首次为true，把整个树的 root 节点 push 到栈中，
     *      同时将root节点的左子节点 push 到栈中，并依次将所有的左节点，直到整树的最左节点都 push 到栈中。
     * 2.直到根节点的左子树为时退出第二个循环，然后使用pop方法取出栈顶第一个节点作为第1个root节点，并add该根节点的值到list中。list的第1个值就拿到了。
     * 3.接着，取出最左根节点的的右子树，其为空。从头开始进入第1个 while判断，第2个条件为 true，接着进入第2个 while判断，条件为 false，接着使用pop方法取出栈顶第一个节点作为第2个root节点，并add该根节点的值到list中。list的第2个值就拿到了。
     * 4.接着，取出第2个root节点的右子树，其值不为空。将其作为第3个root节点，再经过第1个判断为true，第2个while判断为true，将”第2个root节点的右子树“加入到栈顶，因为其没有左子树，退出第二个while循环。
     * 5.此时的栈顶元素为H,接着，使用pop方法取出栈顶的H作为第4个root节点，并add该根节点的值到list中。list的第3个值就拿到了。
     * 6.依次类推，取出全部元素。
     *
     * 注意:
     *      1.首先会用左子节点将栈压满，在压的过程中，root会被不断的重置并赋予新值。
     *      2.第一次栈满，全都是树的所有左子树，然后从栈顶取元素，取的元素实际是最左节点，也即是底层级的根节点。
     *      3.然后依次取每一个根节点的右子节点。进行2个while的判断，不是空取出加入list中即可。
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByStack(TreeNode root, List<Integer> list) {
        List<Integer> res = new ArrayList<Integer>();//用来存放数的的节点值

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
     * 使用递归实现二叉树的中序遍历：左子树->根节点->右子树。
     * @param root
     * @param list
     * @return
     */
    public static List<Integer> accessTreeByDiedai(TreeNode root, List<Integer> list) {
        if (root == null) return null;
        accessTreeByDiedai(root.left, list);//先去找左子树：左子树的根节点传进去
        list.add(root.val);//再找根节点
        accessTreeByDiedai(root.right, list);//再找右子树
        return list;
    }
}
