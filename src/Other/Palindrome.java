package Other;

public class Palindrome {

    private static boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        boolean b = true;
        int l = text.length();
        for (int i = 0; i < l; i++) {
            b = b && text.charAt(i) == text.charAt(l - i - 1);
        }

        return b;
    }

    public static void main(String[] args) {
        String s = "Madam, I'm Adam!";

        System.out.print(isPalindrome(s));
    }

}
