//Simplified project for my previous java class - which was a car maintenance tracker. Since this test seems to be simple,
//I have simplified and isolated a tiny part of that program to use as an example here. The tests can be found in MPGPriceTest.java
//Program purpose: finds price of filling up your tank.
public class MPGPrice {
    private double tankSize;
    private double ppG; //price per gallon

    public MPGPrice(double tankSize, double ppG) {
        this.tankSize = tankSize;
        this.ppG = ppG;
    }

    public double calculateFillUpCost() {
        if (tankSize <= 0) {
            throw new IllegalArgumentException("Tank capacity must be greater than zero.");
        }
        if (ppG < 0) {
            throw new IllegalArgumentException("Price per gallon cannot be negative.");
        }
        return tankSize * ppG;
    }
}
