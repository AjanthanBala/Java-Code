public class Arrays_InterveiwProblems_ChristmasTree {
        public int solve(int[] A, int[] B) {



            int minsum = Integer.MAX_VALUE;
            int minsumleft = Integer.MAX_VALUE;
            int minsumright = Integer.MAX_VALUE;

            for(int j =A.length/2;j<A.length;j++)
            {
                int suml = 0;
                int sumr = 0;
                for(int i=0;i<j;i++)
                {
                    if(A[i]<A[j])
                    {
                        suml = B[i] + B[j];
                        minsumleft = Math.min(minsumleft,suml);
                    }
                }

                for( int k =j+1;k<A.length;k++)
                {
                    if(A[j]<A[k])
                    {
                        sumr = B[j] + B[k];
                        minsumright = Math.min(minsumright,sumr);
                    }

                }

                minsum = Math.min(minsumright+minsumleft, minsum);
            }

            if( minsum == Integer.MAX_VALUE)
            {
                return -1;
            }

            return minsum;


        }

    public static void main(String[] args) {
        int A[]={};
    }

}
