import java.util.*;

public class Intermediate_StringOperations {

        public static String solve(String A) {

            ArrayList <Character> arr = new ArrayList<Character>();

            for(int i =0;i<A.length();i++)
            {
                char check = A.charAt(i);
                char upper = Character.toUpperCase(check);
                if(A.charAt(i)== upper)
                {

                    continue;
                }

                else
                {
                    if(A.charAt(i) == 'A'||A.charAt(i) == 'E'||A.charAt(i) == 'I'||A.charAt(i) == 'O'||A.charAt(i) == 'U'||
                            A.charAt(i) == 'u'||A.charAt(i) == 'o'||A.charAt(i) == 'i'||A.charAt(i) == 'e'||A.charAt(i) == 'a')
                    {

                        arr.add('#');
                        continue;
                    }
                    arr.add(A.charAt(i));
                }




            }

            String s= "";
            for(int j = 0;j<arr.size();j++)
            {
                s= s + arr.get(j);
            }

            return s+s;
        }

    public static void main(String[] args) {

            String A = "hgUe";
        System.out.println(solve(A));
    }

}
