package kr.co.bitcamp.typeparameter5;

public class CompareTest {

    public static void main(String[] args) {
        
        int result = Compare.compare(300, 200); //extends Number이므로 int형 타입만
        System.out.println(result);
        
        // String 클래스는 Number클래스와 아무런 관계가 없다.
        // String result2 = Compare.compare("이순신", "김순신"); // 에러발생 
        
        
        // Number클래스는 Object클래스의 자손이지만 
        // Number를 상속받은 그 하위의 클래스까지만 사용할 수 있으므로
        // Number의 상위클래스은 Object클래스는 동일한 타입을 사용할 수 없다.
        // Compare.compare(new Object(), new Object()); // object타입으로 넣음 = new 생성
                                                        // 에러 발생
        
        result = Compare.compare(new Integer(100), new Double(75.11)); //auto boxing이 일어났으므로 줄이 그어진 것.
        System.out.println(result);
        
        // 비교의 결과이므로 [ 앞의 값이 크면 1 ]
        //              [ 뒤의 값이 크면 -1 ]
        //              [ 값이 똑같으면 0 ]
        
        //  Number는 추상클래스이기 때문에 인스턴스를 생성하지 못한다.
        // Compare.compare(new Number(), new Number()); 
    }

}
