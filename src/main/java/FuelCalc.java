public class FuelCalc {
  Inputs inputs = new Inputs();

public double lapsRemaining() {
  
  return (double) inputs.getFuelInTank() / inputs.getFuelPerLap();
}

public String lapsUntilEmpty() {
  return "Laps until empty: " + ((double)inputs.getFuelInTank() / inputs.getFuelPerLap());
}


  
}

         
//lapsPerTank = tankSize / fuelUsedPerLap