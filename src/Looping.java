import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Looping {
    private static final Scanner scanner = new Scanner(System.in);

    public static void testWhile() {
        int i = 0;
        while (i <= 5) {
            System.out.println("While counting from " + i);
            i++;
            if (i >= 3) {
                System.out.println("Upss interrupted at " + i);
                break;
            }
        }
    }
    public static void testDoWhile() {
        int i = 6;
        do {
            System.out.println("Do count " + i + " while i = " + i);
            i++;
        } while (i <= 10);
    }
    public static void testFor() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 1; i <= 10; i++){
            System.out.println("For" + N + " x " + i + " = " + (N * i) );
        }
    }

    public static void nestedLoop() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <=5;j++)
            System.out.println("("+i+", "+j+")" );
        }
    }

    public static void main(String[] args) {
        nestedLoop();
        /*
        testFor();
        System.out.println("/n");
        testWhile();
        System.out.println("/n");
        testDoWhile();
        System.out.println("/n");
         */
    }
}