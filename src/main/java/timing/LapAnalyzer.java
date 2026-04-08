package timing;
import java.util.Scanner;


public class LapAnalyzer {
    
    public void processLapData(String fileName) throws Exception {
        int lapCount = 0;
        int cleanLaps = 0;
        int dirtyLaps = 0;
        double totalSeconds = 0.0; // used to find avg lap time
        

        // creates a scanner for reading the file
        try (Scanner scanner = new Scanner(getClass().getResourceAsStream("/" + fileName))) {
           
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
                
                totalSeconds += laptime;
                lapCount += 1;
            }   
        }
        long avgLapMillis = Math.round((totalSeconds * 1000.0) / lapCount); //not used yet
        long minutes = (avgLapMillis / 1000) / 60;
        long seconds = (avgLapMillis / 1000) % 60;
        long millis  = avgLapMillis % 1000;
        String avgLapTime = String.format("%d:%02d.%03d", minutes, seconds, millis);

        long fastestLap = 0;
        
        // prints
        System.out.println("Race Information from " + fileName);
        System.out.println("Lap count: " + lapCount); 
        System.out.println("Average laptime: " + avgLapTime);
        System.out.println("Clean laps: " + cleanLaps + " Dirty laps: " + dirtyLaps);
        System.out.println("------------------");
    }
}

