public class mod_string {
    public static int findMod(String A, int B) {
        long C =  Integer.parseInt(A)%B;
        return (int)C%B;
    }

    public static void main(String[] args) {
        String A = "842554936302263";
        int B = 41;
        System.out.println(findMod(A,B));
    }
}
