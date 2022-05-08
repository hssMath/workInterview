package CLeetCodeExercise.cstackqueue;

import java.util.Stack;

/**
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * 实现 MyQueue 类：
 *      1、void push(int x) 将元素 x 推到队列的末尾
 *      2、int pop() 从队列的开头移除并返回元素
 *      3、int peek() 返回队列开头的元素
 *      4、boolean empty() 如果队列为空，返回 true ；否则，返回 false
 *
 * 对应的是 leetcode 的232题
 * 思路：
 *      1.使用jdk自带的Stack类，来定义并声明栈。
 */
public class A24MyQueue {
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;

    public A24MyQueue() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    public void push(int x) {//push元素是往输入栈中添加元素
        inStack.push(x);
    }

    public int pop() {//获取元素并移除：将元素一次性从输入栈转到输出栈
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {//获取元素时不移除元素 ：将元素一次性从输入栈转到输出栈
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
