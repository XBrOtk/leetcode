import java.util.*;


class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;
        int count = 0;
        char operater = '+';
        
        for(int i = 0; i < n; i++) {
            char cur = s.charAt(i);
            if(Character.isDigit(cur)){
                count = count * 10 + (cur - '0');
            }
            if(cur == '+' || cur == '-' || cur == '*' || cur == '/' || i == n - 1){
                if(operater == '+'){
                    stack.push(count);
                }
                else if(operater == '-'){
                    stack.push(-count);
                }
                else if(operater == '*'){
                    stack.push(stack.pop() * count);
                }
                else if(operater == '/'){
                    stack.push(stack.pop() / count);
                }
                operater = cur;
                count = 0;

            }
        }
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args){
        Solution test = new Solution();
        Scanner sc = new Scanner(System.in); 
        String str= sc.nextLine(); 
        System.out.print(test.calculate(str));
    }
}