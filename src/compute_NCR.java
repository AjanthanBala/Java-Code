public class compute_NCR {
    public static int solve(int A, int B, int C) {
        long ans = 0;

        ans = (fact(A)%C / ((fact(A-B)%C)* (fact(B)%C)))%C;

        return (int)ans;
    }

    public static long fact(int num)
    {
        long factorial =1 ;
        for(int i=num;i>0;i--)
        {
            factorial = factorial *i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        int A =38;
        int B = 5;
        int C = 81;
        System.out.println(solve(A,B,C));
    }
}
