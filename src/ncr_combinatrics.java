public class ncr_combinatrics {
    public static int solve(int A, int B, int C) {

        int top = fact(A);
        System.out.println(top);
        int bottum = fact(A-B)* fact(B);
        System.out.println(bottum);
        int ans = (top/bottum)%C;
        System.out.println(ans);
        return ans;
    }


    public static  int fact(int n)
    {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return (int)fact;
    }


    public static void main(String[] args) {
        int  A = 47;
        int B = 36;
        int C = 283;
        System.out.println(solve(A,B,C));
    }
}
