package kr.co.bitcamp.generic2;

public class PersonTest {

    public static void main(String[] args) {
        
        // Person 제네릭클래스에 T에 무조건 String만 들어오게끔 생성함
        Person<String> /*String타입만 들어간다*/ person = new Person<>();
        person.setT("이성계");
        String str = person.getT(); // 리턴타입이 String으로 나오므로 변수로 받아줌
        System.out.println(str);
        
        // 제네릭을 사용함으로 인해 '데이터의 통일화, 타입 변환 제거, 객체 생성 시 다른 타입을 넣게되면 컴파일 예외를 발생시킴(타입 체크)'
        Person<Integer> person2 = new Person<>();
        person2.setT(100);  // 자동 박싱(boxing)이 일어남
        int str2 = person2.getT();  // 자동 언박싱(unboxing)
        System.out.println(str2);
        
        
        Person<Apple> apple = new Person<>();
        apple.setT(new Apple()); // 자동 박싱
        Apple apple2 = apple.getT(); // 형변환 없이 나옴.       
        System.out.println(apple2);

    }

}
