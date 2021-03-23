package kr.co.bitcamp.generic2;

// Person이라는 클래스를 제네릭(generic) 타입으로 설계함.
public class Person <T>/*지금 단계에서 결정된 것은 아니지만 타입이 명시될 수는 있음*/ {
    
    // <T> : - '아직 정해지지 않았다.' 라는 의미
    //       - <T>는 개발코드에서 정해진다.
    //       - static타입은 올 수 없다. (static으로 정의한 것들은 힙이나 스택영역이 아닌 class area에 올라감.
    //                               즉, 어떤 것이 올지도 모르는데 미리 클래스 영역에 올려둘 순 없다.)
    
    
    private T t; // t(인스턴스 변수)타입이 결정되면 T 타입도 결정됨
    
    public Person() {
        
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
    

}
