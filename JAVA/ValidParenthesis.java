import java.util.*;
import java.io.*;

class Solution {

    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<Character>();
        if (s=="") return true;
        if (s.charAt(0) == ']' || s.charAt(0) == '}' ||s.charAt(0) == ']'){
            return false;
        }

        stack.add('*');
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '['){
                char ch = s.charAt(i);
                stack.add(ch);
            }
            if (s.charAt(i) == ')' ) {
                if (stack.get(stack.size()-1) == '('){
                    stack.remove(stack.size() -1 );
                }
                else{return false;}
            }
            else if (s.charAt(i) == '}' ) {
                if (stack.get(stack.size()-1) == '{'){
                    stack.remove(stack.size() -1 );
                }
                else{return false;}
            }
            else if (s.charAt(i) == ']' ) {
                if (stack.get(stack.size()-1) == '['){
                    stack.remove(stack.size() -1 );
                }
                else{return false;}
            }
        }
    if (stack.get(stack.size() - 1) == '*'){
        return true;
    }
    else
        return false;
    }
}




public class ValidParenthesis {

    public static void main(String[] args) {
        String s="[])";
        Solution obj1 = new Solution();
        Boolean result;
        result = obj1.isValid(s);
        System.out.println(result);
    }
}
