import java.util.*;
public class Pairs_with_given_difference_two_pointers {
    public static int solve(int[] A, int B) {
        int len =A.length;
        int count= 0;

        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i=0;i<len;i++)
        {
            if(map.containsKey(A[i]))
            map.put(A[i],map.get(A[i]+1));

            else
                map.put(A[i],1);

        }

        for(int i = 0;i<A.length;i++)
        {
            if(map.containsKey(A[i]+B))
            {
                if(B==0)
                {

                    if(map.get(A[i])>=1)
                    {
                        count++;
                    }
                }
                else {
                    count++;
                    System.out.println(Math.max(A[i], B) + " " + Math.min(A[i], B));
                }
            }
        }


        return count;


    }

    public static void main(String[] args) {
        int A[] = {1,1,1,1,1};
                int B = 0;

        System.out.println(solve(A,B));
    }
}
