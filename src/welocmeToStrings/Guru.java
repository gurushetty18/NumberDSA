package welocmeToStrings;

import java.util.Stack;

public class Guru {
public static boolean  ValidParenthesis(String ch) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : ch.toCharArray()) {
		if (c == '{' || c=='(' || c == '[') {
			stack.push(c);
		}
		else {
			if (stack.isEmpty()) return false;
			char top = stack.pop();
			if ((c == '}' && top !='{') ||
					(c == ']' && top !='[') ||
					(c == ')' && top !='(') 
					) {
				return false ;
			}
		}
	}
	return stack.isEmpty();
}
public static void main(String[] args) {
System.out.println(ValidParenthesis("{}"));
System.out.println(ValidParenthesis("[)") );
System.out.println(ValidParenthesis("()"));
}
}
