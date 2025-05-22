import java.awt.*;
import java.util.Scanner;

public class UI {
    static Scanner input = new Scanner(System.in);

    public static void display() {
        System.out.println("Welcome!");
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("0) Exit");

            int selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1:
                    processAddShape();
                    break;
                case 2:
                    processSaveImage();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }

    public static void processAddShape() {
        //Which shape (1. square, 2. circle, 3. triangle)?
        //What is the radius? -- this should only show if the shape
        //is a circle
        //What is the border width?
        //What is the border color?
        //What is the location of the shape (x,y)
        System.out.println("Which shape (1. square, 2. circle, 3. triangle)");
        int selection = input.nextInt();
        input.nextLine();
        switch (selection) {
            case 1:
                processSquare();
                break;
            case 2:
                processCircle();
                break;
            case 3:
                processTriangle();
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public static void processSaveImage() {
        System.out.print("What do you want the name of the file to be?");
        String fileName = input.nextLine();
        MainApp.world.saveAs(fileName);
    }

    public static void processSquare() {
        //What is the border width?
        //What is the border color?
        //What is the location of the shape (x,y)
        System.out.print("What is the border width?");
        int borderWidth = input.nextInt();
        input.nextLine();
        System.out.println("What is the border color?");
        System.out.print("Red Value:");
        int r = input.nextInt();
        input.nextLine();
        System.out.print("Green Value:");
        int g = input.nextInt();
        input.nextLine();
        System.out.print("Blue Value:");
        int b = input.nextInt();
        input.nextLine();
        Color color = new Color(r, g, b);
        System.out.println("What is the location of the shape (x,y):");
        System.out.print("X location: ");
        int x = input.nextInt();
        input.nextLine();
        System.out.print("Y location: ");
        int y = input.nextInt();
        input.nextLine();
        System.out.print("Width: ");
        int width = input.nextInt();
        input.nextLine();
        System.out.print("Height: ");
        int height = input.nextInt();
        input.nextLine();

        Square square = new Square(new Turtle(MainApp.world), new Point(x, y), color, borderWidth, width, height);

        square.paint();

    }

    public static void processCircle() {
        System.out.print("What is the border width?");
        int borderWidth = input.nextInt();
        input.nextLine();
        System.out.println("What is the border color?");
        System.out.print("Red Value:");
        int r = input.nextInt();
        input.nextLine();
        System.out.print("Green Value:");
        int g = input.nextInt();
        input.nextLine();
        System.out.print("Blue Value:");
        int b = input.nextInt();
        input.nextLine();
        Color color = new Color(r, g, b);
        System.out.println("What is the location of the shape (x,y):");
        System.out.print("X location: ");
        int x = input.nextInt();
        input.nextLine();
        System.out.print("Y location: ");
        int y = input.nextInt();
        input.nextLine();
        System.out.println("What is the radius? ");
        int radius = input.nextInt();
        input.nextLine();

        Circle circle = new Circle(new Turtle(MainApp.world), new Point(x, y), color, borderWidth, radius);

        circle.paint();

    }
    public static void processTriangle() {

        System.out.print("What is the border width?");
        int borderWidth = input.nextInt();
        input.nextLine();
        System.out.println("What is the border color?");
        System.out.print("Red Value:");
        int r = input.nextInt();
        input.nextLine();
        System.out.print("Green Value:");
        int g = input.nextInt();
        input.nextLine();
        System.out.print("Blue Value:");
        int b = input.nextInt();
        input.nextLine();
        Color color = new Color(r, g, b);
        System.out.println("What is the location of the shape (x,y):");
        System.out.print("X location: ");
        int x = input.nextInt();
        input.nextLine();
        System.out.print("Y location: ");
        int y = input.nextInt();
        input.nextLine();
        System.out.println("What is the middle location of the shape (x,y):");
        System.out.print("X location: ");
        int middleX = input.nextInt();
        input.nextLine();
        System.out.print("Y location: ");
        int middleY = input.nextInt();
        input.nextLine();
        System.out.println("What is the end location of the shape (x,y):");
        System.out.print("X location: ");
        int endX = input.nextInt();
        input.nextLine();
        System.out.print("Y location: ");
        int endY = input.nextInt();
        input.nextLine();


        Triangle triangle = new Triangle(new Turtle(MainApp.world), new Point(x, y), color, borderWidth, new Point(middleX, middleY), new Point(endX, endY));

        triangle.paint();


    }
}
