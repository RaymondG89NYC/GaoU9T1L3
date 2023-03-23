public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printCar(){
        System.out.println("License: " + getLicensePlate());
        System.out.println("Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric: " + electric);
        System.out.println("Discount: " + discountApplied);
    }

    public boolean isElectric() {
        return electric;
    }
    public boolean isDiscountApplied(){
        return discountApplied;
    }
    public boolean dropOffPassengers(int numOut){
        if(getPassengers() > numOut){
            setPassengers(getPassengers()-numOut);
            return true;
        }
        else{
            return false;
        }
    }
    public void applyDiscount(){
        if(!discountApplied){
            if(electric){
                setTollFee((getTollFee()*0.5));
                discountApplied = true;
            }
        }
    }
    public void setDiscountApplied(boolean yes){
        discountApplied = true;
    }
}