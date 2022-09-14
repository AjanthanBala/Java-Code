import java.lang.*;
import java.util.*;

public class Strings_longest_prefix {
    public static String longestCommonPrefix(String[] A) {

        String ans = "";
        char ch = 'i';
        String final_ans = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

        String str_max = "";
        String str_min = "";

        int Max = 0;
        int Min = 10000007;

        for(int i = 0;i<A.length;i++)
        {
            String temp = A[i];
            if(temp.length()<Min)
            {
                Min = Math.min(temp.length(),Min);
                str_min = temp;
            }
        }
        int k=0;
        while(k<A.length) {
            ans = "";
            String temp = A[k];
            if(temp == str_min)
            {k++;
                continue;}
            for (int j = 0; j < str_min.length(); j++) {
                if (str_min.charAt(j) == temp.charAt(j)) {
                    ch = str_min.charAt(j);
                    ans = ans + ch;
                }
            }

            if(final_ans.length()>ans.length())
            {
                final_ans = ans;
            }
            k++;

        }

        return final_ans;



    }

    public static void main(String[] args) {
        String [] A = {"abcdefgh", "aefghijk", "abcefgh"};
        System.out.println(longestCommonPrefix(A));
    }
}
