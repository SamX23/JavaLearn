import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int i = 0; i < test; i++) {
            int j = i +1;
            if (j % 2 == 0) {
                System.out.println("ini nomer bisa dibagi 2 yaitu : " + j);
            } else {
                System.out.println("ini nomer gak bisa dibagi 2 yaitu : " + j);
            }
        }
    }
}