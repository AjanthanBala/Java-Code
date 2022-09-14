/*public class Hashing_SubArray_GivenSum {
        public static int[] solve(int[] A, int B) {

            int sum = 0;
            int left = 0;
            int right = A.length-1;
            while(left<= right)
            {
                int sum = 0;
                for(int i =left;i<=right;i++)
                {
                    sum + =A[i];
                }

                if(sum>B)
                {
                    right--;
                }
                int sum = 0;

                for(int i =left;i<=right;i++)
                {
                    sum + =A[i];
                }

                if(sum>B)
                {
                    right--;
                }
            }

            return
        }

    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5 };
        int B = 5;
        System.out.println(solve(A,B));
    }

}
*/