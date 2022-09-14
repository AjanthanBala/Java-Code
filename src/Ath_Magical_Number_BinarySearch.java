public class Ath_Magical_Number_BinarySearch {
    public static int solve(int A, int B, int C) {

        int count = 0;
        int start = 0;
        int end = Math.min(B,C)* A;
        int ans = 0;

        int lcm = B*C/GCD(B,C);
        int mid = 0;
        while(start<=end)
        {
            mid = (start+end)/2;

            ans = (mid/B)    + (mid/C) - mid/lcm;

            if(ans==A)
            {
                return mid%1000000007;
            }

            else if(ans<A)
            {
                start = mid +1;

            }

            else{
                end = mid-1;
            }
        }

        return mid%1000000007;
    }

    public static int GCD(int B, int C)
    {
        if(B==0)
        {
            return C;
        }

        return GCD(C%B,B);
    }

    public static void main(String[] args) {
        int A = 19;
        int B= 11;
       int  C = 13;
        System.out.println(solve(A,B,C));
    }
}
