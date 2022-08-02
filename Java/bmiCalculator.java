import java.util.Scanner;

public class bmiCalculator {
        public static void main(String[] args) {
            double weightInKg = 0.0f;
            double heightInMeters = 0.0f;
            String result = null;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter weight in Kg: ");
            weightInKg = scan.nextDouble();
            System.out.print("Enter height in meters: ");
            heightInMeters = scan.nextDouble();

            double bmi = weightInKg / ( heightInMeters * heightInMeters) ;
            System.out.println("Calculated BMI is : "+bmi);
            scan.close();
        }
}
