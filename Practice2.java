public class Practice2 {
    String model;
    int year;

    // Static method to display information about a car
    static void displayInfo(Practice2 car) {
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
    }
}

class Main {
    public static void main(String[] args) {
        Practice2 car1 = new Practice2();
        Practice2 car2 = new Practice2();

        car1.model = "Toyota Camry";
        car1.year = 2022;

        car2.model = "Honda Accord";
        car2.year = 2021;

        // Calling the static displayInfo method using the class name
        Practice2.displayInfo(car1);
        Practice2.displayInfo(car2);
    }
}

