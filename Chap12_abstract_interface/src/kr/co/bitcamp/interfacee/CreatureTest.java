package kr.co.bitcamp.interfacee;

public class CreatureTest {

    public static void main(String[] args) {
        
        Member member = new Member();
        member.method();
        member.method1();
        
        // 인터페이스도 일종의 조상이다
        // 그래서 다형성 개념이 적용된다
        
        Creature creature = new Member(); // 인터페이스 필드의 다형성도 적용이 됨.
        creature.method();  // 조상클래스의 메서드만 가져올 수 있음. (Member클래스만의 메서드는 호출 불가)
        // creature.method1(); -> 불가능
        
        System.out.println();

        Person person = new Person();
        person.method();
        person.method2();
        
        creature = new Person();
        creature.method();
        
        System.out.println(Creature.MAX);
        
        
    }
    

}












