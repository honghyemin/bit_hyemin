package kr.co.bitcamp.interface4;

// abstract
// static final
// default
// static

public interface MyInterface {
    
    int MAX_NUM = 100; // static final 상수
    
    public void method();   // 추상메서드 선언(본질적인 것), 반드시 오버라이드를 해야함
    
    // JDK1.8부터 추가된 멤버
    default void dMethod() {
        System.out.println("My Interface의 디폴트 메서드 호출"); // 반드시 오버라이드를 안해도 되며 필요할 때만 사용 가능
    }
    
    static void sMethod() {
        System.out.println("MY Interface의 정적 메서드 호출"); // 반드시 오버라이드를 안해도 되며 필요할 때만 사용 가능
    }

}
