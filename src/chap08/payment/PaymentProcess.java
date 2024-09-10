package chap08.payment;

public class PaymentProcess {
    public static void main(String[] args) {
        Payment creditCard = new CreditCard("1234-5678");
        creditCard.processPayment(20000);

        Payment paypal = new Paypal("email@naver.com");
        paypal.processPayment(30000);
    }
}
