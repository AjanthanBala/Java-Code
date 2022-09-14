public class Row_to_Column_Zero {

        public static int[][] solve(int[][] A) {

            int [][]B = new int [A.length][A[0].length];
            for(int i = 0;i<A.length;i++)
            {
                for(int j = 0;j<A[0].length;j++)
                {
                    B[i][j] = -1;
                }
            }

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {


                    if (A[i][j] == 0) {
                        for (int k = 0; k < A[0].length; k++) {
                            B[i][k] = 0;
                        }

                        for (int l = 0; l<A.length ; l++) {
                            B[l][j] = 0;
                        }



                    }

                    else if(B[i][j]==-1)
                    {
                        B[i][j] = A[i][j];
                    }




                }

            }

            return B;


        }

    public static void main(String[] args) {

        int [][] A = {
                {51, 21, 90, 38, 57, 12, 11, 1, 68, 60},
  {81, 24, 63, 97, 75, 70, 23, 91, 39, 84},
  {0, 21, 97, 12, 46, 48, 50, 3, 57, 69},
  {44, 8, 42, 34, 99, 0, 98, 10, 53, 67},
  {23, 34, 43, 86, 31, 18, 9, 54, 61, 48},
  {90, 61, 21, 87, 26, 67, 88, 28, 70, 45},
  {98, 14, 5, 92, 1, 4, 44, 99, 67, 98},
  {18, 42, 32, 61, 80, 64, 32, 89, 70, 93},
  {89, 61, 7, 10, 0, 85, 29, 40, 13, 0},
  {85, 63, 66, 43, 56, 67, 99, 0, 67, 66}
        };
      /*  int [][] A = {
                {97, 18, 55, 1, 50, 17, 16, 0, 22, 14},
                {58, 14, 75, 54, 11, 23, 54, 95, 33, 23},
                {73, 0, 2, 80, 6, 43, 67, 82, 73, 4},
                {61, 22, 23, 68, 23, 73, 85, 91, 25, 7},

        };*/

        int [][] B = solve(A);

        int rows = A.length;
        int columns = A[0].length;



        for(int i =0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
    }


}
