
import java.util.*;

public class Hashing_Distinct_numbers {
        public static int[] dNums(int[] A, int B) {

            int N = A.length;
            int [] arr = new int[N-B+1];
            int l = 0;

            if(B>N)
            {
                return arr;
            }
            HashMap <Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < B; i++)
            {   if (map.containsKey(A[i]))
            {
                map.put(A[i], map.get(A[i]) + 1);
            }
            else    
            {
                map.put(A[i],1);
            }
            }

            arr[0] = map.size();
            int iter = 1;


            for (int i = B; i < A.length; i++) {

                if (map.get(A[i - B]) == 1)
                {
                    map.remove(A[i - B]);
                }

                else
                {
                    map.put(arr[i - B], map.get(A[i - B]) - 1);
                }


                // Add new element of current window
                // If this element appears first time,
                // set its count as 1,

                if (map.containsKey(A[i]))
                {
                    map.put(A[i], map.get(A[i]) + 1);
                }
                else
                {
                    map.put(A[i],1);
                }

                // Print count of current window
                arr[iter] = map.size();
                iter++;
            }


                /*for(int j = i;j<i+B;j++)
                {
                    set.add(A[j]);

                }
                arr[l] = set.size();
                System.out.println(arr[l]);
                l++;

            }*/

            return arr;
        }

    public static void main(String[] args) {
        int [] A = {1, 2, 1, 3, 4, 3 };
        int B = 3;
       int []C = (dNums(A,B));
       for(int i=0;i<C.length;i++)
       {
           System.out.println(C[i]);
       }
    }

}
