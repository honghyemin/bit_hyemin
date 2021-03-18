package day0222;
// 연산자03
// 논리연산자
// 논리연산자는 boolean 값에 대한 연산을 하는데
// 다음과 같은 연산자가 있다.
// 1. AND 연산자
//    2개의 boolean 값이 모두 true일 때에만
//    결과값이 true가 된다
//    &&(shift+7)

// 2. OR 연산자
//    2개의 boolean 값 중 하나라도 true이면
//    결과값은 true가 된다.
//    ||(shift+\)

// 3. NOT 연산자
//    boolean값을 반전시켜준다
//    true는 false로, false는 true로 바꿔준다.
//    !

public class Ex04Operator04 {

    public static void main(String[] args) {
       // 1. && 연산자
       System.out.println("------------ 1.&& ------------");
       System.out.println("true && true : " + (true && true));
       System.out.println("true && false : " + (true && false));
       System.out.println("false && true : " + (false && true));
       System.out.println("false && false : " + (false && false));
       System.out.println();
       // 3,4번째 줄의 경우 앞에 이미 false이므로 뒤에는 뭐가 나오든지간에 죽은코드가 됨(=무조건 false)
       
       // 2. ||연산자
       System.out.println("------------ 2. || ------------");
       System.out.println("true || true : " + (true || true));
       System.out.println("true || false : " + (true || false));
       System.out.println("false || true : " + (false || true));
       System.out.println("false || false : " + (false || false));
       System.out.println();
       // 1,2번째 줄의 경우 앞에 이미 true이므로 뒤에는 뭐가 나오든지간에 죽은코드가 됨(=무조건 true)
       
       // 3. !연산자
       //     비록 값을 바꾸지만 실제 값이 바뀌는게 아니라
       //     해당 연산자를 만나는 순간에만 그 결과값이 바껴있는 상태가 되는 것이다.
       boolean b = true;
       System.out.println("------------ 3. ! ------------");
       System.out.println("!b : " + !b);
       System.out.println("b : " + b);
       System.out.println();
       
       // 논리연산자는 우리가 실제 true/false 값 혹은 boolean 변수를 만들어서 쓰기보다는
       // true/false의 결과값을 가지는 연산자 혹은 메소드의 결과에 대한 연산을 할때 주로 쓰인다
       // 예시 :
       // int number의 값이 0보다 크'고' 10보다 작습니까?
       // 수학으로 표현하면?
       // 0 < number < 10
       // 프로그래밍적으로 표현하면
       // number는 0보다 크다 + number는 10보다 작다
       // 이게 모두 true가 나와야 함.
       
       // 즉 AND 연산자를 사용하여
       // number > 0 && number < 10
       // 으로 적어 2개가 모두 true가 나오는지 체크해야 한다.
       System.out.println("------------ 4. ------------");
       int number = 5;
       System.out.println("numer의 현재값 : " + number);
       System.out.println("number > 0 && number < 10 : " + (0<number && number <10));
       
       number = -3;
       System.out.println("numer의 현재값 : " + number);
       System.out.println("number > 0 && number < 10 : " + (0<number && number <10));
       
       number = 20;
       System.out.println("numer의 현재값 : " + number);
       System.out.println("number > 0 && number < 10 : " + (0<number && number <10));
       
        

    }

}
