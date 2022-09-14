import java.util.*;
public class Exists_Pair_Using_HashMap
{

    public static int existspair(int A[],int k)
    {

        HashSet <Integer> set = new HashSet<>();

        for(int i = 0;i<A.length;i++)
        {
            set.add(A[i]);
        }
        int count = 0;
        for(int j =0;j<A.length;j++)
        {
            int checkval = k - A[j];
            if(set.contains(checkval))
            {
               count++;
            }
        }

        return count;
    }
    public static void main(String args[])
    {
        int []A ={1,2,4,5,6,7,8,9};
        int k = 6;
        System.out.println(existspair(A,k));
    }

    }
