public class Intermediate_2D_Matrices_Column_Sum {
   public static int [] solve(int [][]A)
   {
    int[] d  = new int[A[0].length];
    int r = A.length;
    int c = A[0].length;


    for(int i=0;i<c;i++)
    {
        int sum=0;
        for(int j = 0;j<r;j++)
        {
            sum = sum + A[j][i];
        }

        d[i]= sum;
    }

    return d;
   }








    public static void main(String [] args)
    {
    int [][]A = {{520, 97, 526, 108, 798},
            {571, 349, 682, 782, 277},
            {547, 91, 393, 250, 553},
            {267, 330, 185, 722, 683},
            {34, 591, 92, 215, 304},
            {116, 967, 102, 16, 608},
            {242, 536, 706, 768, 996},
            {504, 691, 345, 538, 473},
            {975, 85, 916, 720, 687},
            {470, 987, 369, 7, 709}};

    System.out.println(solve(A));
    }
}
