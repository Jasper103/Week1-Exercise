package week1exercise.part1.IfStatements;

public class HowOldAreYouSpecifically {
    public String name = "Jasper";
    public int year = 19;
    public static String driver_name (int year){
        String result = "";

        if (year < 16) {
            result = "You cannot drive";
        }
        else if (year >= 16 & year <= 17) {
            result = "You can drive but not vote";
        }
        else if (year >= 18 & year <= 24) {
            result = "You can vote but not rent a car";
        }
        else if (year >= 25) {
            result = "You can do pretty much anything";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hey, what's your name? (Sorry,I keep forgetting.)"
        + "Jasper"+ "\nOK, " + "Jasper" + ",how old are you?" + 19 +
                "\n" + "\n" + driver_name(19));
    }
}
