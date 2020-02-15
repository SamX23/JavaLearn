import java.util.Scanner;

/**---------------------------------------
 * This simple car stories is created by Sami Kalamallah
 * Dated 11 Januari 2020
 * I hope this excercise can help anyone better in using java
 * lets improve this program!!
 * ---------------------------------------
 */

public class TheCarStories {
    int tire = 4;
    boolean keys = false;
    boolean doors = false;
    boolean engine = false;
    int fuels = 100;
    int poepleInCar = 0;
    boolean stopped = false;

    final long start = System.currentTimeMillis();
    final long end = System.currentTimeMillis();
    private long previousTime;

    void timing() {
        previousTime = System.currentTimeMillis();
        long currentTime = System.currentTimeMillis();
        double elapsedTime = (currentTime - previousTime) / 1000.0;
        System.out.println("Time in seconds : " + elapsedTime);
        previousTime = currentTime;
    }
    void newTiming() {
    }

    void statement(String check) {
        timing();
        if (tire == 4) {
            System.out.println("All of the tires are good");
        } else {
            System.out.println("All of the tires are gone");
        }

        System.out.println("Are you holding the keys? "+keys);
        System.out.println("The car doors opened? "+ doors);
        System.out.println("Is the engine on? "+ engine);

        if (fuels > 0) {
            System.out.println("How much fuel left? "+ fuels +" Gallons");
        } else {
            System.out.println("The fuels are gone!!");
        }

        if (engine) {
            System.out.println("The car is moving!");
        } else {
            System.out.println("The car has stopped!");
        }
    }

    void wreck() {
        doors = false;
        engine = false;
        tire = 0;
        fuels = 0;
    }

    void theCarMoving() {
        keys = true;
        doors = true;
        engine = true;
    }

    void theCarStopped() {
        keys = false;
        doors = false;
        engine = false;
        fuels = 75;
    }

    void fillInGas() {
        fuels = 100;
    }

    public static void main(String[] args) {
        TheCarStories human = new TheCarStories();
        Scanner command = new Scanner(System.in);

        //First checking, say check
        String firstInput = command.nextLine();
        human.statement(firstInput);

        //If all good then lets go, say lets go
        String secondInput = command.nextLine();
        human.theCarMoving();
        human.statement(secondInput);

        //the first stop, say stop
        String thirdInput = command.nextLine();
        human.theCarStopped();
        human.statement(thirdInput);

        //filling gas
        human.fillInGas();
        String forthInput = command.nextLine();
        human.theCarMoving();
        human.statement(forthInput);

        //car crashed
        String fifthInput = command.nextLine();
        human.wreck();
        human.statement(fifthInput);

        //And so on, and so on
        command.close();
    }
}