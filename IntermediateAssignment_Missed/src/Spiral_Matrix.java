public class Spiral_Matrix {
    public static int[][] generateMatrix(int A) {


        int [][] MatrixArray = new int [A][A];
        for(int i =0;i<A;i++)
        {
            for(int j = 0;j<A;j++)
            {
                MatrixArray[i][j] = 0;
            }
        }
        int num = 1;
        int dir = 0;
        int row = 0;
        int col = 0;
        while(num<=A*A)
        {


                MatrixArray[row][col] = num;
                num++;

                if(dir ==0) {
                    col++;

                    if (col == A || MatrixArray[row][col] != 0) {
                        dir = 1;
                        col--;
                        row++;

                    }
                }

                else if(dir == 1) {
                    row++;


                    if (row == A || MatrixArray[row][col] != 0) {
                        dir = 2;
                        row--;
                        col--;
                    }
                }

                else if(dir==2) {
                    col--;


                    if (col < 0 || MatrixArray[row][col] != 0) {
                        dir = 3;
                        col++;
                         row--;
                    }
                }

                else if(dir ==3) {
                    row--;


                    if (row < 0 || MatrixArray[row][col] != 0) {
                        dir = 0;
                        row++;
                        col++;
                    }
                }

        }

        return MatrixArray;
    }

    public static void main(String[] args) {


        int A = 5;

        int[][] C = generateMatrix(A);

        int rows = C.length;
        int columns = C[0].length;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

