import java.util.*;
public class LC125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            char left = s.charAt(i);
            char right = s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }
            if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LC125_ValidPalindrome obj = new LC125_ValidPalindrome();
        System.out.println(obj.isPalindrome(s));
        sc.close();
    }
}
