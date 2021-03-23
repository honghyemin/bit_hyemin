package kr.co.bitcamp.nongeneric1;

public class PersonTest {

    public static void main(String[] args) {
        
        Person person = new Person();
        person.setObject("이순신"); // String -> Object(부모타입) : 자동형변환 = 업캐스팅됨.
        String str = (String)person.getObject(); // 리턴타입은 object이지만 "이순신"이라는 string형이 들어가있으므로 string으로 받아줌
                                                 // Object -> String : 다운캐스팅
        System.out.println(str);
    }

}
