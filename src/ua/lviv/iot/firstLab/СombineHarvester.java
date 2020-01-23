package ua.lviv.iot.firstLab;

public class СombineHarvester {

    private double volumGrainInKg;
    private double fuelConsumptionPerHectareInLiters;
    private int enginePowerHorsepower;

    private String color;
    private int wheels;

    private static int heightInMeters;

    protected String name;
    protected int numberOfSeats;

    public СombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color, int wheels,
                            int heightInMeters, String name, int numberOfSeats) {
        this.volumGrainInKg = volumGrainInKg;
        this.fuelConsumptionPerHectareInLiters = fuelConsumptionPerHectareInLiters;
        this.enginePowerHorsepower = enginePowerHorsepower;
        this.color = color;
        this.wheels = wheels;
        СombineHarvester.heightInMeters = heightInMeters;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }


    public СombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color) {
        this(volumGrainInKg, fuelConsumptionPerHectareInLiters, enginePowerHorsepower, color, 0, 0, null, 0);
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


    @Override
    public String toString() {
        return "СombineHarvester{" +
                "volumGrainInKg=" + volumGrainInKg +
                ", fuelConsumptionPerHectareInLiters=" + fuelConsumptionPerHectareInLiters +
                ", enginePowerHorsepower=" + enginePowerHorsepower +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", name='" + name + '\''  + ", numberOfSeats=" + numberOfSeats + '}';
    }

    public String printHeightInMeters(){
        return "Height = " + heightInMeters;
    }
    public static String printStaticHeightInMeters(){
        return "Static Height = " + heightInMeters;
    }

    public void resetValues(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color, int wheels, int heightInMeters,
                                      String name, int numberOfSeats) {
        this.volumGrainInKg = volumGrainInKg;
        this.fuelConsumptionPerHectareInLiters = fuelConsumptionPerHectareInLiters;
        this.enginePowerHorsepower = enginePowerHorsepower;
        this.color = color;
        this.wheels = wheels;
        СombineHarvester.heightInMeters = heightInMeters;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

}
