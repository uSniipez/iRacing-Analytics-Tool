import fuel.FuelCalc;
import timing.LapAnalyzer;
import java.util.Scanner;


public class ConsoleUI {
    Scanner scanner = new Scanner(System.in);

    private int getSelection;

    public ConsoleUI() {
    }

    public void consoleUI() {
        System.out.println("==================================================");
        System.out.println("              iRacing Analytics Tool              ");
        System.out.println("==================================================");
        // System.out.println("\n");
        System.out.println("(1) Analyze a Session");
        System.out.println("(2) Fuel Calculator  ");
        System.out.println("(3) --Coming Soon--  ");
        System.out.println("(4) Exit             ");
        System.out.println("");

        this.getSelection = scanner.nextInt();
        if (getSelection == 1) {
            try {
                System.out.println("\n");
                Main.processLapData("LapData.csv");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        if (getSelection == 2) {
            FuelCalc fuelCalc = new FuelCalc();
            System.out.println(fuelCalc.pitStopsRequired());
        }

        if(getSelection == 3) {
            System.out.println("Why are you here");
            System.exit(0);
        }

        if(getSelection == 4) {
            System.out.println("Quitting...");
            System.exit(0);
        }

    } 
} 
    
        



    

