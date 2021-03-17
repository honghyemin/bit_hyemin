package kr.co.bitcamp.exception04;

// 사용자 정의 예외 클래스
public class BalanceException extends Exception{

    public BalanceException() {
        
    }
    
    public BalanceException(String message) { // 문자형으로 오버로드된 생성자
        super(message);
    }
}
