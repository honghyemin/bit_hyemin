package kr.co.bitcamp.string02;

public class ValueOfTest {

    public static void main(String[] args) {
        
        String str1 = String.valueOf(true);
        System.out.println(str1); // 문자열 true
        
        String str2 = String.valueOf(777.888); // 실수형 값이 입력되었지만 valueof에 의해 문자열로 변환됨
        System.out.println(str2);

    }

}
