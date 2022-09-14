import java.util.*;

public class rearrange_modular_arithmetic {
    public static void arrange(ArrayList<Integer> a) {

        int len = a.size();

        for(int i=0;i<len;i++)
        {

            a.set(i,(a.get(a.get(i))%len)*len);
        }

        for(int j = 0;j<len;j++)
        {
            a.set(j,a.get(j)/len);
            System.out.println(a.get(j));
        }








    }

    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();

        a.add(4);
        a.add(0);
        a.add(2);
        a.add(1);
        a.add(3);

        arrange(a);


    }
}
