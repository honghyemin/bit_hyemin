package day0222;
// 제어문(Control Statement)
// 제어문이란, 특정 코드블락이 실행될지 혹은 반복될지를 결정하는 명령문.
// 주로 어떤 조건이 true가 나오면 해당 코드블락을 실행 혹은 반복한다.
// 제어문에는 크게 조건문과 반복문이 있다.
// 1. 조건문 : 조건이 맞으면 코드 블락 실행
//    크게 if와 switch가 있다.
// 2. 반복문 : 조건이 맞는동안 코드 블락 반복
//    크게 while과 for가 있다.

// 코드블락 
// 코드블락이란 한 개의 {}의 모든 코드를
// 한 개의 코드블락이라고 한다.
// 한 개의 코드블락 안에는 여러개의 다른 코드블락이 들어올 수도 있다.
// 코드 블락이 중요한 이유는 변수의 유효범위와도 연결되기 때문이다.
// 변수의 유효범위란 해당 변수가 어디서부터 어디까지 호출가능한지에 대한 범위.
// 해당 변수가 유효한 범위 안에서는 똑같은 이름의 변수는 다시 선언할 수 없다.
// 또한 유효범위가 벗어나면 더이상 그 변수는 존재하는 것이 아니기 때문에 
// 해당 변수를 호출하려고하면 에러가 발생함.
// 변수의 유효범위는 해당 변수가 선언된 위치부터 그 변수가 속해있는 코드블락이 종료될때까지.

// 조건문 01 - if
// if조건문은 우리가 ()안에 true 혹은 false가 나오는
// 조건식을 만들어주고
// 해당 조건식이 true가 나오면 그 if에 달려있는 코드블락 전체를 실행한다.
// false가 나오면 해당 코드블락 전체는 실행되지 않고 무시된다.


public class Ex12If {

    public static void main(String[] args) {
        int num = -5;
        
        // if 조건식은 다음과 같은 양식을 가진다
        // if(조건식){
        //     참일때 실행할 코드들
        // }
       
        if (num>0) {
            double d = 3.141592;
            System.out.println("num의 현재 값: " + num);
            System.out.println("num은 양의 정수입니다.");
            
        }
        
        double d = 1.1111;
        // 위의 코드블락의 변수 d는 이미 종료됨.
        System.out.println("d의 현재 값: " + d);
        
        System.out.println("프로그램 종료");
        
        
    }

}























