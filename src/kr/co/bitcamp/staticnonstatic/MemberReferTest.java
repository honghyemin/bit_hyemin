package kr.co.bitcamp.staticnonstatic;

// 멤버들간의 참조여부 확인

public class MemberReferTest {

    int iv;         // 인스턴스(객체) 멤버변수
    static int cv;  // 정적(클래스) 멤버

    // 인스턴스 메서드
    //  - 클래스메서드 호출 가능.
    //     -> why? 인스턴스 메서드가 호출 될 때는 이미 인스턴스가 생성되어 있을 것임.
    public void instanceMethod() {
        System.out.println(this.iv);        // 인스턴스 변수 사용 가능
        System.out.println(cv);             // 정적멤버 변수 사용 가능(원래는 MemberReferTest.cv로 호출해야하나 같은 클래스 내라서 생략 가능)
        staticMethod();                     // 정적멤버 메서드 사용 가능
        
    }
    // 클래스 메서드
    //  - 인스턴스 메서드 호출 불가.
    //      -> 인스턴스가 언제 생성될지 아무도 모르기 때문에 정적 메서드 내에서는 인스턴스 멤버들을 절대 사용x
    public static void staticMethod() {
        //System.out.println(this.iv);      // 인스턴스 변수 사용 불가능
          System.out.println(cv);           // 정적멤버 변수 사용 가능
        //this.instance();                  // 인스턴스 멤버 메서드 사용 불가능
        
    }
    
}
