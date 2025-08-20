import java.util.Scanner;

abstract class Vehicle {
    String brand;
    public Vehicle(String b) {
        brand = b;
    }
    public abstract void start();
    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private String model;
    private int year;

    public Car(String b, String m, int y) {
        super(b);
        model = m;
        year = y;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("Car " + model + " is starting....");
    }
}

class ElectricCar extends Car {
    private int battery;

    public ElectricCar(String b, String m, int y, int bt) {
        super(b, m, y);
        battery = bt;
    }

    public void start() {
        System.out.println("Electric car " + getModel() + " is starting silently...");
    }

    public void showBattery() {
        System.out.println("Battery Capacity: " + battery + " kWh");
    }
}

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand1 = sc.nextLine();
        String model1 = sc.nextLine();
        int year1 = sc.nextInt();
        sc.nextLine();
        Car car = new Car(brand1, model1, year1);
        car.showBrand();
        car.start();
        System.out.println("Model: " + car.getModel() + ", Year: " + car.getYear());

        String brand2 = sc.nextLine();
        String model2 = sc.nextLine();
        int year2 = sc.nextInt();
        int battery = sc.nextInt();
        ElectricCar ec = new ElectricCar(brand2, model2, year2, battery);
        ec.showBrand();
        ec.start();
        ec.showBattery();

    }
}
