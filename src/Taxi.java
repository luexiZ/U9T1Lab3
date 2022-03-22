public class Taxi extends Car{

    private double fareCollected;


    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Total fare collected: $" + fareCollected);
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        fareCollected += farePerRider * (getPassengers() -1);
        return dropOffPassengers(getPassengers() - 1);
    }





}
