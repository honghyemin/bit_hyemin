package kr.co.bitcamp.boxing;

public class StringToPrimitive {

    public static void main(String[] args) {
        
        
        int value1 = Integer.parseInt("100");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        // 결과값은 기본 값, 논리형 값이 아닌 '문자열'

        
    }

}
