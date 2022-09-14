public class Arrays_InterviewProblems_Christmastrees {
    public static void main(String args[]) {
        int A[] = {2, 4, 5, 4, 10};
        int B[] = {40, 30, 20, 10, 40};
        System.out.println(solve(A, B));

    }

    public static int solve(int[] A, int[] B) {

        int final_ans =Integer.MAX_VALUE;

        for (int j = 0; j < A.length; j++) {

            int minsumR = Integer.MAX_VALUE;
            int minsumL = Integer.MAX_VALUE;

            for (int i = 0; i < j; i++) {
                if (A[i] < A[j]) {
                    int suml = B[i];
                    minsumL = Math.min(minsumL, suml);
                }
            }

            for (int k = j + 1; k < A.length; k++) {
                if (A[j] < A[k]) {
                    int sumr = B[k];
                    minsumR = Math.min(minsumR, sumr);
                }
            }

            if (minsumL == Integer.MAX_VALUE || minsumR == Integer.MAX_VALUE) {
                continue;
            }

            final_ans = Math.min( (minsumR + minsumL + B[j]),final_ans);
        }

        if (final_ans == Integer.MAX_VALUE)
        {return -1;}

        return final_ans;

    }
}
