import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String trash = "";
        int mph = 0;
        int gallons = 0;
        double costPerGallon = 0;
        double costPerMile = 0;
        double costPerHundredMiles = 0;
        int mileage = 0;


            System.out.print("Enter the gas mileage per hour: ");
            if (in.hasNextInt()) ;
        {
            mph = in.nextInt();
            in.nextLine();
        }

            System.out.print("Enter the gallons of gas in the car: ");
            if (in.hasNextInt()) ;
        {
            gallons = in.nextInt();
            in.nextLine();
        }
        {
            System.out.print("Enter the cost per gallon: ");
            if (in.hasNextDouble()) {
                costPerGallon = in.nextDouble();
                in.nextLine();
                mileage = gallons * mph;
                costPerMile = costPerGallon * gallons / mileage;
                costPerHundredMiles = costPerMile * 100.00;

                System.out.printf("You can travel " + mileage + " miles and the cost to travel 100 miles is: $%.2f %n", costPerHundredMiles);
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a number!");

            }
        }
    }
}
