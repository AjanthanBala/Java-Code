public class pick_from_both_sides {
        public static int solve(int[] A, int B) {

            int max = 0;
            int choice = 0;
            int l = 0;
            int r =A.length-1;
            int left = 0;
            int right = 0;

            int n = A.length-1;

            int sum = 0;
            int cur_sum = 0;
            int cur_max = 0;



            for(int i =0;i<B;i++)
            {
                cur_sum = cur_sum + A[i];
            }
            int max_ans = Integer.MIN_VALUE;
            max_ans = Math.max(cur_max,max_ans);
            int from_right = B-1;
            int from_back = B-1;


            for(int j = 0;j<B;j++)
            {
                cur_max = (cur_sum - A[from_back]) + A[j];

                    max_ans = Math.max(cur_max,max_ans);


                from_right--;
                from_back--;
            }


            /*while(choice<B)

            {
                left= A[l];
                right = A[r];

                if(left>right)
                {
                    sum =sum + left;
                    //max =  Math.max(max,sum);
                    l++;
                    choice++;

                }

                if(choice>=B)
                {
                    break;
                }

                if(right>left)
                {
                    sum = sum+ right;
                    //max =  Math.max(max,sum);
                    r--;
                    choice++;

                }


            }
                */
            return max_ans;
        }

    public static void main(String[] args) {

            int[] A = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509,
                    -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726,
                    -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673,
                    -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 };
            int B = 48;

        System.out.println(solve(A,B));
        }

}
