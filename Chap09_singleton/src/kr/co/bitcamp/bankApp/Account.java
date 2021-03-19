package kr.co.bitcamp.bankApp;

public class Account {

    private String ano; // 계좌번호
    private String owner; // 계좌주
    private int balance; // 잔액

    // 오버로드해서 매개변수 있는 생성자 추가
    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;

    }
    // 메서드 추가. 위의 변수가 private이므로 getter/setter이용
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
   
    

}