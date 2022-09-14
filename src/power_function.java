public class power_function {

        public static int pow(int A, int B, int C) {

            if(B==0)
            {
                return 1;
            }

            long D =0;
            D = (long)(pow(A%C,B-1,C) * A%C)%C;

            return (int)D%C;


        }


    public static void main(String[] args) {
        int A =71045970 ;
        int B =41535484 ;
        int C = 64735492;
        System.out.println(pow  (A,B,C));
    }

    
}
