package DSA.datastructres.linear.stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    static int evaluate(String exp){
        Stack<Integer> stack=new Stack<>();
        for (char c : exp.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-'0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
            switch (c){
                case '+'->stack.push(a+b);
                case '-'-> stack.push(a-b);
                case '*'->stack.push(a*b);
                case'/'->stack.push(a/b);
            }

            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter postfix expression:");
        String exp = sc.nextLine();

        int result = evaluate(exp);

        System.out.println("Result: " + result);

        sc.close();
    }
}
