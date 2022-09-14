public class Alternating_SubArrays_Easy {
    public static int[] solve(int[] A, int B) {
            int len = 2*B+1;
            int [] C = new int[A.length-len+1];
            int n = A.length;
            int k=0;
            int prev = -1;
            for(int i=0;i<len+i;i++)
            {
                 int flag = 1;
                for(int j = i;j<len+i;j++)
                {
                    if(A[j]==prev)
                    {
                        flag = 0;
                        break;
                    }

                    prev = A[j];
                }

                if(flag==1)
                {
                    C[k] = i;
                    k++;
                }

            }

            return C;
    }

    public static void main(String[] args)
    {
        int [] A =  {0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        int B = 1;
        solve(A,B);
    }
}
