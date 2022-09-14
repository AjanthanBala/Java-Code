public class Matrix_Transpose {

        public static int[][] solve(int[][] A) {



            int rows = A.length;
            int columns = A[0].length;
            int B[][] = new int[A[0].length][A  .length];


            for(int i =0;i<columns;i++)
            {
                for(int j=0;j<rows;j++)
                {
                    B[i][j] = A[j][i];

                }
            }

            return B;
        }




    public static void main(String[] args) {


    int [][] A = {
            {24, 63, 39, 81, 84, 30},
            {21, 64, 95, 6, 88, 73},
        {33, 6, 63, 96, 86, 66},
        {62, 88, 23, 52, 94, 77},
        {81, 58, 74, 18, 16, 25},
        {26, 40, 88, 64, 72, 23},
        {45, 44, 86, 92, 50, 26},
            {64, 34, 83, 26, 29, 68},
            {43, 42, 7, 17, 45, 52},
            {94, 25, 62, 19, 95, 77}
          };

        int [][] B = solve(A);

    int rows = A[0].length;
    int columns = A.length;



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
