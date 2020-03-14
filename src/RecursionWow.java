public class RecursionWow {
    public static int summRes(int n) {
        // Base : Breaker or end
        if (n <= 0) {
            return 0;
        }
        // Recursive : Keep going
        else {
            System.out.println("summRes("+n+")");
            // 5 + summRes(5-1)
            // 5 + 4 + summRes(4-1)
            // 5 + 4 + 3 + summRes(3-1)
            // 5 + 4 + 3 + 2 + summRes(2-1)
            // 5 + 4 + 3 + 2 + 1 + summRes(1-1)
            return n + summRes(n - 1);
        }
    }

    public static int FactorRes(int n) {
        // Base
        if (n <= 1) {
            return 1;
        }
        // Recursion
        // 3 * FactorRes(3-1)
        // 3 * 2 * FactorRes(2-1)
        else {
            System.out.println("FactorRes("+n+")");

            return n * FactorRes(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summRes(5));
        System.out.println(FactorRes(3));
    }
}