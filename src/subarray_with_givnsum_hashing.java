import java.util.*;
public class subarray_with_givnsum_hashing {

        public static int[] solve(int[] A, int B) {

            int sum = 0;
            int left = 0;
            int right = 0;
            int [] prfx = new int [A.length];
            prfx[0] =A[0];
            for(int i =1;i<A.length;i++)
            {
                prfx[i] = prfx[i-1] +A[i];

            }

            HashMap <Integer,Integer> map = new HashMap<>();

            for(int j = 0;j<A.length;j++)
            {
                if(map.containsKey(prfx[j]))
                {
                    map.put(prfx[j],map.get(prfx[j])+j);
                }

                else
                {
                    map.put(prfx[j],j);
                }
            }
            int index = -1;
            int value = 0;
            int s = 0;

            for(int k = 0;k<A.length;k++)
            {
                if(map.containsKey(prfx[k]-B))
                {
                    index = map.get(prfx[k]-B);
                    value = prfx[k];
                    break;
                }
            }

            for(int l = 0;l<A.length;l++)
            {
                if(prfx[l] == value)
                {
                    s= l;
                }
            }
            int mt[] = {-1};
            if(index==-1)
            {
                return mt ;
            }

            int res[] = new int[s-index];
            int v=0;
            for(int m = index+1;m<=s;m++)
            {
                res[v] = A[m];
                v++;
            }



            return res;
        }

    public static void main(String[] args) {
        int [] A = { 1, 2, 3, 4, 5 };
        int B = 5;

        System.out.println(solve(A,B));
    }

}
