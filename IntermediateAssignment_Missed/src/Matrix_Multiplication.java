public class Matrix_Multiplication {
        public static int[][] solve(int[][] A, int[][] B) {

            int Arows = A.length;
            int Acolumn = A[0].length;
            int Brows = B.length;
            int Bcolumn = B[0].length;
            int [][] AB = new int[Arows][Bcolumn];

            for(int i =0;i<Arows;i++)
            {
                for(int j =0;j<Bcolumn;j++)
                {
                    AB[i][j]=0;
                    for(int k =0;k<Brows;k++)
                    {
                        AB [i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return AB;
        }

    public static void main(String[] args) {


        int [][] A = {
                {94, 91 },

        };
        int [][] B = {
                {35, -52, -12, 26, -93, -61},
                {29, -20, -36, -9, 66, 15}
        };

        int [][] C = solve(A,B);

        int rows = C.length;
        int columns = C[0].length;



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
