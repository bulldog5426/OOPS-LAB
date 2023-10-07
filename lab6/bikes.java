import java.util.Scanner;

class Bike {
    int speedlimit = 60;

    void run() {
        System.out.println("Running safely with " + speedlimit + "km...");
    }
}

class Splendar extends Bike {
    int speedlimit = 80;

    void run() {
        System.out.println("Running safely with " + speedlimit + "km...");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bike type (bike or splendar): ");
        String bikeType = scanner.next();

        Bike bike;
        switch (bikeType) {
            case "bike":
                bike = new Bike();
                break;
            case "splendar":
                bike = new Splendar();
                break;
            default:
                System.out.println("Invalid bike type");
                return;
        }

        bike.run();
        System.out.println("Speed limit for " + bikeType + " is " + bike.speedlimit + "km...");
    }
}
