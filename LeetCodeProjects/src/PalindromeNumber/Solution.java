package PalindromeNumber;

class Solution {
    public static boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x));
        String rev = new StringBuilder(String.valueOf(x)).reverse().toString();
        if (str.toString().equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(121);
        isPalindrome(-121);
        isPalindrome(10);
    }
}