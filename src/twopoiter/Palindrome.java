package twopoiter;

public class Palindrome {

    public boolean isPalindrome(String s) {

        int left = 0; int right = s.length() - 1;
        char[] arraySource = s.toCharArray();
        while (left < right) {

            while (!isAlphaNumeric(arraySource[left]) && left < right) {
                left++;
            }

            while (!isAlphaNumeric(arraySource[right]) && left < right) {
                right--;
            }

            if (Character.toLowerCase(arraySource[left]) != Character.toLowerCase(arraySource[right]) && left != right) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    protected boolean isAlphaNumeric(char ch) {
        if (
                (ch >= '0' && ch <= '9' )
                || (ch >= 'a' && ch <= 'z')
                || (ch >= 'A' && ch <= 'Z')
        ) {
            return true;
        }
        return false;
    }
}
