import java.util.Scanner;

public class Main {
    static final int MAX_ACCOUNTS = 100;
    String[] accountNumbers;
    String[] accountHolders;
    double[] accountBalance;
    int numberOFAccounts;

    public Main() {
        accountHolders = new String[MAX_ACCOUNTS];
        accountNumbers = new String[MAX_ACCOUNTS];
        accountBalance = new double[MAX_ACCOUNTS];
        numberOFAccounts = 0;
    }

    public void createAccount(String name) {
        if (numberOFAccounts < MAX_ACCOUNTS) {
            String accountNumber = generateAccountNumber();
            accountNumbers[numberOFAccounts] = accountNumber;
            accountHolders[numberOFAccounts] = name;
            accountBalance[numberOFAccounts] = 0.0;
            numberOFAccounts++;
            System.out.println("Account Created Successfully.");
            System.out.println("Your account number: " + accountNumber);
        }else{
            System.out.println("Maximum number of accounts reached");
        }
    }

    public String generateAccountNumber() {
        return "ACC" + (1000 + numberOFAccounts);
    }

    public void depositFunds(String accountNumber,double amount){
        int accountIndex = findAccountIndex(accountNumber);

        if(accountIndex !=-1){
            accountBalance[accountIndex] += amount;
            System.out.println("Deposit successful. Current Balance: " + accountBalance[accountIndex]);
        }else{
            System.out.println("Invalid account number!");
        }
    }

   public int findAccountIndex(String accountNumber){
        for(int i=0;i<numberOFAccounts;i++){
            if(accountNumbers[i].equals(accountNumber)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        while(true) {
            System.out.println("Welcome to our bank");
            System.out.println("1. Create account");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount"); // odev
            System.out.println("4. Checkout balance"); // odev
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    String name = scanner.next();
                    main.createAccount(name);
                    break;
                case 2:
                    System.out.println("Enter your account number: ");
                    String accountNumber = scanner.next();
                    System.out.println("Enter the amount to deposit: ");
                    double amount = scanner.nextDouble();
                    main.depositFunds(accountNumber,amount);
                    break;
                case 5:
                    System.out.println("Exiting the banking system.");
                    System.exit(0);
            }
        }
    }

}