
import java.util.*;

public interface PrimeNumber_SieveOfEratostheus_Method {

    public static void main(String[] args)
    {
        int A = 50;
        solve(A);
    }

    public static void solve(int num)
    {
        boolean [] ArrayToSave = new boolean[num+1];
        boolean b = true;
        Arrays.fill(ArrayToSave,b);

        ArrayToSave[0]= false;
        ArrayToSave[1]= false;
        for(int i=2;i*i<=num;i++) // for(int i=2;i<=num;i++) is a less optimal version
        {
            if(Isprime(i))
            {
                for(int j = i*i;j<=num;j=j+i) // for(int j = 2*i;j<=num;j=j+i) is a less optimal version
                {
                    ArrayToSave[j]=false;
                }
            }
        }

        for(int iter =0;iter<ArrayToSave.length;iter++)
        {
            if(ArrayToSave[iter]== true)
            {
                System.out.print(iter + " ");
            }
        }

    }

    public static boolean Isprime(int NumToCheck)
    {
        int FactorCount =0;
        for(int i=1;i*i<NumToCheck;i++)
        {
            if(NumToCheck%i==0)
            {
                if(i == NumToCheck/i)
                {
                    FactorCount++;
                }

                else
                {
                    FactorCount+=2;
                }
            }
        }

        if(FactorCount == 2)
        {
            return true;
        }

        return false;
    }

}
