package chap08.payment;

public class Paypal implements Payment{
    String email;

    Paypal(String email){
        this.email = email;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of $" + amount + " using email: "+email);
    }
}
