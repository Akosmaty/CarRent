package kos.maty;

public class Car implements  expedient {
    public  String brand;
    public String engine;
    public String color;
    public  String outData;


    public Car(String brand, String engine, String color) {
        this.brand = brand;
        this.engine = engine;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getOutData(){
        outData = getBrand() + getEngine() + getColor();
        return outData;
    }

}



