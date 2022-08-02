// Program to create sample class which contains two methods with the same name but with different signatures
//package main.java;
class Sample
{
    // method to add two values
    void add(int a, int b)
    {
        System.out.println("Sum of two = "+(a+b));
    }

    // method to add three values
    void add(int a, int b, int c)
    {
        System.out.println("Sum of three = "+(a+b+c));
    }
}

public class Poly {

    public static void main(String args[])
    {

        // create sample class object
        Sample s = new Sample();
// call add() and pass two values
        s.add(10,12);     // This call is bound with the first method
        // call add() and pass three values
        s.add(10,12, 15);     // This call is bound with the second method
    }
}
