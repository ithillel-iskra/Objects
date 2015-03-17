package dev;

/**
 * Created by IT School on 06.03.2015.
 */
public class Account {
    Money balance;
    Client client;
    boolean blocked;
    int pinCode;

    Account(Client client, String currency) {
        if (currency == null || client == null) {
            System.out.println("Block");
            blocked = true;
        } else {
            balance = new Money(currency, 0);
            this.client = client;
        }
    }

    void changePin(int pinCode) {
        this.pinCode = pinCode;                 //if else
    }

    void block(boolean blocked) {
        if(blocked == false)
            this.blocked = true;
    }
    void unBlock(boolean blocked){
        if(blocked == true)
            this.blocked = false;
    }
    void withDraw(int sum){
        if (sum <=0){
            System.out.println();
            return;
        }
        if(balance.getSum()< sum){
            System.out.println();
            return;
        }
        balance.withdraw(sum);// method in Money;
    }
}
