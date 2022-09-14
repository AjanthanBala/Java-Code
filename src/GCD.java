import java.util.*;
public class GCD {
        public static int solve(int[] A) {

            int g = 1;
            int maxgcd = 9999999;
            Arrays.sort(A);

            if(A.length ==1)
            {
                return A[0];
            }

            for(int i = 1;i<A.length;i++)
            {

                for(int j = i+1;j<A.length-1;j++)
                {

                    g = gcd(A[i],A[j]);
                    maxgcd = Math.min(maxgcd,g);
                }
            }
            return maxgcd;
        }

        public static int gcd(int A, int B)
        {
            if(A==0)
            {
                return B;
            }

            return gcd(B%A,A);
        }

    public static void main(String[] args) {
        int [] A = { 3, 9, 6, 8, 3  };
        System.out.println(solve(A));
    }

    }
