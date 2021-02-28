package leedcode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * 示例 ：
 * 输入：s = "()"
 * 输出：true
 *
 * 输入：s = "([)]"
 * 输出：false
 *
 * 输入：s = "{[]}"
 * 输出：true
 */
public class IsValid {

    public static void main(String[] args) {

        String s = "{}";
        System.out.println(isValid(s));
    }

    /**
     * 进栈出栈
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            if (ch == ')'){
                if (stack.isEmpty() || stack.pop() != '(')
                    return false;
            }
            if (ch == '}'){
                if (stack.isEmpty() || stack.pop() != '{')
                    return false;
            }
            if (ch == ']'){
                if (stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
