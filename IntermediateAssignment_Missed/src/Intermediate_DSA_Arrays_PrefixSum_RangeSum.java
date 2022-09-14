public class Intermediate_DSA_Arrays_PrefixSum_RangeSum {
    public long[] rangeSum(int[] A, int[][] B) {

        int Alen = A.length;
        int Blen = B.length;

        long [] C = new long[B.length];
        int[] D = new int[A.length];
        D[0]= A[0];
        for(int i = 1;i<A.length;i++)
        {
            D[i] = D[i-1]+A[i];
        }

        int left = 0;
        int right = 0;
        for (int j = 0; j < Blen; j++) {
            int sum = 0;
            for (int k = 0; k < 2; k++) {

                if(k==0) {
                    left = B[j][k];
                    continue;
                }
                right = B[j][k];
                if((right >left && right==left)||left == 1)
                {
                    sum = D[right-1];
                }

                else if(right>1 && left>1 && right==left)
                {
                    sum = D[right-1]- D[left-2];
                }



                else {
                    sum = D[right-1] - D[left - 2];
                }
                C[j] = sum;
            }


        }
        return C;

    }

    public static void main(String[] args) {


    }
}
