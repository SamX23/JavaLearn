import java.util.Scanner;

public class Looping_3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0;i < T;i++){
            String A = scan.next();
            printEvenIndexed(A);

        }
        scan.close();

    }

    public static void printEvenIndexed(String A){
        StringBuffer evens = new StringBuffer();
        StringBuffer odds = new StringBuffer();
        for(int i =0;i < A.length();i++){
            char ch = A.charAt(i);
            if(i % 2 ==0){
                evens.append(ch);
            } else{
                odds.append(ch);
            }
        }
        System.out.println(evens + " " + odds);
    }
}

// Sample Input
//  2
//  Hacker
//  Rank
// Sample Output
//  Hce akr
//  Rn ak
//  (python3)for i in range(int(input())): s=input(); print(*["".join(s[::2]),"".join(s[1::2])])