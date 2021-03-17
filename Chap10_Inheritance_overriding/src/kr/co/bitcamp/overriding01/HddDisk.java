package kr.co.bitcamp.overriding01;

// 조상클래스
public class HddDisk /*extends Object*/ { // object를 상속

    // 멤버변수
    int capacity; // 용량
    int rpm; // 속도

    // 생성자
    public HddDisk() { // 기본생성자 만들어짐 | source -> Generate constructor Using Field...
        // super(); 생략가능

    }
    // 매개변수가 있는 생성자 = 오버로드 
    public HddDisk(int capacity, int rpm) {        
        this.capacity = capacity;
        this.rpm = rpm;
    }

    public HddDisk(int capacity) {
        this.capacity = capacity;
    }
    
    // 사용자정의 메서드
    public String status() {
       
        String str = "하드디스크 용량 : " + this.capacity + "\n" + 
                    "하드디스크 속도 : " +this.rpm + "(rpm)";
        return str;
        
    }
    
    

}
