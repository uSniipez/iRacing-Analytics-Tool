public class FuelCalc {
  Inputs inputs = new Inputs();

public String lapsUntilEmpty() {
  return "Laps until empty: " + ((double)inputs.getFuelInTank() / inputs.getFuelPerLap());
}

public double lapsPerTank() {
  return (inputs.getFuelInTank() / inputs.getFuelPerLap());
}

public String pitStopsRequired() {
  return "Pit stops required: " + ((double)inputs.getRaceLength() / lapsPerTank());
}


  
}

         
//lapsPerTank = tankSize / fuelUsedPerLap