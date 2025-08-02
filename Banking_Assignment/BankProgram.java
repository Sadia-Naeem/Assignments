import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
public class BankProgram {
    private HashMap<Integer, Integer> accounts = new HashMap<>();
    
    private double rate = 0.01;
    private int nextAccount = 500;
    private int current = -1;
    private Scanner scanner;
    private boolean done = false;

    public static void main(String args[]) {
        BankProgram program = new BankProgram();
        program.run();
    }
    public void run() {
        scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank Program! Please enter your commands.");
        while (!done) {
            System.out.println("Enter command (0=Quit, 1= New Account, 2= Check Balance, 3= Deposit, 4=Loan, 5= Show all accounts, 6= Interest) : ");
            int command = scanner.nextInt();
            processCommand(command);
        }
        scanner.close();
      }
      private void processCommand(int command) {
        if (command == 0) quit();
        else if (command == 1) newAccount();
        else if (command == 2) select();
        else if (command == 3) deposit();
        else if (command == 4) Authorizeloan();
        else if (command == 5) showAll();
        else if (command == 6) addInterest();

        else System.out.println("Invalid command");

    }
    //for 0 which starts quit method 
    private void quit() {
        done = true;
        System.out.println("Goodbye!");
    }
    // for 1 which starts newAccount method
    private void newAccount() {
        current = nextAccount++;
        accounts.put(current, 0);
        System.out.println("Your new account number is" + " " + current);
   }
    // for 2 which starts select method
    private void select() {
        System.out.println("Enter account number: ");
        current = scanner.nextInt();
        int balance = accounts.get(current);
        System.out.println("The balance for account  " + current + " is  " + balance);
    }
    // for 3 which starts deposit method
    private void deposit() {
        System.out.println("Enter account number for deposit: ");
        int accountNum = scanner.nextInt();
        // if account number does not exist take input again
        if (!accounts.containsKey(accountNum)) {
            System.out.println("Account number does not exist.Please re-enter account number.");
            accountNum = scanner.nextInt();
        }
        else {
        current = accountNum;
       }
        System.out.println("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        int balance = accounts.get(current);
        accounts.put(current, balance + amount); //adding amount to the current balance
         System.out.println("The new balance for account " + current + " is " + accounts.get(current));
    }
    // for 4 which starts Authorizeloan method
    private void Authorizeloan() {
        System.out.println("Enter account number for loan: ");
        int accountNum = scanner.nextInt();
        if (!accounts.containsKey(accountNum)) {
            System.out.println("Account number does not exist. Please re-enter account number.");
            accountNum = scanner.nextInt();
    }
        else {
            current = accountNum;
        }
        System.out.println("Enter amount for loan: ");
        int loanamount = scanner.nextInt(); 
        int balance = accounts.get(current);
        if (balance >= loanamount/2) {
            System.out.println("Loan is approved");
            accounts.put(accountNum, balance + loanamount);
            System.out.println("The new balance for account " + current + " is " + accounts.get(current));
        }
        else {
            System.out.println("Loan is not approved");
        }    
    }

    // for 5 which starts showAll method that shows all accounts and their balances
    private void showAll() {
         Set<Integer> accountNumbers = accounts.keySet();
         System.out.println("The bank has " + accountNumbers.size() + " accounts:");

         for (int i : accountNumbers) {
             System.out.println("\tBank account " + i + " has balance = " + " " + accounts.get(i)); 
        }  
    }
    
    // for 6 which starts addInterest method that adds interest to all accounts
    private void addInterest() {
        Set<Integer> accountNumbers = accounts.keySet();
        for (int i : accountNumbers) {
            int balance = accounts.get(i);
            int newBalance = (int) (balance * (1 + rate));
            accounts.put(i, newBalance);
        }
         System.out.println("Interest added to all accounts at a rate of " + (rate * 100) + "%.");
         showAll();
    }
}