package kr.co.bitcamp.nested02;

public class A {

    public A() { // 클래스A의 생성자
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("외부클래스 A의 생성자 호출");
        
        B b = new B(); // 메인(ATest.java)에서는 A객체를 생성후 B의 객체 생성했었음.
                       // 여기서 객체생성 가능한 이유는 인스턴스 멤버클래스(B)는 외부클래스 A의 멤버이기 때문.
        System.out.println(b.a);
        b.method1();
         
        C c = new C();// 여기서 객체생성 가능한 이유는 인스턴스 멤버클래스(C)는 외부클래스 A의 멤버이기 때문. = 멤버에 대한 호출도 가능
        System.out.println(c.a);
        System.out.println(C.c);
        c.method1(); // 객체이름.메서드 (인스턴스멤버)
        C.method2(); // 클래스명.메서드 (정적멤버)

        // 메서드 내부에 들어가있기때문에(선언되어있기 때문에) D는 보이지 않음.
        // D d = new D();
        this.method(); // 자기자신의 메서드
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        
        
    }
    
    
    //인스턴스 멤버 클래스 B
    class B{  
        // 변수생성
        int a = 10;
        // static int cv = 20; - static 추가 안됨
        
        public B(){
            System.out.println("중첩클래스 B의 생성자 호출");
        }
        
        public void method1() {
            System.out.println("중첩클래스 B의 멤버메서드 호출");
        }
        
//        static void method2() {   - static 안돼ㅣㅁ.
//            
//        }
    }
    
    static class C {
        
        int a = 10;
        static int c = 20;
        
        public C() {
            System.out.println("정적멤버클래스 C의 생성자 호출");
        }
        
        public void method1() {
            System.out.println("정적멤버클래스 C의 method1(멤버메서드) 호출");
        }
        
        public static void method2() {
            System.out.println("정적멤버클래스 C의  정적메서드 method2 호출");
            
        }
        }
    
    public void method() {
        
        // 클래스 추가
        // 로컬클래스 정의에 있어서 static 넣을 수 없음. - 언제 불릴지 모르기 때문?
        class D {
            int a = 1000;
            
            public D() {
                System.out.println("로컬 클래스 D의 생성자 호출");
            }
            
            public void lmethod() {
                System.out.println("로컬 클래스 D의 멤버메서드 lmethod() 호출");
            }
            
        }
        //로컬 클래스 D 는 메서드 내부에서만 생성 및 사용이 가능하다.
        D d = new D();
        d.lmethod();
        
    }

}






















