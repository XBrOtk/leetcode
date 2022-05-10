import java.util.*;


class Solution1249 {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> moveRight = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            else if (s.charAt(i) == ')') {
                if (!stack.empty()) {
                    stack.pop();
                }
                else{
                    moveRight.add(i);
                }
                
            }
        
        }
        Set<Integer> set1 = new HashSet<Integer>(stack);
        Set<Integer> set2 = new HashSet<Integer>(moveRight);
        Set<Integer> needMove = new HashSet<Integer>();
        needMove.addAll(set1);
        needMove.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(needMove);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!needMove.contains(i)) {
                res.append(s.charAt(i));
            }
        }
        System.out.println(res);
        return res.toString();
    }
}