package kr.co.bitcamp.exception03;

public class ThrowsTest {

    // 아래 main에서 throws Exception 구문을 추가시에 JVM(Java Virtual Machine)에게 예외를 던짐.
    public static void main(String[] args) /*throws Exception*/ {
        
       
        
       // method1();  // 해당메서드에서는 예외가 발생할 가능성이 있으므로 예외처리를 해라
       
        try {
            method1();  
        } catch (Exception e) {
            System.out.println("예외발생 : 0으로 나눌 수 없습니다.");
            // e.printStackTrace();
        }

    }
    
    // throws는 메서드 선언부 끝에 작성을 하며, 
    // 호출한 곳으로 예외를 되돌리며, 호출한 곳에서 반드시 예외를 처리해야함.
    public static void method1() throws Exception/*해당 메서드에서 예외가 발생하면 던짐.*/{
        //method2호출
        method2(); // 여기서는 빨간줄 오류가 뜨지 않음.()method2도 throws로 정의를 했는데..?
                   // 예외가 발생하면 최종적으로 호출한 곳에서 처리를 함. 즉 try/catch구분에서 처리를 진행하므로 오류발생하지않음
    }
    
    public static void method2() throws Exception {
        System.out.println(10/0);       // 산술예외(runtime/실행예외)
    }

}
