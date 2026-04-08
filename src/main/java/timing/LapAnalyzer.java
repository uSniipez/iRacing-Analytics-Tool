package timing;
import java.util.Scanner;
import java.nio.file.Paths;

public class LapAnalyzer {
    
    public void processLapData(String fileName) throws Exception {
        double totalLapTime = 0.0;
        int lapCount = 0;
        int cleanLaps = 0;
        int dirtyLaps = 0;
        

        // creates a scanner for reading the file
        try (Scanner scanner = new Scanner(getClass().getResourceAsStream("/" + fileName))) {  // make it so it works with any fuile
           
            //skips header
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            
            // reads the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String line = scanner.nextLine();

                // skips empty lines
                if (line.isEmpty()) {
                    continue;
                }
        
                String[] parts = line.split(",");
                double laptime = Double.valueOf(parts[2]);

                // Counts clean and dirty laps
                if (parts[5].equals("1")) {    //fix this
                    cleanLaps += 1;
                } else {
                    dirtyLaps += 1;
                }
                
                totalLapTime += laptime;
                lapCount += 1;
            }
            
            
            // prints
            System.out.println("Race Information from " + fileName);
            System.out.println("Lap count: " + lapCount); 
            System.out.println("Average laptime: " + (totalLapTime / lapCount));
            System.out.println("Clean laps: " + cleanLaps + " Dirty laps: " + dirtyLaps);
            System.out.println("------------------");
            
        }
    }
}

// ADD: skip first line
// ADD: Counter for how many laps are in the dataset
// ADD: only take clean laps  | clean laps are representatedx as a 1 in the csv??? fact check
// ADD: Find fastest clean lap [5]