package week1exercise.part1.whileloop;

public class DiceDoubles {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while(i < 7 & j < 7) {
            if (i == j) {
                System.out.println("The total is " + (i + j));
                break;
            }
            else {
                System.out.println("The total is " + (i + j));
                i++;
                j++;
            }
        }
    }
}
