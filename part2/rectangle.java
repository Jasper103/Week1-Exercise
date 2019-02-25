package week1exercise.part2;

public class rectangle {
    private String colour;
    private int length;
    private int width;

    public rectangle(String colour,int length,int width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void paint() {
        String paintColour = this.colour.substring(0,1);
        for(int row = 0;row < this.length;row++) {
            for(int col = 0;col < this.length;col++) {
                System.out.print(paintColour + " ");
            }

        for(int ROW = 0;ROW < this.width;ROW++) {
            for(int col = 0;col < this.width;col++) {
                System.out.println(paintColour + " ");
            }
        }
            System.out.println();
        }
    }
}
