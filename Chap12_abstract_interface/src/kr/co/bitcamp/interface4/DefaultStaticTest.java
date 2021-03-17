package kr.co.bitcamp.interface4;

public class DefaultStaticTest {

    public static void main(String[] args) {
        
        MyInterface myInterface = new DefaultStaticClass(); // 필드의 다형성이 적용된 상태
        myInterface.dMethod();
        myInterface.method();
        
        // 인터페이스의 정적메서드 호출하는 방법 동일함
        MyInterface.sMethod();

    }

}
