public class String_intermedate_reverse {

        public static String solve(String A) {

            String word = "";
            String ans = "";
            String rev = "";

            int end =A.length()-1;


            for(int i=end;i>=0;i-- )
            {
                if(A.charAt(end) == ' ')
                {
                    end--;
                    continue;
                }

                else if(A.charAt(i)==' ')
                {
                    rev = reverse(word);
                    ans = ans + rev;
                    word = "";
                    if(i!=0)
                    {
                        ans =  ans + ' ';
                    }
                }

                else
                {
                    word = word + A.charAt(i);
                }

            }
            if(A.charAt(0) != ' ')
            {
                ans = ans + reverse(word);
            }

            return ans;

        }

        public static String reverse(String word)
        {
            String rev = "";
            for(int i=word.length()-1;i>=0;i--)
            {
                rev= rev+ word.charAt(i);
            }

            return rev;
        }


    public static void main(String[] args) {
        String A = "this is blue  ";
        System.out.println(solve(A));
    }

}
