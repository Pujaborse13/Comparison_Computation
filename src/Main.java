import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Enter coordinates for Line 1:");
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for Line 2:");
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        System.out.print("Enter x4: ");
        double x4 = scanner.nextDouble();

        System.out.print("Enter y4: ");
        double y4 = scanner.nextDouble();

        // Calculate lengths of the two lines
        double length1 = calculateLineLength(x1, y1, x2, y2);
        double length2 = calculateLineLength(x3, y3, x4, y4);

        int comparisonResult = Double.compare(length1, length2);

        if (comparisonResult == 0) {
            System.out.println("The two lines are equal in length.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 1 is less than Line 2.");
        }
    }
    public static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


    }
    }
