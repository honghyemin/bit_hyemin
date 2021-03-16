package kr.co.bitcamp.method;

// 메서드 정의와 기본적인 자바의 메서드 작성.

// 클래스명.StaticMethod명();
// 자기 자신이 갖고있는 멤버는 호출 가능.

public class StaticMethod01 {
    public static void main(String[] args) {
        
        helloWorld();  // 메서드 호출
        // 갖고있는 것이기 때문에 호출 가능. // 정의한 메서드에 대해 호출 해주어야 함.
        
        
    }
    
    public static void helloWorld()  {//메서드는 소문자로 시작(클래스는 대문자로)
        
        System.out.println("Hello, World!");
        
    }
}
