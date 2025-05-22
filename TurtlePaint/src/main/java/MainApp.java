import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        World world = new World(600, 600);
        Turtle pointDexter = new Turtle(world, 100, 100);
        Turtle vash = new Turtle(world, 200, 200);
        Turtle hisMom = new Turtle(world, 300, 300);
        Square square = new Square(pointDexter, new Point(0, 0), Color.PINK, 3, 200, 200);
        Triangle triangle = new Triangle(vash, new Point(200, 200), Color.CYAN, 3, new Point(21, 50), new Point(0, 0));
        Circle circle = new Circle(hisMom, new Point(100, 100), Color.MAGENTA, 3, 50);

        square.paint();
        triangle.paint();
        circle.paint();



        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
//        World world = new World(200, 200);
//        Turtle turtle = new Turtle(world,-100, -100);
//
//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
////        double widthSquared = Math.pow(width, 2);
////        double heightSquared = Math.pow(height, 2);
////        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.PINK);
//
//        turtle.forward(width);
//
//        turtle.turnRight(90);
//        turtle.forward(height);
//
//        turtle.turnRight(90);
//        turtle.forward(width);
//
//        turtle.turnRight(90);
//        turtle.forward(height);

//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
    }
}
