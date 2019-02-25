package week1exercise.part1.whileloop;

public class KeepGuessing {
    public static void main(String[] args) {
        int i = 6;
        while (i >= 1 & i <=10) {
            if (i == 6) {
                System.out.println("That's right! You're a good guesser");
                break;
            }
            else {
                System.out.println("That's incorrect. Guess again.");
            }
        }
    }
}
