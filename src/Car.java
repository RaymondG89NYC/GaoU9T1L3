public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    @Override
    public double calculateTollPrice() {
        if(getPassengers() >= 4){
            return getTollFee()*4;
        }
        return super.calculateTollPrice();
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

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Electric: " + electric);
        System.out.println("Discount: " + discountApplied);
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