import java.util.*;
public class checkpalindrome_Hashmap {

        public static int solve(String A) {
            HashMap <Character,Integer> map = new HashMap<>();
            for(int i = 0;i<A.length();i++)
            {
                if(map.containsKey(A.charAt(i)))
                {
                    map.put(A.charAt(i),map.get(A.charAt(i))+1);
                }
                else
                {
                    map.put(A.charAt(i),1);
                }
            }
            int count = 0;
            int amount = 0;
            int temp_one = 0;
            for( Integer value: map.values() )
            {
                if(value%2==0)
                {
                    count++;
                    amount = amount+ value;

                }

                if(value>2 && value %2==1)
                {
                    count++;
                    amount = amount+ value -1;
                    temp_one ++;
                }

                if(value == 1)
                {
                    temp_one++;
                }

            }

           /*  if(A.length()%2==0) {
                 if (amount == A.length()) {
                     return 1;
                 }
             }
            else if ( amount == A.length()) {
                return 1;
            }
            else if(temp_one == 1 && amount + temp_one == A.length())
             {
                 return 1;
             }*/

            if(temp_one>1)
            {
                return 0;
            }
            return 1;

        }

    public static void main(String[] args) {
        String A = "abbaeee";
        System.out.println(solve(A));
    }


}
