package innerclasses;

public class BankAccount {
    private double balance = 10000;
    class Transaction {
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("withdrawn:" + amount);
            } else {
                System.out.println("insufficient funds");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Transaction tx = acc.new Transaction();   //syntax-Outer.Inner in_object = out_object.new Inerr();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(acc.balance);
    }
}
/*
 - Transcation belongs to specify account
 - direct access to private variable balance
 - clean encapsulation
 */
