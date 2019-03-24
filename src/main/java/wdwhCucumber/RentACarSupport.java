package wdwhCucumber;

public class RentACarSupport {

    private int availableCars;

    public RentACarSupport() {
        this.availableCars = 0;
    }

    public void createCars(int amount){
        this.availableCars = amount;
    }

    public void rentACar(){
        if (availableCars > 0){
            availableCars--;
        }
    }

    public int getAvailableCars(){
        return this.availableCars;
    }

}
