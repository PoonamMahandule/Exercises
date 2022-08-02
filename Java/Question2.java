//Write a program to find the areas of Square and Rectangle by deriving them from shape
 class Shape{
    public void calculateArea(double a) {
        double res= a * a;
        System.out.println("Area of square is = " + res);
    }
    public void calculateArea(double w,double l) {
        double res1 = w*l;
        System.out.println("Area of Reactangle is = " + res1);
    }
}
public class Question2 {
    public static void main(String[] args) {

        Shape s = new Shape();
        s.calculateArea(12.0);
        s.calculateArea(10.0,12.0);

    }
}
