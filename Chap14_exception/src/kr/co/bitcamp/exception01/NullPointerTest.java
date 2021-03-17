package kr.co.bitcamp.exception01;

public class NullPointerTest {

    public static void main(String[] args) {

        String str = null;
        
        // 객체(인스턴스)가 없는데 인스턴스에 있는 toString()을 어떻게 호출하는가?
//        System.out.println(str.toString()); // 오버라이드해서 번지에 있는 값을 찍어보라는 명령.
        
        // 예외가 있더라도 비정상적 종료가 되지 않고 캐치를 해서 정상적으로 처리 할 수 있게끔.
        // 모든 에러를 catch(Exception 참조변수)가 잡아줌,
        try {
            System.out.println(str.toString());
        }catch(Exception/*타입*/ e/*참조변수*/) {
            System.out.println(e.getMessage()); // 예외에 대한 메세지를 출력해줌. 
        }

    }

}
