import java.util.Scanner;

// Base class Bank
class Bank {
    // Method to get the rate of interest
    double getRateOfInterest() {
        return 0.0;
    }
}

// Subclass SBI
class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.0;
    }
}

// Subclass ICICI
class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

// Subclass AXIS
class AXIS extends Bank {
    @Override
    double getRateOfInterest() {
        return 9.0;
    }
}

class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the bank (SBI/ICICI/AXIS): ");
        String bankType = scanner.next().toUpperCase();

        Bank bank;
        switch (bankType) {
            case "SBI":
                bank = new SBI();
                break;
            case "ICICI":
                bank = new ICICI();
                break;
            case "AXIS":
                bank = new AXIS();
                break;
            default:
                System.out.println("Invalid bank type. Please enter SBI, ICICI, or AXIS.");
                scanner.close();
                return;
        }

        double rateOfInterest = bank.getRateOfInterest();
        double interest = (principal * rateOfInterest) / 100.0;

        System.out.println("Bank: " + bankType);
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Interest Amount: " + interest);

        scanner.close();
    }
}
