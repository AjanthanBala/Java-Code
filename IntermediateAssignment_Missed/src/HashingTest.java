import java.util.*;
import java.lang.*;

public class HashingTest {

        public static int hashmapex(int [] A)
        {
            int len_of_A = A.length;

            HashMap <Integer,Integer> map = new HashMap <>();

            for(int i=0;i<len_of_A;i++)
            {
                if(map.containsKey(A[i]))
                {
                    map.put(A[i],map.get(A[i]+1));
                }

                else
                {
                    map.put(A[i],1);
                }
            }


            for( Map.Entry<Integer, Integer> e : map.entrySet())
            {System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());}

            for(Map.Entry<Integer,Integer> iter: map.entrySet())
            {
                System.out.println("Key:" + iter  .getKey() + " "+ iter.getValue());
            }

            return 1;
        }
        public static void main(String args[])
        {
            int[] A = {1,23,4,5,67,8,7,9,11,17};
            System.out.println(hashmapex(A));
        }
    }


