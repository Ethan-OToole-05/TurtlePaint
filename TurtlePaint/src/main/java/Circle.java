import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Turtle turtle, Point location, Color color, int border, int radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {

        Point tracker = new Point(location.x + radius, location.y);

        turtle.penUp();
        turtle.goTo(tracker);
        turtle.penDown();
        turtle.setPenWidth(border);
        turtle.setColor(color);

        for (double i = 0; i <= 2.05; i += 0.05) {
            double theta = i * Math.PI;
            double x = location.x + radius * Math.cos(theta);
            double y = location.y + radius * Math.sin(theta);

            turtle.goTo(x, y);

//            double x1 = tracker.x - location.x;
//            double y1 = tracker.y - location.y;
//            double x2 = x1 * Math.cos(theta) - y1 * Math.sin(theta);
//            double y2 = x1 * Math.sin(theta) + y1 * Math.cos(theta);
//
//            tracker = new Point((int) x2 + location.x, (int) y2 + location.y);
//
//            turtle.goTo(tracker);
        }

    }
}
