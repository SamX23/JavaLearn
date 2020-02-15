import java.util.Scanner;

public class ManipulateString {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next(); // apapun
        String B=sc.next(); // itulan
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length()); // hitung banyak nya = 12
        if (A.compareTo(B) > 0) { // mana yang banyaknya sama, no karena sama sama
            System.out.println("yes");
        } else if (B.compareTo(A) == 0) {
            System.out.println("Same");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        // resultnya Apapun Itulan
    }

}
