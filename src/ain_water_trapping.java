public class ain_water_trapping {

        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public static int trap(final int[] A) {

            int max = -1;

            int amount = 0;
            int sum = 0;

            for(int i= 1;i<A.length-1;i++)
            {
                int leftmax = -1;
                int rightmax = -1;
                for(int lmax =i-1;lmax>=0;lmax--)
                {
                    leftmax = Math.max(A[lmax],leftmax);


                }
                System.out.print("leftmax is" + leftmax);
                for(int rmax=i+1;rmax<A.length;rmax++)
                {
                    rightmax = Math.max(A[rmax],rightmax);

                }
                System.out.println(",    rightmax is" + rightmax + "   A[i] is "+ A[i]);
                amount = Math.min(leftmax,rightmax) -A[i];

                if(amount<0)
                {
                    amount = 0;
                }
                System.out.println("amount is "+ amount);
                sum +=amount;
                System.out.println("sum is "+ sum);
                System.out.println();
                System.out.println();

            }

            return sum;
        }

    public static void main(String[] args) {
        int A[]={56, 6, 52, 43, 23, 47, 48, 38, 96, 46, 30, 66, 80, 15, 62, 71, 61, 12, 98, 9, 28, 81, 70, 59, 95, 34, 9, 60, 70, 81, 71, 67, 58, 20, 22, 3, 95, 85, 20, 24, 74, 5, 23, 33, 75, 50, 38, 75, 68, 26, 46, 30, 75, 18, 4, 42, 51, 59, 8, 77};
        System.out.println(trap(A));
    }

}
