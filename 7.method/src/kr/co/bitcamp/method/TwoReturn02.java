package kr.co.bitcamp.method;

import java.util.Arrays;

// 반환값이 2개있는 메서드를 구현
// 메서드는 { "software", "HARDWARE"} 입력시 소문자는 대문자로, 대문자는 소문자로 출력되도록 구현

public class TwoReturn02 {
    public static void main(String[] args) {

        String result[] = alphabet("software","HARDWARE");      //4) 반환값 o    |   받는 인자 값 o 
        System.out.println(Arrays.toString(result));

    }


    public static String[] alphabet(String str1, String str2) {
        String a = str1.toUpperCase();
        String b = str2.toLowerCase();
        
        String[] rValue = {a, b};
        
        
        return rValue;
    }
}
