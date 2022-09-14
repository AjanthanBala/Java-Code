import java.util.*;

public class Sorting_Noble_Integer {
    public static int solve(int[] A) {

        Arrays.sort(A);
        int n = A.length;

        for(int i=0;i<n;i++)
        {
            if(A[i]==A[i+1])
            { continue;}
            if(A[i]==n-i-1){
                return 1;
            }
        }

        return -1;


    }
    public static void main(String args[]) {
        int A[] = {6,7,5};

        System.out.println(solve(A));

    }
}
