import java.util.*;
public class Largest_Continuous_Sequence_Zero_Sum {

        public static int[] lszero(int[] A) {
            HashMap<Integer, Integer> map
                    = new HashMap<>();

            int sum = 0;
            int prev_sum_index = 1000;
            int current_sum_index = 0;
            int length = 0;
            int max_length = 0;
            int first_sum_index = A.length;

           /* if(A.length==1 && A[0]==0)
            {
                return new int[1] = 1;
            }

            else{
                if(A.length==1)
                {
                    return new int
                }
            }*/

            for(int i=0;i<A.length;i++)
            {
                sum +=A[i];

                if(sum==0)
                {
                    first_sum_index = 0;
                    current_sum_index = i;
                    length = i-0+1;

                }
                if(map.containsKey(sum))
                {
                    int prev_length= 0;

                    prev_sum_index = map.get(sum);
                    prev_length = i-prev_sum_index;

                    current_sum_index = i;
                    map.put(sum, i);

                }

                else
                {
                    map.put(sum,i);
                }
            }
            int longest = Math.max(length,current_sum_index-prev_sum_index);
            int [] arr = new int[longest];

            if(length==longest)
            {
                prev_sum_index = first_sum_index;
                current_sum_index = first_sum_index+length;
            }

            else{
                prev_sum_index = prev_sum_index+1;
                current_sum_index = current_sum_index+1;
            }
            int iter = 0;
            for(int j = prev_sum_index;j<current_sum_index;j++)
            {
                arr[iter] = A[j];
                iter++;
            }


            return arr;
        }

    public static void main(String[] args) {
        int A [] ={ 1, 2, -1, 1, 3, -1, 1, 4 };

        int B[] = lszero(A);
        for(int x:B)
        {
            System.out.print(x + " ");
        }
    }

}
