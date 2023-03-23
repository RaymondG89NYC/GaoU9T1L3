public class Taxi extends Car {
    double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi(){
        System.out.println("License: " + getLicensePlate());
        System.out.println("Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric: " + isElectric());
        System.out.println("Discount: " + isDiscountApplied());
        System.out.println("Fare: " + fareCollected);
    }
    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers()+numRiders);
        fareCollected += (farePerRider * numRiders);
        if(!isDiscountApplied()){
            if(getPassengers() >= 4){
                setTollFee((getTollFee()*0.5));
                setDiscountApplied(true);
            }
        }
    }

    public double getFareCollected(){
        return fareCollected;
    }
}
