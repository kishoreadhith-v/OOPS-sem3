package exp6;

public class Bank {
    static class Customer{
        String first_name;
        String last_name;

        Customer(String first_name, String last_name){
            this.first_name = first_name;
            this.last_name = last_name;
        }

        void display(){
            System.out.println("First name: " + first_name);
            System.out.println("Last name: " + last_name);
        }
    }

    static class Account{
        Customer holder;
        float balance;

        Account(Customer holder, float balance){
            this.holder = holder;
            this.balance = balance;
        }

        void display(){
            holder.display();
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Customer cust = new Customer("Coyote", "Stark");
        Account acc1 = new Account(cust, 100000);
        Account acc2 = new Account(cust, 200000);
        acc1.display();
        acc2.display();
        
    }
}
