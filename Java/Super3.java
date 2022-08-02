// Program for parameterized constructor of the super class can be called from sub class using super()
//package main.java;
// calling super class parameterized constructor from sub class
class One3 {

    // super class var
    int i;
    // super class default constructor
    One3(int i)
    {
        this.i =i;
    }
}
class Two3 extends One3{

    // sub class var
    int i;
    // sub class default constructor
    Two3(int a, int b)
    {
        super(a);   // call super class constructor and pass a
        i = b;  // initialize sub class var
    }

    // sub class method
    void  show()
    {
        System.out.println("Sub Class i = "+i);
        System.out.println("Super Class i = "+ super.i);
    }
}
public class Super3 {

    public static void main(String args[])
    {
        // create sub class object
        Two3 t = new Two3(11,22);
// class sub class method
        t.show();
    }
}