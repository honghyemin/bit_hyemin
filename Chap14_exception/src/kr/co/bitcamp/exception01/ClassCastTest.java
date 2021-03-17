package kr.co.bitcamp.exception01;

class A {}
class B extends A {}
class C extends A {}

interface I {}
class D implements I{}
class E implements I{}


public class ClassCastTest {

    public static void main(String[] args) {
        
        A a = new B(); // B가 A타입으로 업캐스팅, 자동형변환
        B b = (B)a; // 부모타입인 a를 자식타입 B로 다운캐스팅함.
        System.out.println("실행완료");
        
        A a1 = new C();
        C c = (C)a1;
        System.out.println("실행완료");
        
        I i = new D(); // 다형성 적용 - 업캐스팅
        D d = (D)i;
        System.out.println("실행완료");
        
        I i2 = new E();
        E e = (E)i2;
        System.out.println("실행완료");

        

        

    }

}
