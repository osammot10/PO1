package it.unive.dais.po1.car.fuel;

public class FuelType {
    String name;
    double costPerLiter;
    public double FUEL_CONS;

    public FuelType(String name, double costPerLiter, double FUEL_CONS) {
        this.name=name;
        this.costPerLiter=costPerLiter;
        this.FUEL_CONS=FUEL_CONS;
    }

    public FuelType(String name, double costPerLiter) {
        //this.name="foo";  Questo non si può fare, perchè richimando così il costruttore deve essere il primo statement
        this(name,costPerLiter,0.05);
    }

    public FuelType() {
        this("unknown",0.,0.05);
    }


}
