// Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

// An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that:

// s = s1 + s2 + ... + sn
// t = t1 + t2 + ... + tm
// |n - m| <= 1
// The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
// Note: a + b is the concatenation of strings a and b.

import java.util.Scanner;

public class InterleavingString {

    public static boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();

        if (n + m != s3.length()) {
            return false;
        }

        boolean[] dp = new boolean[m + 1];
        dp[0] = true;

        for (int j = 1; j <= m; j++) {
            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        for (int i = 1; i <= n; i++) {
            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);

            for (int j = 1; j <= m; j++) {
                char current = s3.charAt(i + j - 1);

                dp[j] =
                        (dp[j] && s1.charAt(i - 1) == current) ||
                        (dp[j - 1] && s2.charAt(j - 1) == current);
            }
        }

        return dp[m];
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter s1: ");
            String s1 = sc.nextLine();

            System.out.print("Enter s2: ");
            String s2 = sc.nextLine();

            System.out.print("Enter s3: ");
            String s3 = sc.nextLine();

            boolean result = isInterleave(s1, s2, s3);
            System.out.println("Is Interleaving: " + result);
        }
    }
}
