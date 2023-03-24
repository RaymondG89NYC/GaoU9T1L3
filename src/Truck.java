public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public boolean validateLicensePlate(){
        if(hasTrailer){
            if(axles > 4){
                if(getLicensePlate().indexOf("MX") == 4){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(getLicensePlate().indexOf("LX") == 4){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return true;
        }
    }

    @Override
    public double calculateTollPrice() {
        double totalFee = axles * getTollFee();
        if(hasTrailer){
            totalFee *= 2;
        }
        return totalFee;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Trailer: " + hasTrailer);
    }
}