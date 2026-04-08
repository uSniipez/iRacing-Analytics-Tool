package timing;
import java.util.Scanner;


public class LapAnalyzer {
    
    public void processLapData(String fileName) throws Exception {
        String sessionDate = "";
        String driverName = ""; 
        int lapCount = 0;
        int cleanLaps = 0;
        int dirtyLaps = 0;
        double totalSeconds = 0.0; // used to find avg lap time
        double fastestLapInSeconds = Double.MAX_VALUE; // 
        

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
                    totalSeconds += laptime;
                } else {
                    dirtyLaps += 1;
                }

                // Fastest Lap
                if (laptime < fastestLapInSeconds) {
                    if (parts[5].equals("1")) {
                        fastestLapInSeconds = laptime;
                    }  
                }
                lapCount += 1;
                sessionDate = parts[3];
                driverName = parts[4];
            }   
        }

        //TODO Remove laps that are x amount slower so it doesnt mess up the results
        String avgLapTime = formatLapTime(totalSeconds / lapCount);
        String fastestLap = formatLapTime(fastestLapInSeconds);

        
        
        // prints
        System.out.println("Session Information from " + fileName + " on " + sessionDate);
        System.out.println("Driver: " + driverName);
        System.out.println("Fastest lap: " + fastestLap);
        System.out.println("Average laptime: " + avgLapTime);
        System.out.println("Laps: " + lapCount + " | Valid: " + cleanLaps + " | Invalid: " + dirtyLaps);
        System.out.println("------------------");
    }

    private String formatLapTime(double seconds) {
        long millis = Math.round(seconds * 1000.0);
        long minutes = (millis / 1000) / 60;
        long secs    = (millis / 1000) % 60;
        long ms      = (millis % 1000);
        return String.format("%d:%02d.%03d", minutes, secs, ms);
    }

}

