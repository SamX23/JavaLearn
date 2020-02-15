import java.util.Scanner;

public class NewTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c = scan.nextInt();
        String A = scan.next();

        String solver = A.substring(0) + A.substring(1) + A.substring(2);

        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <=5;j++)
                System.out.println("("+i+", "+j+")");
        }
    }
}
