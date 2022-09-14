import java.util.*;
public class testtt {
    public static String solve(String s) {
        if (s == null) return null;

        char[] c = s.toCharArray();
        int m = c.length;
        // step 1. clean up spaces
        char[] a = cleanSpaces(c, m);
        int n = a.length;
        // step 2. reverse the whole string
        reverse(a, 0, n - 1);
        // step 3. reverse each word
        reverseWords(a, n);
        return new String(a);
    }

    static void  reverseWords(char[] a, int n) {
        int i = 0, j = 0;
        while (i < n) {
            while (i < n && a[i] == ' ') {
                i++; // skip spaces
            }
            // i is now the first index in the non-space word

            // update right pointer
            j = i;
            while (j < n && a[j] != ' ') {
                j++; // skip non-spaces
            }
            // j is now the first space on the right of a word

            // reverse the word we just found
            reverse(a, i, j - 1);

            // update left pointer
            i = j;
        }
    }

    // trim leading, trailing and multiple spaces
    static char[] cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (i < n && j < n) {
            while (j < n && a[j] == ' ') {
                j++; // skip spaces
            }
            while (j < n && a[j] != ' ') {
                a[i++] = a[j++]; // copy non-spaces
            }
            while (j < n && a[j] == ' ') {
                j++; // skip spaces
            }
            if (j < n) {
                a[i++] = ' '; // append only one space
            }
        }

        return Arrays.copyOf(a, i);
    }

    // reverse a[] from a[i] to a[j]
    public static void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

    public static void main(String[] args) {
        String A = "this is blue ";
        System.out.println(solve(A));
    }

}
