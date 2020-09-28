package it.unive.dais.po1.car;

import it.unive.dais.po1.car.fuel.*;

public class Car {
    double speed;
    FuelType fuelType;
    double fuel;

    public Car(double speed, FuelType fuelType, double fuel) {
        this.speed = speed;
        this.fuelType = fuelType;
        this.fuel = fuel;
    }

    void refuel(FuelTank tank) throws Exception {
        if(!tank.type.equals(fuelType))throw new Exception();
        else {
            fuel += tank.amount;
            tank.amount=0;
        }
    }

    void accelerate(double a){
        speed+=a;
        fuel-=a*fuelType.FUEL_CONS;
    }

    void fullBreak(){
        this.speed=0.;
    }

    public static void main(String[] args) throws Exception {
        FuelType diesel = new FuelType("diesel",1.3,0.3);
        Car myCar=new Car(100,diesel,10);
        FuelTank tank=new FuelTank(diesel,10);
        myCar.refuel(tank);

    }

}
