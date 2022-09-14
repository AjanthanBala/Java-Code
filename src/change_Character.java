import java.util.*;
public class change_Character {
    public static int solve(String A, int B) {



            HashMap <Character,Integer> map = new HashMap<>();

            int numofelem = 0;

            if(B==0)
            {
                return A.length();
            }

            for(int i=0;i<A.length();i++)
            {
                if(map.containsKey(A.charAt(i)))
                {
                    map.put(A.charAt(i),map.get(A.charAt(i))+1);
                }

                else
                {
                    map.put(A.charAt(i),1);
                    numofelem++;

                }
            }
            int[] map_val = new int[numofelem];
            int iter = 0;
            int check_val = 0;
            int i = 0;
            int val_iter = 0;

            for(Integer value :map.values())
            {
                map_val[val_iter] = value;
                val_iter++;

            }

            Arrays.sort(map_val);

            while(i<A.length())
            {

                int left_val = map.get(A.charAt(i));
                if(map.containsKey(A.charAt(i))&& map.get(A.charAt(i))<=B)
                {
                    if(map.containsValue(map_val[iter]))
                    {
                        check_val = map_val[iter];
                    }

                    if(map.get(A.charAt(i))<=check_val)
                    {
                        map.put(A.charAt(i),map.get(A.charAt(i))-B);
                        B = B - left_val;
                        if(B<=0)
                        {
                            break;
                        }
                        else if(i==A.length()-1)
                        {
                            i=-1;
                        }
                    }

                }
                i++;




            }







            int count = 0;

            for(Integer value :map.values())
            {
                if(value>0)
                {
                    count++;
                }
            }

            return count;
        }




    public static void main(String[] args) {
        String A = "qghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmq";
        int B = 119;
        System.out.println(solve(A,B));

    }

}
