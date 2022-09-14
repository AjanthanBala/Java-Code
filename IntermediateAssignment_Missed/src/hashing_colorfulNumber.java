import java.util.*;
import java.lang.*;
public class hashing_colorfulNumber {
    public static int solve(int A)
    {
        ArrayList <Integer> arr = new ArrayList<>();
        HashSet <Integer> myset = new HashSet<>();
        int sum = 0;
        int quo = 0;
        int div = 0;
        int count = 0;
        int B = A;
        while(A!=0)
        {
            B = B/10;
            count++;
        }
        B = A;
        int [] num_arr = new int[count];
        for(int i = 0;i<count;i++)
        {
            num_arr[i] = B/10;
            if(myset.contains(num_arr[i]*num_arr[i-1]))
            {
                return 0;
            }
            if(myset.contains(num_arr[i]))
            {
                return 0;
            }

            else
            {
                myset.add(num_arr[i]);
            }
        }


        return 1;

    }

    public static void main(String[] args) {
        int A = 236;
        System.out.println(solve(A));
    }
}

