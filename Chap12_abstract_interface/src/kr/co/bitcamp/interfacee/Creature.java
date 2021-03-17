package kr.co.bitcamp.interfacee;

// 인터페이스의 본질은 추상메서드임.
public interface Creature {
    
    // 구현 x
    public void method();   // abstract 생략 가능. 컴파일 시에 컴파일러가 add해줌.
    int MAX = 10;           // static final이 생략된 채로 선언됨. 생략 가능. 컴파일시 add해줌
                            //  -> 부수적 멤버 개념.
    
    
    
}
