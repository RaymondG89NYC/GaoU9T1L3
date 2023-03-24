public class Taxi extends Car {
    double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
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
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);
    }

    @Override
    public void discrimination() {
        System.out.println("I am a taxi :( this is so sad");
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        fareCollected += (getPassengers()-1)*farePerRider;
        return dropOffPassengers(getPassengers()-1);
    }

    public double getFareCollected(){
        return fareCollected;
    }
}
