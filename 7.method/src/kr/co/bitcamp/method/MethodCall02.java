package kr.co.bitcamp.method;

// 메인 메서드에서 100을 보냈을 때 값이 수정되게끔 call by reference 방식으로 코드 수정

public class MethodCall02 {

    public static void main(String[] args) {
        
        MethodCall02 a = new MethodCall02(); // -> 객체를 생성함. 힙 영역에 MethodCall02가 올라간 것.
        sum(a);     // 클래스타입으로 변수 a를 선언하고 , new라는 연산자를 사용하여 객체를 생성하여 
                    // 해당 주소값(번지)을 메서드로 넘김.
        
        System.out.println("main 메서드에서 a값 출력 : " + a);
        
        int[] b = new int[5];
        sum2(b);    // 배열타입으로 변수 b를 선언하고 , new라는 연산자를 사용하여 객체를 생성하여 
                    // 해당 주소값(번지)을 메서드로 넘김.
        System.out.println("main 메서드에서 b값 출력 : " + b);
        
        double[] c = new double[5];
        sum3(c);
        System.out.println("main 메서드에서 c값 출력 : " + c);
        
        Integer d  = new Integer(100); // deprecated되었다..? // 참조변수인데 번지가 아니라 값이 나옴.           
        sum4(d);                                            // why? 생성할 때 기본값으로 100입력 했으므로.                                                          
        System.out.println("main() 메서드에서 d값 출력 : " + d); 
                                                            // Wrapper 클래스의 Integer 클래스 타입으로 변수 d를 선언하고
                                                            // new로 객체를 생성 -> 해당 주소값을 메서드로 보낸다.
                                                            // 주소 값이 찍히는 게 아니라 100이라는 값이 찍힘.

    }
    
    public static void sum(MethodCall02/*클래스타입으로*/ a/*참조형이므로 값이아닌 주소(번지)가 들어감*/) {
        
        System.out.println("sum() 메서드에서 a값 출력 : " + a);
        
    }
    
    public static void sum2(int[] b) {
        System.out.println("sum2() 메서드에서 b값 출력 : " + b);

    }
    
    public static void sum3(double[]c) {
        System.out.println("sum3() 메서드에서 c값 출력 : " + c);
    }
    
    public static void sum4(Integer d) {                      // 주소값이 찍히는게 아니라 500이라는 값이 찍힘.
        d += 400;
        System.out.println("sum4() 메서드에서 d값 출력 : " + d);

    }

}
