public class BinarySearch_advanced {

        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public static int solve(final int[] A, int B) {

            int len = A.length-1;
            int start= 0;
            int end= len;

            while(start<=end)
            {
                int mid = (start+end)/2;

                if(A[mid]==B)
                {
                    return mid;
                }

                else if(A[mid]>A[start]) {
                    if (B < A[mid] && B >= A[start]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }

                 else
                    {
                        if(B>=A[mid]&& B<=A[end])
                        {
                            start = mid+1;
                        }

                        else
                        {
                            end = mid-1;
                        }
                    }

            }

            return -1;

        }


    public static void main(String[] args) {
        int A[] = {101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        int B = 202;

        System.out.println(solve(A,B));
    }

}
