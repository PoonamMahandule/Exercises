// Program to write abstract class with an instance variable rate,
// a concrete method : getRate() and an abstract method : calculateBill()
//package main.java;
// calculating electrycity bill for commercial and domestic plans
abstract class Plan
{
    // take rate as protected to access it in sub classes
    protected double rate;
    // accept rate into rate variable. Since rate will change depending on plan,
    // we declare abstract method
    public abstract void getRate();
    // calculate electrycity bill by taking units
    public void calculateBill(int units)
    {
        System.out.print("Bill amount for " + units + " units : ");
        System.out.println(rate * units);
    }
}
class CommercialPlan extends Plan
{
    // store commericial rate as Rs. 5.00 per unit
    public void getRate()
    {
        rate = 5.00;
    }
}
class DomesticPlan extends Plan
{
    // store domestic rate as Rs. 2.60 per unit
    public void getRate()
    {
        rate = 2.60;
    }
}
public class Calculate {
    public static void main(String args[])
    {
        // create reference p to abstract class
        Plan p;
        // calculate commercial bill for 250 units
        System.out.println("Commercial Connection : ");
        p = new CommercialPlan();       //Use reference to refer to sub class
        // object
        p.getRate();
        p.calculateBill(250);
        // calculate domestic bill for 150 units
        System.out.println("Domestic Connection : ");
        p = new DomesticPlan();       //Use reference to refer to sub class
        // object
        p.getRate();
        p.calculateBill(150);
    }
}

