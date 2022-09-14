import java.util.*;

public class LargestNumber_ArraystoString {

    public static String largestNumber(final int[] A) {
       /* Arrays.sort(A);
        String final_val= "";

       for(int i =A.length-1;i>=0;i--)
        {
            String temp = "";
            temp = Integer.toString(A[i]);
            final_val = final_val + temp;
        }
        */
        /*Arrays.sort(A, (x,y)->(y+x).compareTo(x+y));
        String ans ="";
        for(String k : A) ans =ans+k;
        return ans;*?

        //return final_val;
    }

   */

        String X = "123";
        String Y = "124";
        String XY = X+Y;
        String YX = Y+X;
        int S1 = XY.compareTo(YX);
        if(S1 == 1)
        {
            return XY;
        }

        return YX;
    }



    public static void main(String[] args) {
        int [] A = {8, 89};
        System.out.println(largestNumber(A));
    }
}

