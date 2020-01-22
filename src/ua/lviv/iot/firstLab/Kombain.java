package ua.lviv.iot.firstLab;

public class Kombain {

    public static final int Default_NUMBEROFSEATS = 1;

    private double volumZernaInKg;

    private double vitrataPalneInLiters;

    private int speedInKinskiSulu;

    private String colorOfKombain;

    private int wheels;

    protected String name;

    protected int numberOfSeats;

    public static int heightOfKombain;

    public Kombain(double volumZernaInKg, double vitrataPalneInLiters, int speedInKinskiSulu, String colorOfKombain, int wheels,
                   String name, int numberOfSeats) {
        this.volumZernaInKg = volumZernaInKg;
        this.vitrataPalneInLiters = vitrataPalneInLiters;
        this.speedInKinskiSulu = speedInKinskiSulu;
        this.colorOfKombain = colorOfKombain;
        this.wheels = wheels;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

    public Kombain(double volumZernaInKg, double vitrataPalneInLiters, int speedInKinskiSulu, String colorOfKombain, int wheels, String name) {
        this(volumZernaInKg, vitrataPalneInLiters, speedInKinskiSulu, colorOfKombain, wheels, name, Default_NUMBEROFSEATS);
    }

    public Kombain(double volumZernaInKg, double vitrataPalneInLiters, int speedInKinskiSulu, String colorOfKombain) {
        this(volumZernaInKg, vitrataPalneInLiters, speedInKinskiSulu, colorOfKombain, 0, null, Default_NUMBEROFSEATS);
    }

    public Kombain(){

    }

    public double getVolumZernaInKg() {
        return volumZernaInKg;
    }

    public void setVolumZernaInKg(double volumZernaInKg) {
        this.volumZernaInKg = volumZernaInKg;
    }

    public double getVitrataPalneInLiters() {
        return vitrataPalneInLiters;
    }

    public void setVitrataPalneInLiters(double vitrataPalneInLiters) {
        this.vitrataPalneInLiters = vitrataPalneInLiters;
    }

    public int getSpeedInKinskiSulu() {
        return speedInKinskiSulu;
    }

    public void setSpeedInKinskiSulu(int speedInKinskiSulu) {
        this.speedInKinskiSulu = speedInKinskiSulu;
    }

    public String getColorOfKombain() {
        return colorOfKombain;
    }

    public void setColorOfKombain(String colorOfKombain) {
        this.colorOfKombain = colorOfKombain;
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
        return "Kombain{" +
                "volumZernaInKg=" + volumZernaInKg +
                ", vitrataPalneInLiters=" + vitrataPalneInLiters +
                ", speedInKinskiSulu=" + speedInKinskiSulu +
                ", colorOfKombain='" + colorOfKombain + '\'' +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                ", numberOfSeats=" + numberOfSeats + "" +
                heightOfKombain + '}';
    }

    public void resetKombain(double volumZernaInKg, double vitrataPalneInLiters, int speedInKinskiSulu, String colorOfKombain, int wheels,
                            String name, int numberOfSeats, int heightOfKombain) {
        this.volumZernaInKg = volumZernaInKg;
        this.vitrataPalneInLiters = vitrataPalneInLiters;
        this.speedInKinskiSulu = speedInKinskiSulu;
        this.colorOfKombain = colorOfKombain;
        this.wheels = wheels;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.heightOfKombain = heightOfKombain;
    }

}
