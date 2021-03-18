package kr.co.bitcamp.boxing;

public class BoxingUnBoxingTest {

    public static void main(String[] args) {
        
        // 박싱(Boxing)코드  ==> 객체화 시킴
        
        // 생성자로 만들기
        Integer obj1 = new Integer(100); // 특정 버전에서는 deplicated됨, 사용할 수는 있음
        Integer obj2 = new Integer("100");
        
        // valueOf로 만들기
        Integer obj3 = Integer.valueOf(100);
        
        // 컴파일 시    new Integer(100)로 자동으로 변환되기 때문에 문제없음!
        Integer obj4 /*참조번지*/ = 100; /*값*/  // 원래는 이렇게 값을 할당할 수 없음.
        
        System.out.println("[박싱 후]");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println();
        
        // 언박싱(unBoxing)코드 ==> 기본값으로 바꿈
        int value1 = obj1.intValue();
        int value2 = obj2;
        int value3 = obj3;
        int value4 = obj4.intValue();
        
        System.out.println("[언박싱후]");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        
        

    }

}
