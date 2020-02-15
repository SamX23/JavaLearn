import java.util.Scanner;

public class IfClause {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 1 || (N > 5 && N <= 20)) {
            System.out.println("Weird");
            //both true
        } else if (N % 2 == 0) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Also Not Weird");
        }

        scanner.close();
    }
}
