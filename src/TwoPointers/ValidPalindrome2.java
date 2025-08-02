package TwoPointers;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "aca";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isValid(s, l + 1, r) || isValid(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean isValid(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}    
