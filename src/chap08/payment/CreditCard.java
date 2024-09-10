package chap08.payment;

public class CreditCard implements Payment{
    String cardNumber;

    CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of $" + amount + " using card number: " + cardNumber);
    }
}
