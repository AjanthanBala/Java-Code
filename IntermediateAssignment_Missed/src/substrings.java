public class substrings {
    public static int solve(String A) {
        int count = 0;

        for(int i =0;i<A.length();i++)
        {
            for(int j =i;j<A.length();j++)
            {

                for(int k = i;k<=j;k++)
                {
                    if(A.charAt(i) == 'A'||A.charAt(i) == 'E'||A.charAt(i) == 'I'||A.charAt(i) == 'O'||A.charAt(i) == 'U'||
                            A.charAt(i) == 'u'||A.charAt(i) == 'o'||A.charAt(i) == 'i'||A.charAt(i) == 'e'||A.charAt(i) == 'a')
                    {
                        count++;

                    }
                }
            }
        }
        return count%10003;
    }

    public static void main(String[] args) {

        String A = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
        System.out.println(solve(A));
    }
}
