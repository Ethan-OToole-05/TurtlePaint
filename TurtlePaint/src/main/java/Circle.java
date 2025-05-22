import java.awt.*;

public class Circle extends Shape{
    private int radius;
    public Circle(Turtle turtle, Point location, Color color, int border, int radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {

//        double rotation = (2 * Math.PI);

        Point tracker = new Point(location.x + radius, location.y);

        turtle.penUp();
        turtle.goTo(tracker);
        turtle.penDown();
        turtle.setPenWidth(border);
        turtle.setColor(color);



        //circumference = 2PIr.

        for(double i = 0; i <= 2; i += 0.05) {
            double theta = i * Math.PI;
            
        }

    }
}
