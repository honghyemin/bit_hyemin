package day0219;
// 기본형 데이터타입 03
// 문자형 기본 데이터타입

// char는 "character"의 줄임말로써 문자 1개를 저장 가능하다.

// 기본형 데이터타입이기 때문에 char변수 혹은 상수는
// 해당 글자의 2진법 값을 저장하게 된다.
// 글자의 2진법 값은 ASCII 테이블이라는 특수한 문자표를 참조하여 값을 정하게된다.

// char 값은 우리가 ''안에 한 글자 넣어서 만들어주게 된다.
// ''안에 여러 글자가 들어가면 에러가 발생함.

// '' vs ""

// ''는 기본형 데이터타입인 char의 값을 의미한다.
// 한 번에 한 개의 글자만 값으로 넣어줄 수 있다.

// ""는 참조형 데이터타입인 String 클래스의 값을 의미한다.
// 한 번에 0개 이상의 글자를 값으로 넣어줄 수 있다.


public class Ex10Char {
    public static void main(String[]args) {
        // char 변수 c를 선언하고 'A'를 초기화해보자
        char c = 'A';
        System.out.println("char 변수 c의 현재값: ");
        System.out.println(c);
        
        // char 변수/상수에 실질적으로 저장되는 값은
        // 2진법 값이기 때문에 다음과 같은것도 가능하다.
        
        // 1. 해당 글자의 코드를 직접 집어넣어보기.
        // char 변수 c에 대문자 'K'의 코드값인 75를 직접 넣어보자
        c = 75;
        
        System.out.println("char 변수 c의 현재값: ");
        System.out.println(c);
        
        // 2. char 값에 숫자를 더해서 내가 원하는 글자로 바꿔보기
        //    대표적으로 대문자 char값을 소문자로 바꿀려면
        //    대문자 char값에 32를 더해주면 된다.
        
        c = 'A' + 32;
        System.out.println("char 변수 c의 현재값: ");
        System.out.println(c);
        
        // String vs char
        // 스트링은 한번에 여러글자를 다룰 수 있는 반면에
        // char는 한번에 한개의 글자만 저장 가능하다.
        
        // 아래코드는 char 값을 뜻하는
        // ''안에 여러 글자를 넣었기 때문에 에러가 발생한다.
        // c = '조재영';
        
        // 또한 char와 String은 아예 다른 데이터타입이기 때문에
        // 형변환을 써서 String 값을 char공간에 넣어줄 수도 없다.
        // c = (char)"조재영";
        
        // 우리가 실제 코드에서 변수에 정확히 한 개의 글자만 저장하는 경우는?
        // 거의 없다.
        
        // 변수에 여러개의 글자를 저장하는 경우는?
        // 대부분이다.
        
        // 그렇기 때문에 char 변수는 String 변수에 비교하면
        // 아예 안쓰인다고 해도 좋을 만큼 사용빈도가 적다. 
        
        // 참고
        // 참조형 변수 초기화하기
        // 참조형 변수는 특별한 방법으로 초기화하는데
        // new 라는 키워드를 사용해서 초기화를 하게 된다.
        // 클래스형은 다음과 같이 변수를 초기화한다.
        // 변수 = new 클래스이름();
        
        
        
        
        
    }

}
