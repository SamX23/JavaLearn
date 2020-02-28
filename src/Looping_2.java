import java.util.*;

public class Looping_2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j < n;j++){
                a = a + (int) Math.pow(2, j)* b;
 // (a+2^0*b), (a+2^0*b + 2^1 *b), ...., (a+2^0*b + 2^1 *b + .... + 2^n-1 *b)
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

