public class Selection_Sort {
    public static int[] sort(int []A)

            //Bubble sort
    {
        int len = A.length;

        int temp = 0;
        int min = Integer.MAX_VALUE;
        int idx = 0;

        for(int i =0;i<len;i++)
        {
            for(int j =0 ;j<len-1;j++)
            {
                if(A[j+1]<A[j])
                {
                    temp =A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }

            }
        }
        for(int i =0;i<len;i++)
        {
            for(int j =0 ;j<len-1;j++)
            {
                if(A[j+1]<A[j])
                {
                    temp =A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }

            }
        }

        return A;


    }

    public static void main(String[] args) {
        int [] A = {9,5,3,6,8,7,2,1,4};
        int [] B = (sort(A));
        for(int i = 0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
}
