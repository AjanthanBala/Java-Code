public class Arrays_3_MinimumSwaps {

        public static int solve(int[] A, int B) {

            int swap = 0;
            int count = 0;

            int temp = Integer.MIN_VALUE;

            for(int i = 0;i<A.length;i++)
            {
                if(A[i]<=B)
                {
                    count++;
                }
            }
            int bad_num = 0;
            for(int i =count;i<A.length;i++) {


                if(A[i]<=B)
                {
                    for(int l = i-1;l>=0;l--)
                    {
                        if(A[l]<=B)
                        {

                        }
                    }
                }



            }


                   /* for(int j = i+1;j<A.length;j++)
                    {
                        int temp = 0;
                        if(A[j]<=B)
                        {
                            temp = A[j];
                            A[j] = A[i];
                            A[i] = temp;

                            swap++;
                            break;
                        }

                    }*/



            return swap;
        }

    public static void main(String[] args) {
        int[] A = {52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70 };
        int B = 19;
        System.out.println(solve(A,B));
    }

}
