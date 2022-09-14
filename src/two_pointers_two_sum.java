public class two_pointers_two_sum {

        public static int[] solve(int[] A, int B) {

            int len = A.length;

            int i =0;

            int sum = A[0];

            int noresult[] = {-1};
            int start = 0;
            int end = 0;



            for(int j=1;j<=len;)
            {
                if(sum>B && i<j)
                {
                    sum = sum- A[i];
                    i++;
                }

                if(sum==B)
                {
                    start = i;
                    end = j;
                    break;
                }


                else {
                    if (sum < B && j<len) {
                        sum = sum + A[j];
                        j++;
                        continue;

                    }

                    if(sum>B)
                    {
                        sum = sum - A[i];
                        i++;
                    }

                }


            }
            int ret[] = new int[end-start];
            int s = 0;
            for(int k = start;k<end;k++)
            {
                ret[s] = A[k];
                s++;
            }

            if(end>0)
            {
                return ret;
            }

            return noresult;



        }

    public static void main(String[] args) {
        int A[] = {5, 10, 20, 100, 105 };
        int B = 110;

        int C[] = solve(A,B);
        System.out.println(C[0]);
        System.out.println(C[1]);
    }

}
