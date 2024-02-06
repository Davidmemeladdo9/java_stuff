// Define a class named Practice
public class Practice {
    // Data members
    String model;
    int year;

    // Method to display information about the car
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Creating instances (objects) of the Practice class
class Main {
    public static void main(String[] args) {
        // Creating two instances of the Practice class
        Practice car1 = new Practice();
        Practice car2 = new Practice();

        // Setting attributes for car1
        car1.model = "Toyota Camry";
        car1.year = 2022;

        // Setting attributes for car2
        car2.model = "Honda Accord";
        car2.year = 2021;

        // Calling the displayInfo method for each car
        car1.displayInfo();
        car2.displayInfo();
    }
}

