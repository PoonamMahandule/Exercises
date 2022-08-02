// Program to prove that the default constructor of the super class is available to sub class by default
//package main.java;
// calling super class default constructor from sub class
class One1 {

    // super class default constructor
    One1()
    {
        System.out.println("One");
    }
}

class Two2 extends One{

    // sub class default constructor
    Two2()
    {
        System.out.println("Two");
    }

}

public class Super2 {

    public static void main(String args[])
    {
        // create sub class object
        Two2 t = new Two2();
    }
}

