import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
            System.out.println("Welcome to Line Comparison Computation Program");
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

      
        double length = calculateLineLength(x1, y1, x2, y2);
        System.out.println("The length of the line is: " + length);
    }
public static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
       


    }
    }
