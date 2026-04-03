

public class FuelCalculations {
  Inputs inputs = new Inputs();
  
  


public Double lapsRemaining() {
  return ((double) inputs.getTankSize() / inputs.getFuelUsedPerLap());
}



  
}


//lapsPerTank = tankSize / fuelUsedPerLap