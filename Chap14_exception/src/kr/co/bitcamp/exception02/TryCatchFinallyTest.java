package kr.co.bitcamp.exception02;

public class TryCatchFinallyTest { // 예외가 발생하든지 안하든지 실행됨.

    public static void main(String[] args) {
        
        // Class 클래스 : 문자열을 가지고 해당되는 문자열을 클래스로 만들어서 변환을 시켜줌. (동적개체)
        //              인스턴스의 정보만 리턴하고 실제 멤버를 사용하는 것은 안됨.
        
        try {
           Class class1 = Class.forName("kr.co.bitcamp.exception02.TryCatchFinallyTest"); // class1이라는 참조변수를 가지고 인스턴스 정보를 리턴.(멤버 사용은 못함)
           System.out.println("클래스를 찾았습니다.");
           
           System.out.println(class1.getName());    // 패키지명 + 클래스명
           System.out.println(class1.getSimpleName()); // 패키지는 제외하고 클래스명만 출력
        
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 없습니다.");
            e.printStackTrace();
        } finally/*옵션_꼭 실행이 되어야 하는게 있다면 넣어줌*/ {
            System.out.println("프로그램을 안전하게 종료합니다.");
        }
        
        
        

    }

}
