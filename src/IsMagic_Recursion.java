public class IsMagic_Recursion {
        public static int solve(int A) {
            int sum =0;
            int flag = -1;

            if(A/10==0)
            {
                return A%10;
            }

            sum += A%10;
            A =A/10;


            int B = solve(sum+solve(A));

            if(B==1)
            {
                flag =1;
            }

            else
            {
                flag = 0;
            }

            return flag;





        }


    public static void main(String[] args) {

        int A =83557;
        System.out.println(solve(A));
    }

}
