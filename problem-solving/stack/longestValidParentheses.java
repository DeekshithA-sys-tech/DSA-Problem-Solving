
import java.util.Stack;


public class longestValidParentheses{
     public static int longestValidParentheses(String s) {
        // int result = 0 ;
        // int left = 0;
        // int right = 0;
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == '('){
        //         left++;
        //     }else{
        //         right++;
        //     }
        //     if(left == right){
        //         result = Math.max(result, left * 2);
        //     }else if(right > left){
        //         left = right = 0;
        //     }
        // }
        // return result;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        char[] ch = s.toCharArray();
        stack.push(-1);
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i]=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    result = Math.max(result,i-stack.peek());
                }
            }
        }
        return result;
      
    }
    
    public static void main(String[] args) {
        String s = "))()()";
        System.out.println(longestValidParentheses(s));
        
    }
}