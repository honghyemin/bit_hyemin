package kr.co.bitcamp.nested02;

public class ATest {

    public static void main(String[] args) {
        
        A a = new A(); // 외부클래스 객체 생성
        
        // 인스턴스 멤버 클래스인 B는 반드시 외부 클래스 A의 인스턴스가 있어야 생성 가능함.
        A.B b = a.new B(); // 인스터스 멤버 클래스 객체 생성
        b.method1();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        // 정적멤버클래스인 C는 외부클래스 A의 인스턴스가 있든없든 상관없이 접근 가능함.
        System.out.println(A.C.c);
        A.C.method2();
        
                
        A.C c/*참조변수 이름*/ = new A.C();
        System.out.println(c.a);
        c.method1();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        // 외부클래스의 인스턴스를 생성하면 얼마든지 메서드를 호출하여 
        // 로컬클래스를 생성하여 사용할 수 있다.
        a.method(); // 로컬클래스가 들어간 메서드 호출


    }

}
