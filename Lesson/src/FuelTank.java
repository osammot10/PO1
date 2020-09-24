public class FuelTank {
    FuelType type;
    double amount;
    static int numberOfTanks=0;
    final int tankId;

    static{
        FuelTank.resetTanksCount();
    }

    public FuelTank(FuelType type, double amount){
        this.type=type;
        this.amount=amount;
        this.tankId=numberOfTanks;
        FuelTank.numberOfTanks++;
    }

    static void resetTanksCount(){
        numberOfTanks=0;
    }
}
