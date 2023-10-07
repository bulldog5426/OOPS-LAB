import java.util.Scanner;

class Account {
    protected String customerName;
    protected long accountNumber;
    protected String accountType;
    protected double balance;

    public Account(String customerName, long accountNumber, String accountType, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    public void computeInterest() {
        // Subclasses (like SavingsBankAccount) can override this method to compute
        // interest.
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String customerName, long accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current Account", initialBalance);
    }

    @Override
    public void computeInterest() {
        // Current Account does not earn interest.
        System.out.println("No interest is earned on Current Account.");
    }
}

class SavingsBankAccount extends Account {
    private double interestRate;
    private double minimumBalance;

    public SavingsBankAccount(String customerName, long accountNumber, double initialBalance,
            double interestRate, double minimumBalance) {
        super(customerName, accountNumber, "Savings Bank Account", initialBalance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void computeInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " earned.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }

        if (balance < minimumBalance) {
            double penalty = 0.1 * minimumBalance;
            balance -= penalty;
            System.out.println("Service tax of $" + penalty + " imposed due to balance below minimum.");
        }
    }
}

class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter account number:");
        long accountNumber = scanner.nextLong();

        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();

        // Example usage of CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount(customerName, accountNumber, initialBalance);

        System.out.println("Enter deposit amount:");
        double depositAmount = scanner.nextDouble();
        currentAccount.deposit(depositAmount);

        currentAccount.displayBalance();
        currentAccount.computeInterest();

        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = scanner.nextDouble();
        currentAccount.withdraw(withdrawalAmount);

        currentAccount.displayBalance();

        // Example usage of SavingsBankAccount
        System.out.println("Enter savings account interest rate:");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter minimum balance for savings account:");
        double minimumBalance = scanner.nextDouble();

        SavingsBankAccount savingsAccount = new SavingsBankAccount(customerName, accountNumber, initialBalance,
                interestRate, minimumBalance);

        System.out.println("Enter deposit amount for savings account:");
        depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);

        savingsAccount.displayBalance();
        savingsAccount.computeInterest();

        System.out.println("Enter withdrawal amount for savings account:");
        withdrawalAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawalAmount);

        savingsAccount.displayBalance();

        scanner.close();
    }
}
