package kr.co.bitcamp.method;

// 메서드로 인자(parameter, argument) 전달 시 정수 100을 보냈을 때 코드의 결과를 알아보기.(call by value에 해당되는 내용)


public class MethodCall01 {

    public static void main(String[] args) {
       
        int a = 100;
        sum(a); // 밑의 sum 메서드에 보냄 , 메인과 sum은 별개
        
        System.out.println("main()의 a: "+a);          // a의 값은 100. 
        
    }
    
    public static void sum(int a) {     // Call by value = 값에 의한 호출
                                        // 메서드로 인자값을 넘길 때 복사하여 넘기는 방식
                                        // ㄴ> 따라서 sum() 메서드 내부에서는 복사된 값으로 처리
        
        a = a + 400;                    // a에는 500이 저장되어 있음.
        
        System.out.println("sum()의 a: " + a);
      
    }
    

}
