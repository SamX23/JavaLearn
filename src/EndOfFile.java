import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(scan.hasNextLine()){
            i++;
            System.out.println(i + " " + scan.nextLine());
        }
        scan.close();
    }
}

//    Input
//    Hello world
//    I am a file
//    Read me until end-of-file.
//    Output
//    1 Hello world
//    2 I am a file
//    3 Read me until end-of-file.