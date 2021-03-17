package kr.co.bitcamp.nested01;

public class NestedTest {
    
    // 인스턴스 멤버 클래스
    class A {
        int iv = 100;
        // static int cv = 200;        // 인스턴스 멤버 클래스에서는 static멤버변수는 사용 불가.
                                       // NestedTest.A.cv 이렇게 접근이 안됨.
        
        public A() {
            System.out.println("A 생성자 호출");
        }
        
        // 메서드추가
        public void method1() {
            System.out.println("A 클래스의 method1() 호출");
        }
        
       // public static void method2() {}// NestedTest.A.method2() 이렇게 접근이 안됨.
                   
    }
    
    // 정적 멤버 클래스 - 두가지 멤버 변수들이 다 가능
    static class B {
        
       int iv = 100;
       static int cv = 500;     // Nested.B.cv 접근이 가능하기 때문에 선언됨.
       
       // 생성자 찍어보기
       public B() {
           System.out.println("B 생성자 호출");
       }
        
       public void method1() {
           System.out.println("B 클래스의 method1() 호출");
       }
       
       public static void method2() {
           System.out.println("B 클래스의 method2() 호출");
       }
       
        
        
    }
    
    public void method1() { // Nested 클래스의 메서드
        // 로컬클래스 선언과 사용(메서드내에 선언하여, 잠깐 사용할 용도)
        class C {
            int iv = 200;
            //static cv = 700; // method1이 호출 될 때는 이미 객체가 만들어져있어야 하는 상태.
                             // static 멤버선언 불가.
            
            // 생성자만들기
            public C() {
                System.out.println("로컬클래스 C 생성자 호출");
            }
            
            // 인스턴스 메서드 추가
            public void lmethod() {
                System.out.println("로컬클래스 C의  메서드 호출");
            }
            
//            public static void lmethod2() {
//                System.out.println("로컬클래스의 C의 메서드 호출");// static 메서드선언 불가.
//            }
                       
        }
        // 로컬클래스는 해당 메서드 내에서만 사용이 가능하다는 것에 주목하자.
        C c = new C(); // c클래스의 객체 생성
        System.out.println(c.iv);
        c.lmethod();
        
        
    }
    
    public void method2() { // Nested 클래스의 메서드
        // 로컬클래스 선언과 사용(메서드내에 선언하여, 잠깐 사용할 용도)
        class D {
            int iv = 200;
            //static cv = 700; // method1이 호출 될 때는 이미 객체가 만들어져있어야 하는 상태.
                             // static 멤버선언 불가.
            
            // 생성자만들기
            public D() {
                System.out.println("로컬클래스 D 생성자 호출");
            }
            
            // 인스턴스 메서드 추가
            public void lmethod() {
                System.out.println("로컬클래스 D의  메서드 호출");
            }
            
//            public static void lmethod2() {
//                System.out.println("로컬클래스의 D의 메서드 호출");// static 메서드선언 불가.
//            }
                       
        }
        // 로컬클래스는 해당 메서드 내에서만 사용이 가능하다는 것에 주목하자.
        D d = new D(); // c클래스의 객체 생성
        System.out.println(d.iv);
        d.lmethod();
        
        
    }
    
    

    public static void main(String[] args) {
        
        // 인스턴스 멤버클래스 호출
        // 객체생성
        NestedTest nestedTest = new NestedTest();
        NestedTest.A a/*a : 인스턴스 멤버 클래스의 참조변수*/ = nestedTest.new A();  // 인스턴스 멤버 클래스는 외부 클래스의 인스턴스가 반드시 있어야 생성가능.
        System.out.println(a.iv);
        a.method1();
        System.out.println("========================================");
        
        
        // 정적클래스 static 멤버 호출 - 외부클래스의 생성 없이 (인스턴스 없이) 접근 가능함.
        System.out.println(NestedTest.B.cv); // 변수값?출력
        NestedTest.B.method2();// 메서드 호출
        System.out.println("========================================");
        
        NestedTest.B/*타입*/ b/*참조변수 이름*/ = new B();
        System.out.println(b.iv);
        b.method1();
        System.out.println("========================================");
        
        nestedTest.method1();
        
        System.out.println("========================================");

        nestedTest.method2();
        
        // 멤버클래스와 로컬클래스를 구분짓는 기준
        //  => 로컬클래스는 순번이 붙음.


    }    
       

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
