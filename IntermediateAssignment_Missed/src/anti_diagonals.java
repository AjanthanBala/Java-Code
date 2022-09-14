import java.util.*;
public class anti_diagonals {

        public static int[][] diagonal(int[][] A) {

            //The total number of internal rows in the final list will be 2*noofrows(A) - 1
            int size = 2*A[0].length - 1;
            int r = A.length;
            int [][] ans = new int[size][r];
            int count = 0;
            ;

            //Count of the number of rows


            //Time complexity: O(size*r^2)
            //Space complexity: O(size)
            while( count < size)
            {
               // Arrays.fill(ans[count],0);
                int temp =0;
                for( int i = 0; i < r; i++ )
                {
                    for( int j = 0; j < r; j++ )
                    {
                        if( ((i + j) == count)){
                            ans[i][j]=A[i][j];
                       }

                        //Continue when the indices sum up to be > count
                        else if((j>=i) && j > count)
                        {
                                continue;

                        }




                    }

                }
                System.out.println();
                count++;
            }
            return ans;
        }

    public static void main(String[] args) {
        int A [][] = {{1,2,3} ,{4,5,6},{7,8,9}};


        int [][]B =diagonal(A);

        for(int i =0;i<B.length;i++)
        {
            for(int j = 0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
    }

}
