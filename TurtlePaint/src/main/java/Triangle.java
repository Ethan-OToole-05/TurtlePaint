import java.awt.*;

public class Triangle extends Shape{
//    private int width;
//    private int height;
    private Point middle;
    private Point end;
//    public Triangle(Turtle turtle, Point location, Color color, int border, int width, int height) {
//        super(turtle, location, color, border);
//        this.width = width;
//        this.height = height;
//    }

    public Triangle(Turtle turtle, Point location, Color color, int border, Point middle, Point end) {
        super(turtle, location, color, border);
        this.middle = middle;
        this.end = end;
    }


    @Override
    public void paint() {

        turtle.penUp();
        turtle.goTo(location);
        turtle.penDown();
        turtle.setPenWidth(border);
        turtle.setColor(color);

        turtle.goTo(middle);
        turtle.goTo(end);

//        turtle.forward(width);
//        turtle.turnLeft(90);
//        turtle.forward(height);

        turtle.goTo(location);

    }
}
