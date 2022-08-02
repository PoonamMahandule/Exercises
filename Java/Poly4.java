// Program where calculate() method of super class is overridden by the calculate() method of sub class.
// The behavior of the calculate() method is dynamically decided
//package main.java;
class One4
{
    // method to calculate square value
    void calculate(double x)
    {
        System.out.println("Square Value = "+(x*x));
    }
}
class Two4 extends One4
{
    // method to calculate square root value
    void calculate(double x)
    {
        System.out.println("Square Root = " + Math.sqrt(x));
    }
}
public class Poly4 {
    public static void main(String args[])
    {
        // Create sub class object t
        Two4 t = new Two4();
        // call calculate() method using t
        t.calculate(25);
    }
}


