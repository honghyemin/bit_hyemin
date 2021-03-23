package kr.co.bitcamp.unsynchronized;

public class UserA extends Thread{
    
    // 공유객체 선언 
    private Calculator calculator; // 멤버로 추가
    
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("UserA"); // 스레드 이름 지정
    }
    
    @Override
    public void run() {
        
        // 공유 객체의 필드인 memory 값에 100으로 설정
        this.calculator.setMemory(100);
        System.out.println("UserA스레드가 출력한 값 : " + this.calculator.getMemory());
        
    }
   

}
