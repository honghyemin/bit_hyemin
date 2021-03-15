package day0224;

// Random 클래스
// Random 클래스는 자바의 "난수"를 담당하는 클래스이다.
// 난수란 규칙없이 마구잡이로 만들어지는 숫자를 뜻한다.
// 만약 여러분들이 랜덤한 숫자를 만들어야 하는 경우
// Random 클래스를 사용하여 만들면 된다.
// Scanner와 마찬가지로 import를 통하여 우리 클래스로 불러와야 한다.

 import java.util.Random;

public class Ex01Random {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        // random클래스의 작동원리는 간단하게 설명하면
        // 0부터 1까지 존재하는 무수한 실수를 순서없이 마구잡이로 뽑는 것.
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
        System.out.println("===========================");
        
        // random 객체는
        // double 타입의 난수
        // int 타입의 난수
        // long 타입의 난수
        // 등 다양한 타입의 난수가 존재.
        
        // 그 중 우리가 알아볼 것은 
        // int 타입의 난수를 뽑아주는
        // nextInt()메소드이다.
        
        // nextInt() 메소드는
        // 두 가지 방법으로 우리가 활용할 수 있는데
        // 1. int 범위 전체에 대한 난수
        // 우리가 nextInt()메소드의 괄호 안에
        // 아무것도 적어주지 않으면
        // int의 범위(+ - 20억) 안에서 난수가 결정됨
        
        System.out.println(random.nextInt()); 
        
        // 2. 0부터 우리가 지정한 숫자 -1까지의 범위 안의 난수
        // 우리가 nextInt() 메소드의 괄호 안에
        // int 값을 넣어주면
        // 0부터 해당 값 -1까지 나오게 된다.
        // 즉 우리가 10을 넣으면
        // 0부터 9까지의 10개의 숫자 중 하나가 난수로 제공된다.
        
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        
        System.out.println("===========================");
        
        // 그렇다면 우리가 만약 1~10 범위 안의 난수를 뽑으려면?
        //random.nextInt(10); -> 하지만 이것은 0~9까지 사이의 숫자만 출력
        // 어떻게하면 0~9를 -> 1~10까지로 바꿀 수 있을까?
        // 결과값에 무조건 1을 더해주면 된다.
        int number = random.nextInt(10) + 1;
        System.out.println(number);
        

    }

}




















