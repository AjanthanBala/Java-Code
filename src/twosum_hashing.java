import java.util.*;

public class twosum_hashing {
    public static int[] twoSum(final int[] A, int B) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int len = A.length;
        int minindex1=len,minindex2=len,min = len;
        int cur_sum  = 0;
        int start = 0;
        int end = -1;
        int[] mt_arr = new int[0];
        int [] res_arr = new int[2];

        for(int i = 0;i<len;i++)
        {
            if(cur_sum- B ==0)
            {
                start = 0;
                end = i;
                break;

            }

            cur_sum = cur_sum + A[i];

            if(map.containsKey(cur_sum-B))
            {
                start = map.get(cur_sum - B)+1;
                end = i;
                break;
            }

            map.put(cur_sum,i);
        }

        if(end ==-1)
        {
            return mt_arr;
        }

        res_arr[0] = start;
        res_arr[1] = end;

        return res_arr;


       /* for(int i = 0;i<len;i++)
        {
            for(int j = i+1;j<len;j++)
            {

                if(A[i]+A[j]==B)
                {

                    if(j<=minindex2) {
                        if (minindex2 == j && i < minindex1) {
                            minindex1 = i;
                            minindex2 = j;
                            arr[0] = minindex1 + 1;
                            arr[1] = minindex2 + 1;
                            //System.out.println(arr[0]+ " "+ arr[1]);
                        }
                        else {

                            if(minindex2 == j && i > minindex1)
                            {
                                continue;
                            }
                            else
                            {
                            minindex1 = i;
                            minindex2 = j;
                            arr[0] = minindex1 + 1;
                            arr[1] = minindex2 + 1;}

                            //  System.out.println(arr[0]+ " "+ arr[1]);
                        }

                    }

                }
            }
        }*/
        //return arr;
    }

    public static void main(String[] args) {
        int [] A = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8  };
        int B = -3;
       int [] C = (twoSum(A,B));

       for(int i = 0;i<C.length;i++)
       {
           System.out.println(C[i]);
       }
    }
}
