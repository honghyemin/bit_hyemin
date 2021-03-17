package kr.co.bitcamp.exception04;

public class Account {
    
    private long balance; // 계좌의 잔액
    
    public Account() {
        
    }
    
    // 계좌의 현재 잔액을 가져오기.
    public long getBalance() {
        return this.balance;    
    }
    
    // 입금기능추가
    public void deposite(int money) {
        this.balance += money;
    }
    
    // 출금기능추가
    public void withdraw(int money) throws BalanceException{ // 출금할 때 예외가 발생하면 BalanceException으로 던짐
        if(this.balance < money) { // 계좌의 잔액보다 출금하려는 돈이 많을 때 강제로 예외를 발생시킴(throw사용)
            throw new BalanceException("잔액 부족"); // -> 인위적인 예외 발생
        }
        
            this.balance -= money;
        
    }

}
