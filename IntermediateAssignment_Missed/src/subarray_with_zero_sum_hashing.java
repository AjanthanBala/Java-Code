import java.util.*;

public class subarray_with_zero_sum_hashing {
    public static int solve(int[] A) {

        int sum = 0;

        HashMap <Integer,Integer> map = new HashMap<>();

        int[] prfx = new int[A.length];
        for(int j=0;j<A.length;j++)
        {
            sum = sum+A[j];


            if(map.containsKey(sum)==false)
            {
                if (A[j]==0||sum==0)
                {
                    return 1;
                }
                map.put(sum,1);
            }

            else if (map.containsKey(sum)||A[j]==0||sum==0)
            {
                return 1;
            }


        }
        return 0;
    }

    public static void main(String[] args) {
        int [] A = {-1, 1};
        System.out.println(solve(A));
    }
}
