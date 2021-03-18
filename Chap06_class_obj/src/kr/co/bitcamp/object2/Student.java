package kr.co.bitcamp.object2;

public class Student {
    
    // 멤버필드(변수)
    String name;
    int age;
    
    // Object클래스의 toString() 오버라이딩(재정의)
    @Override
    public String toString() {
        
        String str = "이름 : " + this.name +   // this : 자기자신을 가리키는 주소.(클래스의 주소)
                     ", 나이 : " + this.age;   //     ★('new'라는 연산자가 인스턴스를 생성하면 비소로 활성화됨)
        return str;                           // this는 static메서드나 클래스앞에 사용할 수 없다.
                                            // why? this는 만들었을 때 쓸 수 있고 static은 자유롭게 사용가능

    
    } 
    
//    public static String getName() {        // static은 객체생성 유무와 상관없이 메모리가 올라감
//        
//        return this.name;
//    }
    
}
