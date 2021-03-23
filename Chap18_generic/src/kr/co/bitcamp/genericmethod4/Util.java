package kr.co.bitcamp.genericmethod4;

public class Util {
    
    // <T>는 제네릭 타입 메서드를 칭하는 것이며, 
    //  리턴 타입과 매개변수 타입을 동일하게 <T>타입으로 지정해야한다.

    // 외부로부터 T타입을 받아서 Person<T>라는 제네릭 클래스의
    // 인스턴스를 생성하여 리턴을 해주는 역할을 한다.
    public static<T> Person<T> changing(T t) { // 호출할 때 역할을 한다.
        
        Person<T> person = new Person<>();
        person.setT(t);
                        
        return person;
    }

}
