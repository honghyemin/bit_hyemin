package kr.co.bitcamp.exception01;

public class NumberFormatTest {

    public static void main(String[] args) {
        
        String str1 = "100";
        String str2 = "100가";   // 숫자로 바꿀 수 없다. (숫자와 문자가 섞여있으므로)
        
        System.out.println(str1 + ", " + str2);
        
        int value1 = Integer.parseInt(str1); // 문자열을 숫자로 변환
        System.out.println(value1);
        
        int value2 = Integer.parseInt(str2);
        System.out.println(value2);
        
        int result = value1 + value2;
        System.out.println(result);
        

    }

}
