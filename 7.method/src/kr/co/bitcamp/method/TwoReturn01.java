package kr.co.bitcamp.method;

import java.util.Arrays;

// 2개의 정수형 값을 리턴하는 메서드를 구현


public class TwoReturn01 {
    public static void main(String[] args) {
        
        int[] result = testMethod();        // 배열 변수 선언
        
        System.out.println(result);                          // 주소번지 출력
        System.out.println("resust[0] : " + result[0]);      // 값 출력
        System.out.println("resust[1] : " + result[1]);      // 값 출력
        System.out.println("resust[2] : " + result[2]);
        System.out.println(result[0] + result[1]); // 숫자형태임을 확인
        System.out.println(Arrays.toString(result)); // 반복문을 사용하지 않고 result의 모든 요소 출력 가능

    }

    public static int[] testMethod() { 
        
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        // 아무것도 리턴을 하지 않음을 나타냄 return null; 
        return new int[] { num1,num2, num3}; // 배열을 넘겨주는 방식
        
    }
}
