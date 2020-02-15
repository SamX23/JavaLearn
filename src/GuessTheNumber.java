import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int tNumber;
    int max;
    int count = 0;
    Scanner scan = new Scanner(System.in);

    public GuessTheNumber() {
        Random random = new Random();
        max = 50;
        tNumber = Math.abs(random.nextInt()) % (max + 1);
    }

    void play() {
        while (true) {

            count++;
            int move = scan.nextInt();
            if (move > tNumber) {
                System.out.println("Still too much");
            } else if (move < tNumber) {
                System.out.println("a little bit smaller");
            } else {
                System.out.println("Game Over, you are really a great guesser !!");
                break;
            }

            if (count == 4) {
            System.out.println("You are really trying huh!!");
            } else if (count == 8) {
                System.out.println("I believe you can do it bro!!");
            }
        }
    }

    public static void howBig(int x ) {
        if (x >= 0 && x <= 10) {
            System.out.println("Small number");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Huge number");
        } else {
            System.out.println("Hundreds ++");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input the number between 0 - 100 !");
        GuessTheNumber guess = new GuessTheNumber();
        guess.play();
        /*
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            howBig(num);
        }
        */
    }
}