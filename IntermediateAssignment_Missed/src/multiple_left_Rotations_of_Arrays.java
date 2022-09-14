public class multiple_left_Rotations_of_Arrays {

    public static int[][] solve(int[] A, int[] B) {


        int N = A.length;
        int M = A.length;
        int[][] newArray = new int[B.length][B.length];

        int column = 0;
        int print_row = 0;

        for (int i = 0; i < B.length; i++) {
            int num = B[i]%N;
            int l = 0;

            int[] newDarray = new int[M];
            int p = 0;
            for (int j = N - num; j < N; j++) {
                newDarray[p] = A[j];
                p++;

            }

            for (int k = 0; k < N - num; k++) {
                newDarray[p] = A[k];
                p++;
            }

            for (int iter = 0; iter < newDarray.length; iter++) {
                newArray[print_row][iter] = newDarray[iter];
            }
            print_row++;

        }

        return newArray;

    }

    public static void main(String[] args) {


        int[] A = {4, 74, 35, 16, 100, 7};
        int[] B = {59, 25, 38, 82, 26, 8,98,76};

        int[][] C = solve(A, B);

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
