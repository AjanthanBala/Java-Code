public class Sorting_reverse_Pairs {

        public static int solve(int[] A) {

            int  count =0;

            for(int i=0;i<A.length;i++)
            {
                for( int j = i+1;j<A.length;j++)
                {
                    if(A[i] %10000 > (long)2*((long)A[j]))
                    {
                        count++;
                    }
                }

            }

            return count;
        }

    public static void main(String[] args) {
        int []A = {2000000000, 2000000000, -2000000000};
        System.out.println(solve(A));
    }


}
