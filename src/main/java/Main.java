import fuel.FuelCalc;
import timing.LapAnalyzer;


public class Main {
  public static void main(String[] args) throws Exception {
    ConsoleUI ui = new ConsoleUI(); 
    ui.consoleUI();                

    
   // processLapData("LapData.csv");
   // processLapData("ForryN4.csv");
   // FuelCalc fuelCalc = new FuelCalc();

   // System.out.println(fuelCalc.pitStopsRequired());
  }
  
  public static void processLapData(String LapData) throws Exception {
      LapAnalyzer analyzer = new LapAnalyzer();
      analyzer.processLapData(LapData);
  }
  
    
}
