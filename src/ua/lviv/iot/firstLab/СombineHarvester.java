package ua.lviv.iot.firstLab;

public class СombineHarvester {

    private double volumGrainInKg;
    private double fuelConsumptionPerHectareInLiters;
    private int enginePowerHorsepower;

    private String color;
    private int wheels;

    protected String name;
    protected int numberOfSeats;

    private static int heightInMeters;



    public СombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color, int wheels,
                            String name, int numberOfSeats, int heightInMeters) {
        this.volumGrainInKg = volumGrainInKg;
        this.fuelConsumptionPerHectareInLiters = fuelConsumptionPerHectareInLiters;
        this.enginePowerHorsepower = enginePowerHorsepower;
        this.color = color;
        this.wheels = wheels;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        СombineHarvester.heightInMeters = heightInMeters;
    }


    public СombineHarvester(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color) {
        this(volumGrainInKg, fuelConsumptionPerHectareInLiters, enginePowerHorsepower, color, 0, null, 0, 0);
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

    public String printHeightInMeters(){
        return "Height = " + heightInMeters;
    }
    public static String printStaticHeightInMeters(){
        return "Static Height = " + heightInMeters;
    }


    @Override
    public String toString() {
        return "СombineHarvester{" +
                "volumGrainInKg=" + volumGrainInKg +
                ", fuelConsumptionPerHectareInLiters=" + fuelConsumptionPerHectareInLiters +
                ", enginePowerHorsepower=" + enginePowerHorsepower +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", name='" + name + '\''  + ", numberOfSeats=" + numberOfSeats + ", Height=" +
                heightInMeters + '}';
    }

    public void resetValues(double volumGrainInKg, double fuelConsumptionPerHectareInLiters, int enginePowerHorsepower, String color, int wheels,
                                      String name, int numberOfSeats, int heightInMeters) {
        this.volumGrainInKg = volumGrainInKg;
        this.fuelConsumptionPerHectareInLiters = fuelConsumptionPerHectareInLiters;
        this.enginePowerHorsepower = enginePowerHorsepower;
        this.color = color;
        this.wheels = wheels;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        СombineHarvester.heightInMeters = heightInMeters;
    }

}
