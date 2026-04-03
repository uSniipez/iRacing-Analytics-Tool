import java.util.Scanner;

public class Inputs {
  Scanner scanner = new Scanner(System.in);

  public Inputs() {
    
  }

  public Double getTankSize() {
    System.out.println("Enter the tank size in gallons (E.g. 31.7):");
    return scanner.nextDouble();
  }

  public Double getFuelUsedPerLap() {
    System.out.println("Enter the amount of fuel used per lap in gallons (E.g. 3.3):");
    return scanner.nextDouble();
  }

  public Integer getRaceLength() {
    System.out.println("Enter the race length in laps (E.g. 23):");
    return scanner.nextInt();
  }

  

  

  




  
}

