package kr.co.bitcamp.method;

// static 선언이 안되어있는 메서드 사용하는 방법에 대해서 코드로 구현

public class StaticMethod02 {
    public static void main(String[] args) {
        
        // helloWorld();   - 메인메서드(static메서드)는 static메서드만 호출할 수 있기 때문에 에러남.
        
        StaticMethod02 sMethod /*참조변수(객체이름)*/ = new StaticMethod02(); //객체 만들기
        sMethod.helloWorld();   // 객체 생성 후 메서드 호출
        
    }

    public void helloWorld() {      // static이 없는 일반 멤버 메서드, 매개변수 x
        
        //리턴할필요x
        System.out.println("Hello world");
        
    }
}
