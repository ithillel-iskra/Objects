package dev;

/**
 * Created by IT School on 06.03.2015.
 */
public class Money {
    String currency;
    int sum;
    Money(String currency,int sum){
        if(currency==null)
            System.out.println("block");// as in Account;
            else{
            this.sum = sum;
            this.currency = currency;
        }

    }

    public int getSum() {
        return sum;
    }
    //public withDraw(int sum){
      //  this.sum =                  //???

    //}
}
