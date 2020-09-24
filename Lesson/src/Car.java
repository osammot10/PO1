public class Car {
    double speed;
    FuelType fuelType;
    double fuel;

    void refuel(FuelTank tank) throws Exception {
        if(!tank.type.equals(fuelType))throw new Exception();
        else fuel+=tank.amount;
    }

    void accelerate(double a){
        speed+=a;
        fuel-=a*fuelType.FUEL_CONS;
    }

    void fullBreak(){
        this.speed=0.;
    }

    public static void main(String[] args) throws Exception {
        Car myCar=new Car();
        FuelType diesel = new FuelType("diesel",1.3,0.3);
        FuelType petrol = new FuelType("benzina",1.5);
        FuelType unknown = new FuelType();
        FuelTank tank=new FuelTank(diesel,34.5);
        myCar.fuelType=diesel;
        myCar.refuel(tank);
        FuelTank.resetTanksCount();
    }

}
