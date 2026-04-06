package timing;
import java.util.Scanner;

public class LapAnalyzer {
    
    public void processLapData(String filepath) throws Exception {
        double totalLapTime = 0.0;
        double lapCount = 0.0;

        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(getClass().getResourceAsStream("/LapData.csv"))) {
            
            //skips header
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String line = scanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                double laptime = Double.valueOf(parts[2]);
                
                totalLapTime += laptime;
                lapCount += 1;
            }
            // prints
            System.out.println("Lap count: " + lapCount); 
            System.out.println("Average laptime: " + (totalLapTime / lapCount)); 
        }
    }
}

// ADD: skip first line
// ADD: Counter for how many laps are in the dataset
// ADD: only take clean laps
// ADD: Find fastest clean lap