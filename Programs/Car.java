public class Car {

  String brand;
  String model;

  Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  void displayDetails() {
    System.out.println("Car brand: " + brand);
    System.out.println("Car model: " + model);
  }

  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Corolla");
    myCar.displayDetails();
  }
}
