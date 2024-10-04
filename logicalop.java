public class logicalop {

    public static void main(String[] args) {
        int p = 15, q = 54, r = 58;
        System.out.println((p > q) && (q > r));
        System.out.println((p > q) || (r < q));
        System.out.println(!(q == p));
    }
}