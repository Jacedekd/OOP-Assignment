public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;
    private boolean isWaterResistant;

    public Smartphone() {
        this.brand = "Unknown Brand";
        this.model = "Unknown Model";
        this.storageCapacity = 0;
        this.price = 0.0;
        this.isWaterResistant = false;
    }

    public Smartphone(String brand, String model, int storageCapacity, double price, boolean isWaterResistant) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Price: " + price + " $");
        System.out.println("Water Resistant: " + isWaterResistant);
    }

    public void installApp(String appName) {
        System.out.println("Installing app: " + appName);
    }
}