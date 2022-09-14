public class longest_continuous_zero_sum {
    public static int[] lszero(int[] A) {

        int [] prfx_arr = new int[A.length];
        int sum = 0;
        int max_index = 0;
        int index=0;

        for(int i = 0;i<A.length;i++)
        {
            sum =sum + A[i];
            prfx_arr[i] = sum;
        }


        for(int j = 0;j<A.length;j++)
        {
            if(prfx_arr[j]==0)
            {
                index = j;
            }

            max_index = Math.max(max_index,index);
        }

        int [] res_arr = new int[max_index];
        for(int k = 0;k<max_index;k++)
        {
            res_arr[k] = A[k];
        }

        return res_arr;
    }

    public static void main(String[] args) {
        int [] A = {1, 2, -2, 4, -4 };
        A =  lszero(A);

        for(int i : A)
        {
            System.out.println(A[i]);
        }
    }
}
