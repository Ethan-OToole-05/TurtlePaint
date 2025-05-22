import java.awt.*;

public class Square extends Shape {
    private int width;
    private int height;

    public Square(Turtle turtle, Point location, Color color, int border, int width, int height) {
        super(turtle, location, color, border);
        this.width = width;
        this.height = height;

    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(location);
        turtle.penDown();

        turtle.setPenWidth(border);
        turtle.setColor(color);

        turtle.forward(width);

        turtle.turnRight(90);
        turtle.forward(height);

        turtle.turnRight(90);
        turtle.forward(width);

        turtle.turnRight(90);
        turtle.forward(height);
    }
}
