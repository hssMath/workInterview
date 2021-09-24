import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
public class A7_Hard_MathCalculate {
    public static void main(String[] args) throws Exception{
        // 使用 map 维护一个运算符优先级
        // 这里的优先级划分按照「数学」进行划分即可
        HashMap<Character, Integer> mappings = new HashMap<>();
        mappings.put('+', 1);
        mappings.put('-', 1);
        mappings.put('*', 2);
        mappings.put('/', 2);
        mappings.put('%', 2);
        mappings.put('^', 3);

        // 双栈法
        Deque<Integer> nums = new LinkedList<>();//存放所有的数字
        Deque<Character> ops = new LinkedList<>();// 存放所有「非数字以外」的操作
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((str = br.readLine()) != null) {
            // 预处理
            str = str.replaceAll(" ", "");

            //为了防止第一个数为负数，先往 nums 加个 0
            str = str.replaceAll("\\(-", "\\(0-");
            str = str.replaceAll("\\(+", "\\(0+");
            str = str.replaceAll("\\[-", "\\[0-");
            str = str.replaceAll("\\[+", "\\[0+");
            str = str.replaceAll("\\{-", "\\{0-");
            str = str.replaceAll("\\{+", "\\{0+");

            nums.push(0);
            for(int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);
                if (cur == '(' || cur == '{' || cur == '[') {
                    // 左括号直接加入
                    ops.push(cur);
                } else if (cur == ')' || cur == '}' || cur == ']') {
                    // 右括号
                    while(!ops.isEmpty()) {
                        if (ops.peek() != '(' && ops.peek() != '{' && ops.peek() != '[') {
                            calc(nums, ops);
                        } else {
                            // 遇到左括号
                            ops.pop();
                            break;
                        }
                    }
                } else {
                    if (isNumber(cur)) {
                        // 数字,可能会出现123123这样的长数字
                        int u = 0;
                        int j = i;
                        while (j < str.length() && isNumber(str.charAt(j))) {
                            u = u * 10 + (str.charAt(j++) - '0');
                        }
                        nums.push(u);
                        i = j - 1; // 此时j在一个非数字的位置
                    } else {
                        // 有一个新操作要入栈时，先把栈内可以算的都算了
                        // 只有满足「栈内运算符」比「当前运算符」优先级高/同等，才进行运算
                        while (!ops.isEmpty() && (ops.peek() != '(' && ops.peek() != '{' && ops.peek() != '[')) {
                            char prev = ops.peek();
                            if (mappings.get(prev) >= mappings.get(cur)) {
                                // 栈中的操作符优先级高于当前遍历到的优先级
                                calc(nums,ops);
                            } else {
                                // 比栈中的优先级高
                                break;
                            }
                        }
                        // 将当前遍历到的优先级放到ops栈中
                        ops.push(cur);
                    }
                }
            }
            while (!ops.isEmpty() && (ops.peek() != '(' && ops.peek() != '{' && ops.peek() != '[')){
                calc(nums, ops);
            }
            System.out.println(nums.peek());
        }
    }

    public static boolean isNumber(char c) {
        return Character.isDigit(c);
    }

    public static void calc(Deque<Integer> nums, Deque<Character> ops) {
        // 没有数或者只有一个数或者没有操作数
        if (nums.isEmpty() || nums.size() < 2) return;
        if (ops.isEmpty()) return;
        // 计算
        int b = nums.pop(), a = nums.pop();
        char op = ops.pop();
        int ans = 0;
        if (op == '+') {
            ans = a + b;
        } else if (op == '-') {
            ans = a - b;
        } else if (op == '*') {
            ans = a * b;
        } else if (op == '/'){
            ans = a / b;
        } else if (op == '^') {
            ans = (int)Math.pow(a, b);
        } else if (op == '%') {
            ans = a % b;
        }
        nums.push(ans);
    }
}