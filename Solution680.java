import java.util.*;


class Solution680 {
    private boolean verify(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if (s.charAt(i) != s.charAt(j)){
                return (verify(s.substring(i + 1, j + 1)) || verify(s.substring(i, j)));
            }
            i ++;
            j --;
        }
        return true;
    }
}