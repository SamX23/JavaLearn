import java.util.Scanner;

public class BinaryNumbersConsecutive {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int consec1=0;
        // Simulates Binary to String
        String BinaryToStr = Integer.toString(n, 2);
        String[] strparts = BinaryToStr.split("0");
        //Get strings of consecutive and save the longest value from the array / {{1, 11, 111, 1111, etc}}
        for(int i=0;i<strparts.length;i++ ){
            if (consec1 < strparts[i].length()){
                consec1 = strparts[i].length();
            }
        }
        //result
        System.out.println(consec1);
        scanner.close();
    }
}
