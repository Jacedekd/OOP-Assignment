public class Main {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone();
        smartphone1.displayInfo();


        Smartphone smartphone2 = new Smartphone("Apple", "iPhone 15", 256, 999.99, true);
        smartphone2.displayInfo();


        smartphone2.installApp("Instagram");
    }
}