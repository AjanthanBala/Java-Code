public class PrimeNumbers {
    //Program to check Prime or not
        public static void main(String[] args)
        {
            int A =100;
            System.out.print(solve(A));
        }

        public static String solve(int A)

        {
            //Program to find if the given number is Prime Or Not
            int count =0;
            for(int i=1;i*i<=A;i++)
            {
                if(A%i==0)
                {
                    if(i == A/i)
                    {
                        count++;
                    }

                    else {
                        count += 2;
                    }
                }
            }

           if(count==2)
           {
               return "Yes";
           }
           return "No";
        }

        public static boolean Isprime(int CheckPrimeNumber)
        {
            for(int i=2;i<CheckPrimeNumber;i++)
            {
                if(CheckPrimeNumber%i==0)
                {
                    return false;
                }
            }

            return true;
        }

    }


