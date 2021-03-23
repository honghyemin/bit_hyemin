package kr.co.bitcamp.genericmethod4;

public class PersonTest {

    public static void main(String[] args) {

        // 메서드를 호출하려고 함.
        // Person<Integer> p1 = Util.<Integer>changing(300); - 정상적인 호출 코드
                // ㄴ> util클래스에서 static으로 선언했기때문에 new로 객체생성 하지 않아도 됨.

        Person<Integer> p1 = Util.changing(300); // Integer(타입)생략가능 , (auto boxing)
        int value = p1.getT();
        System.out.println("Person 객체가 가지고 있는 값 : " + value);

        //Person<String> p2 = Util.<String>changing("이순신");
        Person<String> p2 = Util.changing("이순신"); // String 생략 가능
        String str = p2.getT();
        System.out.println("Person 객체가 가지고 있는 값 : " + str);


    }

}
