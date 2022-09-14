import com.sun.security.jgss.GSSUtil;
import java.util.*;

public class DistinctPrimes {
    public static int solve(int[] A) {



            HashSet <Integer> map = new HashSet<>();



            int count=0;
            for(int x=0;x<A.length;x++) {
                int sum = A[x];

                int i = 2;
                while (sum != 1) {
                    if (Isprime(i)) {
                        if (sum % i == 0) {
                            map.add(i);
                            sum = sum / i;
                        }

                        if(sum==1 || sum==0)
                        {
                            break;
                        }
                    }
                    if(sum%i==0 )
                    {
                        continue;
                    }

                    else
                    {
                        i++;
                    }


                }
            }

            return map.size();
        }

        public static boolean Isprime(int num)
        {
            int factcount = 0;
            for(int i = 1;i*i<num;i++)
            {
                if(num%i==0)
                {
                    if(i==num/i)
                    {
                        factcount++;
                    }

                    else
                    {
                        factcount+=2;
                    }
                }
            }

            if(factcount==2)
            {
                return true;
            }

            return false;
        }

    public static void main(String[] args) {
        int [] A = { 96, 98, 5, 41, 80};
        System.out.println(solve(A));
    }
}
