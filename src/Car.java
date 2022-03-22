public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }
  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Electric? " + electric +  "\nDiscount Applied? " + discountApplied);
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean dropOffPassengers(int numOut){
      if(numOut >= getPassengers()){
        return false;
      }
      else{
        setPassengers(getPassengers() - numOut);
        return true;
      }
  }

  public void applyDiscount(){
    if(discountApplied == false && electric){
      setTollFee(getTollFee() / 2);
      discountApplied = true;
    }
  }

  @Override
  public double calculateTollPrice()
  {
    if(getPassengers() > 4)
    {
      return 4 * getTollFee();
    }
    else
    {
      return super.calculateTollPrice();
    }
  }

}