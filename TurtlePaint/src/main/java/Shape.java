import java.awt.*;

public abstract class Shape {
    protected Turtle turtle;
    protected Point location;
    protected Color color;
    protected int width;

    public Shape(Turtle turtle, Point location, Color color, int width) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.width = width;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract void paint();
}
