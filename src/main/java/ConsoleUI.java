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

        this.getSelection = scanner.nextInt();
        if (getSelection == 1) {
            
        }

       




    } 
} 
    
        



    

