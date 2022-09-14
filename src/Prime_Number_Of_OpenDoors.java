import java.util.*;

public class Prime_Number_Of_OpenDoors {
    public static int solve(int A) {

        int [] DoorArray = new int[A+1];
        int b = -1;

        Arrays.fill(DoorArray,b);

        for(int i =1;i<=A;i++)
        {


            for(int j = i;j<=A;j+=i)
            {
                //DoorArray[i] = DoorArray[i]* -1;
                DoorArray[j] = DoorArray [j]* -1;
            }
        }

        int OpenDoorCount = 0;

        for(int iter = 0;iter<DoorArray.length;iter++)
        {
            if(DoorArray[iter]==1)
            {
                OpenDoorCount++;
            }
        }

        return OpenDoorCount;
    }

    public static void main(String [] args)
    {
        int A = 10;
        System.out.println(solve(A));
    }
}
