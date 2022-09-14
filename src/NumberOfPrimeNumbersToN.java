public class NumberOfPrimeNumbersToN {
    public static void main(String [] args)
    {
        int A = 100;
        System.out.println(solve(A));
    }

    public static int solve( int N)
    {
        int PrimeCount = 0;
        for( int iterator =2; iterator<=N;iterator++)
        {
            if(Isprime(iterator))
            {
                PrimeCount++;
                System.out.print(iterator + " ");
            }
        }

        return PrimeCount;
    }

    public static boolean Isprime(int num)
    {
        int FactorCount = 0;
        for(int i=1;i*i<= num;i++)
        {
            if(num%i==0)
            {
                if(i==num/i)
                {
                    FactorCount++;
                }
                else
                {
                    FactorCount+=2;
                }
            }
        }

        if(FactorCount==2)
        {
            return true;
        }

        return false;
    }

}
