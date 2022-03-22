public class Vehicle
{
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers)
  {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }
  
  public double calculateTollPrice()
  {
    return tollFee * passengers;
  }

  public String getLicensePlate(){
    return licensePlate;
  }

  public double getTollFee() {
    return tollFee;
  }

  public int getPassengers() {
    return passengers;
  }

  public void setPassengers(int passengers) {
    this.passengers = passengers;
  }

  public void setTollFee(double tollFee) {
    this.tollFee = tollFee;
  }

  public void printInfo(){
    System.out.println("License plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers());
  }
}