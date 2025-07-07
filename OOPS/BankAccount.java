import java.util.List;

public class BankAccount {
    //private fiend(encapsulation )
    private String accoundNumber;
    private double balance;
    private List<String> transactionHistory;


    public BankAccount(String accountNumber, double initialBalance){
        this.accoundNumber = accountNumber;
        this.balance = initialBalance;
        addTransation("account opend with balance:" + initialBalance);
    }

    public String getAccountNumber(){
        return accoundNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            addTransation("Deposited:" + amount);
        }else{
            System.out.println("invalid deposit amount!");
        }
    }

    private void addTransation(String message){
        transactionHistory.add(java.time.LocalDateTime.now() + ":" + message);
    }

    public void showTransationHistory(){
        System.out.println("\n transaction history:");
        transactionHistory.forEach(System.out::println);
    }
    
}
