import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    Scanner scan = new Scanner(System.in);
    String story, name, adjective1, adjective2,
            noun1, noun2, noun3, adverb, randomNums;
    Random rand = new Random();

    //getters

    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }
    public String getNoun3() {
        return noun3;
    }

    public String getRandomNums() {
        return randomNums;
    }

    //setters

    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdjective1(String newAdj1) {
        this.adjective1 = newAdj1;
    }

    public void setAdjective2(String newAdj2) {
        this.adjective2 = newAdj2;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun2 = newNoun3;
    }

    public void setAdverb(String newAdv) {
        this.adverb = newAdv;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not "+numberHolder[0]+", not"+numberHolder[1]+", but" +numberHolder[2];
    }

    //print instruction
    public void printInstruction() {
        System.out.println("Welcome to the madlibs game. If you type in" +
                " words, we'll give you a story. Start by typing in a name.");
    }

    //insert data
    public void enterName() {
        setName(scan.nextLine());
    }
    public void enterNoun1() {
        System.out.println("Give me a noun");
        setNoun1(scan.nextLine());
    }
    public void enterNoun2() {
        System.out.println("Give me another noun");
        setNoun2(scan.nextLine());
    }
    public void enterNoun3() {
        System.out.println("Give me the last noun");
        setNoun3(scan.nextLine());
    }
    public void enterAdjective1() {
        System.out.println("Give me an adjective");
        setAdjective1(scan.nextLine());
    }
    public void enterAdjective2() {
        System.out.println("Give me another adjective");
        setAdjective2(scan.nextLine());
    }
    public void enterAdverb() {
        System.out.println("Give me an adverb");
        setAdverb(scan.nextLine());
    }

    public void putTogetherTheStory() {
        int randNum = Math.abs(rand.nextInt()) % 2;
        if (randNum == 0) {
            story = "Jesse and her best friend " + getName() + " went to disney world today " +
                    "and saw a " + getNoun1() + " in a show at the magic kingdom " +
                    "and ate a " + getAdjective1() + " feast for dinner. The next day, I " +
                    "ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() + " " +
                    "and then that night I gazed at the " + getRandomNums() + " " +
                    " " + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        } else {
            story = "Sami and his friend " + getName() + " doing a code in his house " +
                    "and use a " + getNoun1() + " to fasten their coding progress " +
                    "while grind a " + getAdjective1() + " for lunch. After a few hours, they" +
                    "eat " + getAdverb() +"while "+getName()+" turning on" + getRandomNums() + " " +
                    " " + getAdjective2() + " computers to process a faster server in " + getNoun3() + ".";
        }
        setStory(story);
    }

    public void play() {
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstruction();
        game.play();
    }
}
