public class PrimeSubsequences {
    public static void main(String[] args)
    {
        int [] A = { 9, 9, 3, 6, 7, 5};
        System.out.println(solve(A));
    }

    public static int solve(int [] A)
    {

        int count = 0;
        for(int StartIndex=0;StartIndex<A.length;StartIndex++)
        {
            boolean SubSeqBool = true;
            for(int EndIndex = StartIndex;EndIndex<A.length;EndIndex++)
            {

                for(int SubSequence = StartIndex;SubSequence<=EndIndex;SubSequence++)
                {

                    if(Isprime(A[SubSequence]))
                    {
                        SubSeqBool = SubSeqBool & true;
                    }
                    else
                    {
                        SubSeqBool = false;
                    }
                }

                if(SubSeqBool == true)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean Isprime(int NumtoCheck)
    {
        int count = 0;
        for(int i = 1;i*i<=NumtoCheck;i++)
        {
            if(NumtoCheck%i==0)
            {
                if(i==NumtoCheck/i)
                {
                    count++;
                }

                else
                {
                    count+=2;
                }
            }
        }

        if(count ==2)
        {
            return true;
        }

        return false;
    }
}
