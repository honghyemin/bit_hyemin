package kr.co.bitcamp.exception04;

public class AccountTest {

    public static void main(String[] args) {
        
        Account account = new Account();
        account.deposite(50000);
        System.out.println("현재 잔액 : " + account.getBalance() + "원");
        
        try {
            // withdaw()에서 예외를 던지고 있으니 이를 호출하는 곳에서는 
            // 예외처리코드가 반드시 들어가야함.
            
            account.withdraw(10000);
            System.out.println("현재 잔액 : " + account.getBalance() + "원");
            
            account.withdraw(50000);
            System.out.println("현재 잔액 : " + account.getBalance() + "원");
            
        } catch (BalanceException e) {
            System.out.println("예외 원인 : " + e.getMessage());
           // e.printStackTrace();
        } finally {
            System.out.println("정상 종료 합니다.");
        }

    }

}
