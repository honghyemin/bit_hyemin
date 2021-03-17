package kr.co.bitcamp.string02;

public class IndexOfTest {

    public static void main(String[] args) {
       String str = "오늘은 자바 하기가 좋네요";
       int index = str.indexOf("공부");   // indexOf() 메서드는 찾기 기능을 할 때 자주 사용함.
       System.out.println("'공부' 문자열의 위치 : " + index);
       
       // '공부'라는 문자열이 포함되어 있다면
       if(str.indexOf("공부") != -1) {
           System.out.println("공부와 관련된 내용입니다.");
       } else {
           System.out.println("공부와 관련 없는 내용입니다.");
       }
        

    }

}
