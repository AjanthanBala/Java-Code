public class Remove_elem_make_odd_even_equal {
        public static int solve(int[] A) {
//program not working. Try solving this
            int sum = A.length/2;
            int sumeven = 0;
            int sumodd = 0;
            int o = 1;
            int e = 1;


            int count = 0;

            if(A.length == 1 || A.length==2)
            {
                return 0;

            }


            for(int i = 2;i<A.length;i++)
            {
                if(i%2==0)
                {
                    sumeven = sumeven+ A[i];
                }

                else
                {
                    sumodd =sumodd + A[i];
                }
            }

            int curr_even = 0;
            int curr_odd = 0;

            for(int i = 0;i<A.length;i++)
            {
                if(i%2==0)
                {
                    curr_even = sumodd;
                    curr_odd = sumeven - A[i];

                    if(curr_even == curr_odd)
                    {
                        count++;
                    }

                }

                else
                {
                    curr_odd = sumeven - sumodd;
                    curr_even = sumeven - sumodd;
                }
            }
            return count;

        }

    public static void main(String[] args) {
        {
            int[] A = { 1, 2, 3, 7, 1, 2, 3 };
            System.out.println(solve(A));
        }
    }

}
