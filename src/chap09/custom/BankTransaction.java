package chap09.custom;

public class BankTransaction {
    public static void main(String[] args) {
        // A, B 계좌 생성
        Account accountA = new Account(30000);
        Account accountB = new Account(0);

        // 송금할 금액
        long amount = 100000;

        try {
            // 송금 상태 변경 (처리중으로 설정)
            updateTransactionStatus("처리중");

            // A 계좌에서 출금
            accountA.withdraw(amount);

            // B 계좌에 입금
            accountB.deposit(amount);

            // 송금 상태 변경 (완료로 설정)
            updateTransactionStatus("완료");
            System.out.println("송금 성공");

        } catch (BalanceInsufficientException e) {
            try {
                // 예외 발생 시 롤백 처리
                accountB.depositRollback(amount);
            } catch (Exception rollbackException) {
                // 롤백 실패 시 처리 (롤백 예외 처리)
                System.out.println("롤백 실패: " + rollbackException.getMessage());
            }
            updateTransactionStatus("취소");
            System.out.println("송금 실패: " + e.getMessage());
        } catch (Exception e) {
            // 기타 예외 처리
            System.out.println("예상치 못한 오류 발생: " + e.getMessage());
        }
    }

    // 송금 상태 변경 메소드
    private static void updateTransactionStatus(String status) {
        System.out.println("송금 상태: " + status);
    }
}
