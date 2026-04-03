// Imports
import java.util.Scanner;

// Class defintion
public class Inputs { 
  Scanner scanner = new Scanner(System.in);

  // Methods
  public double getFuelInTank() {
    System.out.println("Enter the amount of fuel in the car in gallons (E.g. 26.4):");
    return Double.valueOf(scanner.nextLine());
  }

  public double getFuelPerLap() {
    System.out.println("Enter the amount of fuel used per lap in gallons (E.g. 3.3):");
    return Double.valueOf(scanner.nextLine());
  }

  public int getRaceLength() {
    System.out.println("Enter the race length in laps (E.g. 23):");
    return Integer.valueOf(scanner.nextLine());
  }

  

  

  




  
}

