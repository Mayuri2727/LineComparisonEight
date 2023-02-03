package LineComparisionEight;
import java.util.Scanner;

public class LineComparison {
    public static void length() {
        System.out.println("Welcome to Line Comparison Computation Program ");
        System.out.println("Enter the co-ordinates of line:");
        Scanner sc = new Scanner(System.in);
        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();
        Double line = (Double) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("length of the line: " +line);

    }

    public static void main(String[] args) {
        length();

    }
}

