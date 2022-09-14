/* import java.util.*;

public class Dictionary_HashMap {
    public static int solve(String[] A, String B) {
        HashMap <Character,Integer> map = new HashMap<>();
        int value = 1;
        for(int i = 0;i<B.length();i++)
        {
            map.put(B.charAt(i),value);
            value++;
        }

        int flag = 1;

    for(int k = 1;k<A.length;k++) {
        String word = A[k];
        char first = A[0];
        char second = A[k];

            if (map.containsKey(word.charAt(j))) {
                if (map.get(word.charAt(j)) > map.get(word.charAt(j - 1))) {
                    flag = 1;
                } else {
                    return 0;
                }
            }
        }
    }
        if(flag == 1)
        {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        String [] A = {"hello", "scaler", "interviewbit"};
        String B = "adhbcfegskjlponmirqtxwuvzy";
        System.out.println(solve(A,B));
    }
}
*/