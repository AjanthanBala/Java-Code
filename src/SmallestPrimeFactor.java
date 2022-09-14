public class SmallestPrimeFactor {
    public static void main(String [] args)
    {
        int A = 50;
        solve(A);
    }

    public static void solve(int num)
    {
        int [] ArraytoSave = new int[num+1];

        for(int i=0;i<ArraytoSave.length;i++)
        {
            ArraytoSave[i]=i;
        }

        for( int i = 2;i<ArraytoSave.length;i++)
        {
            if(ArraytoSave[i]==i)
            {
                for(int j=i*i;j<=ArraytoSave.length;j=j+i)
                {
                    ArraytoSave[j]=Math.min(ArraytoSave[j],i);
                }
            }
        }
    }
}
