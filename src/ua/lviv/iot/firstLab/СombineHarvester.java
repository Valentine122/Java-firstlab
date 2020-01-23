package ua.lviv.iot.firstLab;

public class СombineHarvester {

    public static final int DEFAULT_NUMBER_OF_SEATS = 1;

    private double volumGrainInKg;

    private double fuelConsumptionPerHectareInLiters;

    private int enginePowerHorsepower;

    private String color;

    private int wheels;

    protected String name;

    protected int numberOfSeats;

    private static int heightOfKombain;


    public СombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color, int wheels,
                            String name, int numberOfSeats) {
        this.volumGrainInKg = volumGrainInKg;
        this.fuelConsumptionPerHectareInLiters = fuelConsumptionPerHectareInLiters;
        this.enginePowerHorsepower = enginePowerHorsepower;
        this.color = color;
        this.wheels = wheels;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

    public СombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color, int wheels, String name) {
        this(volumGrainInKg, fuelConsumptionPerHectareInLiters, enginePowerHorsepower, color, wheels, name, DEFAULT_NUMBER_OF_SEATS);
    }

    public СombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color) {
        this(volumGrainInKg, fuelConsumptionPerHectareInLiters, enginePowerHorsepower, color, 0, null, DEFAULT_NUMBER_OF_SEATS);
    }

    public СombineHarvester(){

    }

    public double getVolumGrainInKg() {
        return volumGrainInKg;
    }

    public void setVolumGrainInKg(double volumGrainInKg) {
        this.volumGrainInKg = volumGrainInKg;
    }

    public double getFuelConsumptionPerHectareInLiters() {
        return fuelConsumptionPerHectareInLiters;
    }

    public void setFuelConsumptionPerHectareInLiters(double fuelConsumptionPerHectareInLiters) {
        this.fuelConsumptionPerHectareInLiters = fuelConsumptionPerHectareInLiters;
    }

    public int getEnginePowerHorsepower() {
        return enginePowerHorsepower;
    }

    public void setEnginePowerHorsepower(int enginePowerHorsepower) {
        this.enginePowerHorsepower = enginePowerHorsepower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    static public int printStaticHeightOfKombain() {
        return heightOfKombain;
    }


    @Override
    public String toString() {
        return "СombineHarvester{" +
                "volumGrainInKg=" + volumGrainInKg +
                ", fuelConsumptionPerHectareInLiters=" + fuelConsumptionPerHectareInLiters +
                ", enginePowerHorsepower=" + enginePowerHorsepower +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                ", numberOfSeats=" + numberOfSeats + "" +
                heightOfKombain + '}';
    }

    public void resetСombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color, int wheels,
                            String name, int numberOfSeats, int heightOfKombain) {
        this.volumGrainInKg = volumGrainInKg;
        this.fuelConsumptionPerHectareInLiters = fuelConsumptionPerHectareInLiters;
        this.enginePowerHorsepower = enginePowerHorsepower;
        this.color = color;
        this.wheels = wheels;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.heightOfKombain = heightOfKombain;
    }

}
