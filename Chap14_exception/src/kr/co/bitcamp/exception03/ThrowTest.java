package kr.co.bitcamp.exception03;

public class ThrowTest {

    public static void main(String[] args) {
        
        try {
            // 강제로 예외를 발생 시키는 키워드가 throw이다.
            throw new Exception("고의로 예외 발생시킴");
        } catch (Exception e) {
            System.out.println(e.getMessage());// 어떤 예외가 있는지 예외 메세지 출력
        }
        
        System.out.println("예외처리가 되었으므로 정상종료");
        

    }

}
