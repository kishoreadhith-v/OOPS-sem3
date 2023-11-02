abstract class Accounts {
    double balance;
    int id;
    String name;
    String address;
    
    abstract double withdraw(double amount);
    abstract double deposit(double amount);
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double withdraw(double amount){
        if(this.balance < amount){
            System.out.println("Insufficient Balance");
            return balance;
        }
        else{
            this.balance -= amount;
            return balance;
        }
    }
    double deposit(double amount) {
        balance += amount;
        return 0;
    }

    float rateOfInterest;
    SavingsAccount(int id, String name, String address, double balance, float rateOfInterest){
        this.id = id;
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
    }

    double calculateInterest(int time){
        return balance * rateOfInterest * time;
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(123, "Joseph Joestar", "123 Main St", 0, 0.0f);
        savings.deposit(1000);
        savings.display();
        savings.withdraw(500);
        savings.display();
    }
}
