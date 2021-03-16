package kr.co.bitcamp.sington;

public class User {
    
    // 1) 해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성함.
    private static User/*리턴타입 자기자신*/ singleton = new User(); // 기본생성자이므로 new User();사용가능
    
    // 2) 해당 클래스를 외부에서 new 연산자로 인스턴스를 생성 못하게 막음.
    private User() {
        
    }
    
    // 3) 해당 클래스 멤버의 주소를 넘겨주기(공유) 위해서 외부에서 호출할 수 있는 getter()메서드를 제공. 
    public static/*바로 사용할 수 있도록 static으로 정의*/ User getInstance() {
        
        return User.singleton; // 번지가 리턴이 됨.
    }
    
}
