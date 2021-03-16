package kr.co.bitcamp.constructor;

class A {
    int value;
    
}

class B {
    int value;
    
//    public B() {
//        
//    }
    
    public B(int value) {
        this.value = value;
    }
}

public class ConstructorTest {

    public static void main(String[] args) {
        
        A a = new A();
        
        // 컴파일 예외 해결 방법
        // 1) B 클래스에 기본생성자를 추가
        // 2) B 클래스 생성자 호출시 매개변수 값으로 int값을 지정해줌
        
        B b = new B(30);
        
    }

}
