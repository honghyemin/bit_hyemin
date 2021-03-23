package kr.co.bitcamp.genericmethod4;

public class MemberTest {
    
    // MemberTest 클래스의 '인스턴스 메서드'
    // boxing이라는 메서드는 결과적으로 member를 리턴한 것임.
    // = 제네릭 클래스인 Member를 리턴함.
    public <T> Member<T> boxing(T t) {
                        
        Member<T> member = new Member<>();
        member.setT(t);  
        return member;
    }
    
    // MemberTest 클래스의 'static(정적, 클래스) 메서드'
    public static<T> Member<T> wrapping(T t) {
        
        Member<T> member = new Member<>();
        member.setT(t);  
        return member;        
    }
    

    public static void main(String[] args) {
        
        MemberTest memberTest = new MemberTest();
        // Member<Integer> member = memberTest.<Integer>boxing(100);
        Member<Integer> member = memberTest.boxing(100); // 원래는 번지가 들어가야 하는데 값을 넣어줌 = auto boxing
        System.out.println("Member 클래스의 값 : " + member.getT());
               
        //Member<String> member2 = MemberTest.<String>wrapping("이순신");
        Member<String> member2 = wrapping("이순신");
        System.out.println("Member 클래스의 값 : " + member2.getT());
    }

}












