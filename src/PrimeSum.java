public class PrimeSum {

    public static int[] primesum(int A) {
        int count = 0;
        int[] prime = new int[2];
        prime[0] = 100007;

        for (int i = 2; i <= A; i++) {
            if (Isprime(i)) {
                int j = A - i;
                if (Isprime(j)) {
                    prime[0] = i;
                    prime[1] = j;
                    return prime;
                }
            }

        }

        return prime;
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

    public static void main(String[] args) {
        int A = 10;
        int [] arr = new int[2];
        arr = primesum(A);
    }
}
