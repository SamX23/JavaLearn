import java.util.Random;

public class CoinToss {

    String tossACoin() {
        Random random = new Random();
        int x = Math.abs(random.nextInt()) % 2;
        if (x == 0) {
            return "Up";
        } else {
            return "Down";
        }
    }

    public static void main(String[] args) {
        CoinToss gow = new CoinToss();
        System.out.println(gow.tossACoin());
        System.out.println(gow.tossACoin());
        System.out.println(gow.tossACoin());
    }
}