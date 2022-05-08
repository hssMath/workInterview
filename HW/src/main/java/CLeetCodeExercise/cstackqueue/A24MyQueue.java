package CLeetCodeExercise.cstackqueue;

import java.util.Stack;

/**
 * �����ʹ������ջʵ�������ȳ����С�����Ӧ��֧��һ�����֧�ֵ����в�����push��pop��peek��empty����
 * ʵ�� MyQueue �ࣺ
 *      1��void push(int x) ��Ԫ�� x �Ƶ����е�ĩβ
 *      2��int pop() �Ӷ��еĿ�ͷ�Ƴ�������Ԫ��
 *      3��int peek() ���ض��п�ͷ��Ԫ��
 *      4��boolean empty() �������Ϊ�գ����� true �����򣬷��� false
 *
 * ��Ӧ���� leetcode ��232��
 * ˼·��
 *      1.ʹ��jdk�Դ���Stack�࣬�����岢����ջ��
 */
public class A24MyQueue {
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;

    public A24MyQueue() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    public void push(int x) {//pushԪ����������ջ�����Ԫ��
        inStack.push(x);
    }

    public int pop() {//��ȡԪ�ز��Ƴ�����Ԫ��һ���Դ�����ջת�����ջ
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {//��ȡԪ��ʱ���Ƴ�Ԫ�� ����Ԫ��һ���Դ�����ջת�����ջ
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
