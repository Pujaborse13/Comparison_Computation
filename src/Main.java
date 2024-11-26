import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Line {
    private Point startPoint;
    private Point endPoint;


    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) +
                Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line otherLine = (Line) obj;
        return Double.compare(this.calculateLength(), otherLine.calculateLength()) == 0;
    }
    public int compareTo(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(new Point(1, 2), new Point(4, 6));
        Line line2 = new Line(new Point(2, 3), new Point(5, 7));

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        if (line1.equals(line2)) {
            System.out.println("The two lines are equal in length.");
        } else {
            System.out.println("The two lines are not equal in length.");
        }

        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult == 0) {
            System.out.println("Line 1 is equal to Line 2.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
    }
}


