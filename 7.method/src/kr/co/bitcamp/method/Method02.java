package kr.co.bitcamp.method;


public class Method02 {
    public static void main(String[] args) {
        
        int a = 100, b = 200; // 로컬변수는 반드시 선언하고 초기화 해주어야 함.
        plusMethod(a, b); //  2) 반환값 x      |     받는 인자 값 o (내가 넣어서 호출할 수 있음)


    }
    
    public static void/*반환값(리턴값)x*/ plusMethod(int a, int b)/*받는 인자값o(매개변수o)*/ {
        System.out.printf("인자로 넘겨받은 2개의 값은 %d과 %d 입니다.%n", a,b); // 단순출력
        
        int result = a + b;
        System.out.println("두 수를 더한 값: " + result);                 // 연산출력
    }
}
