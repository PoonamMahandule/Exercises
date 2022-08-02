// Program to access the super class method and instance variable by using super keyword from sub class
//package main.java;
// Super - to access the super class method and variable
class One {

    // super class var
    int i = 10;
    // super class method
    void show()
    {
        System.out.println("Super Class Method : i = "+i);
    }
}

class Two extends One{

    // sub class var
    int i = 20;
    // sub class method
    void show()
    {
        System.out.println("Sub CLass Method : i = "+i);
        // using super to call super class method
        super.show();
        // using super to access super class var
        System.out.println("Super i = " + super.i);
    }
}

public class Super1 {

    public static void main(String args[])
    {
        // create sub class object
        Two t = new Two();
        // This will call sub class method only
        t.show();
    }
}


