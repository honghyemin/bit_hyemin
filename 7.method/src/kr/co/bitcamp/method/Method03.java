package kr.co.bitcamp.method;

// 반환값o | 받는 인자 값(매개변수)x => 메서드 구현 

public class Method03 {
    public static void main(String[] args) {
        
        int result; // 변수 선언과 초기화 동시에
        result = returnMethod();        // returnMethod는 반환값이 있다는 것 = 메서드 호출에 따른 리턴값이 있다.
        
        System.out.println("메서드 호출에 따른 리턴된 값: " + result);

    }
    
    
    //접근지정자
    public static int/*리턴형*/ returnMethod() {
        
        int rValue = 100;  // 지역변수는 반드시 초기화해야함
        rValue *= 100;
        return rValue;
    }

}
