public class Arrays_InterviewProblems_MaximumPositivity {
    public static int[] solve(int[] A) {

        int i=0,j=0,start=1,end=-1;
        int len = A.length;


        while(i<len && j<len)
        {
            if(A[j]>=0)
            {
                j++;
            }


            else
            {
                if((j-i)>(end -start+1))
                {
                    start = i;
                    end = j-1;
                }

                i=j+1;
                j++;
            }
        }

        if((j-i)>(end -start+1))
        {

            start = i;

            end = j-1;

        }

        int [] c = new int[end-start+1];
        int k = 0;
        for(int l =start;l<=end;l++)
        {
            c[k] = A[l];
            k++;
        }
         return c;
    }

    public static void main(String[] args) {
        int [] A= {-5173778, -8176176, 1694510, 7089884, -1394259, 1146372, -2502339, 1544618, 6602022, 4330572};
        int B[] = solve(A);
    }
}
