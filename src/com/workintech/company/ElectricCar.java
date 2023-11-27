package com.workintech.company;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
