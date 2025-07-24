package TwoPointers;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));//olleh

    }
    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        return new String(chars); 
    }
}
