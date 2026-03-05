package DSA.datastructres.linear.stack;

import java.util.Stack;

public class ValidParenthesis {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {   // {,[,(,),],}
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;

            }
        }
        return true; //the string is valid parenthesis
    }
    public static void main(String[] args) {
        String s1="{([])}";
        String s2="[[])(}";
        System.out.println(s1+"->" + (isValid(s1) ? "valid":"invalid"));
        System.out.println(s2+"->" + (isValid(s2) ? "valid":"invalid"));

    }
}