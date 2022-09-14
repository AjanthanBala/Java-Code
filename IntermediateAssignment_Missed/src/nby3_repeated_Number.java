import java.util.*;

public  class nby3_repeated_Number {
            public static int repeatedNumber(final List<Integer> a) {

                int n =a.size();
                int max = 0;
                int count1=0,count2=0,first=0,second=0;

                for(int i = 0;i<n;i++)
                {
                    if(first==a.get(i))
                    {
                        count1++;
                    }

                    else if(second == a.get(i))
                    {
                        count2++;
                    }

                    else if(count1==0)
                    {
                        count1++;
                        first = a.get(i);
                    }

                    else if(count2==0)
                    {
                        count2++;
                        second=a.get(i);
                    }

                    else{
                        count1--;
                        count2--;
                    }

                }

                count1 = 0;
                count2 = 0;

                for(int j = 0;j<n;j++)
                {
                    if(a.get(j)==first)
                    {
                        count1++;
                    }

                    if(a.get(j)==second)
                    {
                        count2++;
                    }
                }

                if(count1>n/3)
                {
                    return first;
                }

                if(count2>n/3)
                {
                    return second;
                }

                return -1;
            }



    public static void main(String[] args) {

    ArrayList <Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(1);
    a.add(1);
    a.add(2);
        a.add(2);
        a.add(3);
        a.add(3);

    System.out.println(repeatedNumber(a));
    }

}
