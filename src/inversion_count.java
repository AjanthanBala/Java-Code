public class inversion_count {
    public static int solve(int A[])
    {

        int count = 0;
        for(int i =0;i<A.length;i++)
        {
            for(int j = i+1;j<A.length;j++)
            {
                if(A[i]>A[j]&& i<j)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int []A = { 10,3,8,16,6,12,2,18,7,1};
        System.out.println(solve(A));
    }

}
