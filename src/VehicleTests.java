public class VehicleTests
{
  public static void main(String[] args)
  {
    // -------------- LAB PART 1 -----------------
    // a. write code to create a Vehicle object with license "MC56WQ",
    //    toll fee of 10.75, and 5 passengers.
    //    Print out the calculated toll TollPrice.
//    Vehicle myVehicle = new Vehicle("MC56WQ", 10.75, 5);
//    System.out.println(myVehicle.calculateTollPrice());
//
//    // b. write code to create an electric Car with license "KXN73F",
//    //    toll fee of 8.50, and 2 passengers.
//    //    Print out the calculated toll price
//    Car myCar = new Car("KXN73F", 8.5, 2, true);
//    System.out.println(myCar.calculateTollPrice());

    // c. add a printCar() void method to the Car class that prints the
    //    Car's license plate, toll fee, number of passengers, whether it is electric,
    //    and whether a discount has been applied.
    //    Add getter methods as necessary to the Vehicle superclass.


    //
    // d. call the method on the Car you made in b to test it.
//    myCar.printCar();



    // e. write code to create a Truck with license "3K9JMX",
    //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
    //    Print out the calculated toll price
//    Truck myTruck = new Truck("3K9JMX", 24.75, 4, 6, true);
//    System.out.println(myTruck.calculateTollPrice());



    // f. add a printTruck() void method to the Truck class that prints the
    //    Truck's license plate, toll fee, number of passengers, number of axles,
    //    and whether it has a trailer.
    //    Add getter methods as necessary to the Vehicle superclass.
    //
    // g. call the method on the Truck you made in e to test it.
//    myTruck.printTruck();




    // ------------ LAB PART 2 ---------------
    // ----- instructions in lab sheet -------
    // Create a new Taxi object with license plate "8KM23Z", a toll fee of $9.25, 3 passengers, make it an electric car, and $5.00 of fare already collected.

//    Taxi myTaxi = new Taxi("8KM23Z", 9.25, 3, true, 5);
//    myTaxi.printTaxi();
//    System.out.println(myTaxi.getLicensePlate());
//    System.out.println(myTaxi.getTollFee());
//    System.out.println(myTaxi.getPassengers());
//    System.out.println(myTaxi.calculateTollPrice());
//    System.out.println(myTaxi.isElectric());
//    System.out.println(myTaxi.isDiscountApplied());
//    myTaxi.printCar();
//
//
//    System.out.println(myTaxi instanceof Car);
//    System.out.println(myTaxi instanceof Vehicle);
//    System.out.println(myTaxi instanceof Taxi);



    // ------------ LAB PART 3 ---------------
    // ----- instructions in lab sheet -------


    System.out.println();
    Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
    System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

    // now let's drop off the 5 riders, charging 3.50 per rider
    boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
    System.out.println(success); // should be true
    System.out.println(myTaxi3.getPassengers()); // should now be 1
    System.out.println(myTaxi3.getFareCollected()); // should be 17.50

    Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
    myVehicle3.printInfo();
    Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
    myTruck3.printInfo();
    Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
    myTaxi4.printInfo();












  }
}