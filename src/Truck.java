public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Number of axles: " + axles + "\nHas trailer? " + hasTrailer);
  }

  public boolean validateLicensePlate(){
    if(!hasTrailer){
      return true;
    }
    else if(getLicensePlate().substring(getLicensePlate().length() -2).equals("MX")){
      if(axles > 4) {
        return true;
      }
    }
    else if(getLicensePlate().substring(getLicensePlate().length() -2).equals("LX")){
      if(axles <= 4) {
        return true;
      }
    }
     return false;
  }

  @Override
  public double calculateTollPrice()
  {
    double costs = getTollFee() * axles;
    if(hasTrailer){
      costs *= 2;
    }
    return costs;
  }



}