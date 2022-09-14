public class PrimeLuckyNumbers {
    public static int solve(int A) {

        int count =0;

        for(int i=2;i<=A;i++)
        {
            for(int j = A;j>i;j--)
            {
                if(i*j<=A)
                {
                    if(Isprime(i)&&Isprime(j))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean Isprime(int numtocheck)
    {
        int FactCount = 0;
        for(int i =1;i*i<=numtocheck;i++)
        {
            if(numtocheck%i==0)
            {
                if(i==numtocheck/i)
                {
                    FactCount++;
                }

                else
                {
                    FactCount+=2;
                }
            }
        }

        if(FactCount==2)
        {
            return true;
        }

        return false;
    }

    public static void main(String args[])
    {
        int A = 12;
        System.out.println(solve(A));
    }
}
