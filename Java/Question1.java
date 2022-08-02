// write a program to show how to override the calculateBill() method of commercial class inside the domestic class
class Domestic {
    public void calculateBill(){
        System.out.println("inside domestic class");
    };
}
class Commercial extends Domestic{
    @Override
    public void calculateBill(){
        System.out.println("inside commercial class");
    };
}
public class Question1 {
    public static void main(String[] args) {
        Commercial c= new Commercial();
        c.calculateBill();
    }
}
