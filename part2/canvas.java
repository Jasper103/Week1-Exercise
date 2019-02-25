package week1exercise.part2;

public class canvas {
    public static void main(String[] args) {
        rectangle s1 = new rectangle("Pink",5,3);
        rectangle s2 = new rectangle("White",8,5);

        s1.paint();
        s1.setColour("Green");
        s1.paint();
        s2.paint();
    }
}