package twopoiter;

public class ReverseWords {

    /**
     * @param str: a string
     * @return: return a string
     */
    public String reverseWords(String str) {
        int n = str.length();
        char[] arrayOrigin = str.toCharArray();

        int space = 0;
        for (int i = 0; i < n; i++) {
            if (arrayOrigin[i] == ' ') {
                reverse(arrayOrigin, space, i -1);
                space = i + 1;
            }
        }

        reverse(arrayOrigin, space, n - 1);

        reverse(arrayOrigin, 0, n - 1);
        return String.valueOf(arrayOrigin);
    }

    protected void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
}
