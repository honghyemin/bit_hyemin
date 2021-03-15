package kr.co.bitcamp.method;

// Call by value 메서드 호출을 Call by reference 방식으로 바꿔서 코드 구현
// a 값이 같은 결과가 나오도록 코드 수정

class CallbyReference {
    int num; // 멤버변수
    
    public CallbyReference(int num) {
        this.num = num;
    }
    
}
 // 주소값(참조번지)을 공유한 것이므로 값이 같음.

public class MethodCall03 {
    public static void main(String[] args) {
       
        CallbyReference a = new CallbyReference(100);   // 객체 변수 선언
        sum(a);                                         // sum 호출
        
        System.out.println("main() 메서드 안에서의 a값 : " + a); // a값을 출력해보면 주소가 들어있음
        System.out.println(a.num);
    }                                                               
    
    public static void sum(CallbyReference a) {          // 참조번지이므로 주소값이 출력됨. int일경우가 값 출력
        
        a.num += 400;
        System.out.println("sum() 메서드 안에서의 a값 : " + a);   // a값을 출력해보면 주소가 들어있음      
        System.out.println(a.num);                           // 
        
    }

}
