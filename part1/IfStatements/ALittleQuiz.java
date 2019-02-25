package week1exercise.part1.IfStatements;

public class ALittleQuiz {
    public String choicea = "Y";
    public String choiceb = "N";
    String result = "";
    public static String quiz(int CHOA,int CHOB,int CHOC){
        if(CHOA == 3 & CHOB == 1 & CHOC == 2) {
            System.out.println("Overall, you got all right answers."
            + "\nThanks for playing!");
        }
        else if(CHOA != 3 & CHOB != 1 & CHOC != 2){
            System.out.println("You missed!");
        }
    }
}