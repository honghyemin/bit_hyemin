package day0219;
// String 클래스에 대한 인트로

// String 클래스는 여러개의 글자를 저장하고
// 그 글자들을 다루는 여러가지 메소드가 정의되어 있는 클래스.

// 메소드란 해당 클래스에 선언/정의 되어있는 기능들이다.
// 클래스마다 기능들이 다 다름.


public class Ex12StringIntro {
    public static void main(String[]args) {
        // String 클래스 변수의 선언
        // String 클래스 변수는 다른 기본형 데이터타입 변수처럼 선언해주면 된다.
        
        String str;
        
        // String 클래스 변수의 초기화는 크게 2가지 방법이 있다.
        // 1. String() 를 사용하는 방법
        //    초기화할 때 new 뒤에 String()라는 메소드를 붙여줄 수 있는데
        //    이 때 괄호안의 값으로 String 클래스 변수의 값이 초기화가 된다.
        
        // A. 아무것도 없는 내용으로 초기화 할 때
        str = new String();
        System.out.println("str의 내용: ");
        System.out.println(str);
        
        // B. 특정 글자가 있는 String 값을 넣어서 초기화할때
        str = new String("abcDEF");
        System.out.println("str의 내용: ");
        System.out.println(str);
        
        // 2. String 값을 즉석에서 만들어서 그 값으로 초기화해주기
        
        // A. 아무것도 없는 내용으로 초기화할때
        str = "";
        System.out.println("str의 내용: ");
        System.out.println(str);
        
        // B. ""안에 글자들을 넣어서 곧장 넣어주기
        str = "가나다라마";
        System.out.println("str의 내용: ");
        System.out.println(str);
        
        // 1번과 2번 중에서 어떤 걸 사용해야 하나요?
        // 1번이 좀 더 원론적으로 클래스변수를 선언하는 방법이기 때문에 
        // 1번을 사용하는게 좋다.
        
   
        
    
}
}
