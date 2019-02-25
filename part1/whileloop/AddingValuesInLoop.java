package week1exercise.part1.whileloop;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int i = 6;
        int j = 9;
        int total = i + j;
        while (total != 0) {
            if (i + j != 0) {
                i = total;
                System.out.println("The total so far is " + total);
            }
            else if (i + j == 0) {
                break;
            }
        }
    }
}
