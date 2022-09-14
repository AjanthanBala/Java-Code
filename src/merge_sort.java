public class merge_sort {
    public static int[] solve(final int[] A, final int[] B) {

        int Alen = A.length;
        int Blen = B.length;



        int temp = 0;
        int min = Integer.MAX_VALUE;
        int idx = 0;

        for(int i =0;i<Alen;i++)
        {
            for(int j =0 ;j<Alen-1;j++)
            {
                if(A[j+1]<A[j])
                {
                    temp =A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }

            }
        }
        for(int i =0;i<Blen;i++)
        {
            for(int j =0 ;j<Blen-1;j++)
            {
                if(B[j+1]<B[j])
                {
                    temp =B[j+1];
                    B[j+1] = B[j];
                    B[j] = temp;
                }

            }
        }

        int [] C = new int [Alen+Blen];

        int Aiter = 0;
        int Biter = 0;
        int iter = 0;
        while(Aiter< Alen && Biter<Blen)
        {
            if(A[Aiter]<B[Biter])
            {
                C[iter] = A[Aiter];
                Aiter++;
                iter++;
            }

            else
            {
                C[iter] = B[Biter];
                Biter++;
                iter++;
            }

        }

        while(Aiter<Alen)
        {
            C[iter] = A[Aiter];
                    Aiter++;
                    iter++;
        }

        while(Biter<Blen)
        {
            C[iter] = B[Biter];
            Biter++;
            iter++;
        }
        return C;
    }

    public static void main(String[] args) {
        int [] A = {-4, 3 };
        int [] B = {-2,-2};
        int [] C = (solve(A,B));
        for(int i = 0;i<C.length;i++)
        {
            System.out.print(C[i]+" ");
        }
    }
}
