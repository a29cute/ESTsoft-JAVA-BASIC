package chap09.custom;

/**
 * 은행계좌 클래스
 * - 잔액 속성 (balance)
 * - 생성자
 * - 입금 기능
 * - 출금 기능 : 인출 money보다 잔액이 부족할경우 수동 예외 발생
 */
public class Account {
    private long balance;

    // 생성자
    public Account(long balance) {
        this.balance = balance;
    }

    // 입금 메소드
    public void deposit(long money) {
        this.balance += money;
    }

    // 출금 메소드
    public void withdraw(long money) throws BalanceInsufficientException {
        if (balance < money) {  // 출금 불가!
            throw new BalanceInsufficientException("잔액이 부족합니다. 남은 금액: " + balance);
        }
        balance -= money;
    }

    // 롤백 메소드
    public void depositRollback(long money) throws Exception {
        // 롤백 시 예외가 발생할 수 있는 경우를 대비하여 throws Exception을 선언합니다.
        if (money < 0) {
            throw new Exception("잘못된 롤백 금액입니다.");
        }
        this.balance -= money;
    }

    // 잔액 조회 메소드
    public long getBalance() {
        return balance;
    }
}
