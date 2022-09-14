public class Array_InterviewProblems_MaximumPositivity {
        public static int[] solve(int[] A) {

            int ArrayLength = A.length;

            int sum = 0;
            int prevsum = A[0];
            int EndIndex = A.length-1;
            int StartIndex = 0;
            int MaxSum = 0;
            for( int i=0;i<ArrayLength;i++)
            {
                sum = sum + A[i];

                if(sum<prevsum)
                {
                    sum = 0;
                    StartIndex = i+1;
                    prevsum = -1;
                }
                else
                {
                    MaxSum = Math.max(sum,MaxSum);
                    EndIndex = i;
                    prevsum = MaxSum;

                }

            }

            int[] MaxSizeSubArray = new int[EndIndex-StartIndex];
            int l = 0;
            for(int i=StartIndex;i<=EndIndex;i++)
            {
                MaxSizeSubArray[l] = A[i];
                l++;
            }

            return MaxSizeSubArray;


        }

    public static void main(String[] args) {
        int[] A = {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};
        solve(A);
    }
}
