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
    public static void lengthEquals( ){
        System.out.println("Enter the co-ordinates of first line: ");
        Scanner sc = new Scanner(System.in);
        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();
        System.out.println("Enter the co-ordinates of second line: ");
        Double x12 = sc.nextDouble();
        Double y12 = sc.nextDouble();
        Double x22 = sc.nextDouble();
        Double y22 = sc.nextDouble();
        Double line1 = (double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        Double line2 = (double)Math.sqrt((x12-x22)*(x12-x22)+(y12-y22)*(y12-y22));
        System.out.println("line1: "+line1);
        System.out.println("line2: "+line2);
        if(line1.equals(line2)){
            System.out.println("Both lines are equal");
        }else {
            System.out.println("Both lines are Not equal");
        }
    }
    public static void lengthCompare(){
        System.out.println("Enter Values to check the lines: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line1 value: ");
        double line1 = sc.nextInt();
        System.out.println("Enter line2 value: ");
        double line2 = sc.nextInt();
        if(Double.compare(line1,line2) == 0){
            System.out.println("line1=line2");
        }else if (Double.compare(line1,line2) < 0){
            System.out.println("line1 is less than line2");
        }else {
            System.out.println("line1 is greater than line2");
        }
    }

    public static void main(String[] args) {
            length();
            lengthEquals();
            lengthCompare();
    }
}






