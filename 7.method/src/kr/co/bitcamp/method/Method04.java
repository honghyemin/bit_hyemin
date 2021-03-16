package kr.co.bitcamp.method;

//4) 반환값 o       |      받는 인자 값 o 
//                             ㄴ> 대문자로 출력하는 메서드 구현

// 메서드는 ("welcome to bitcamp") 입력시 대문자로 출력되도록 구현한다.
// 입력한 소문자의 대문자 : WELCOMETO BITCAMP
public class Method04 {
    public static void main(String[] args) {
       
//        String str2 = "welcome to bitcamp";
//        str2 = capitalMethod(str2);
//                                                ==> 이런식으로도 가
//        System.out.println(str2);
        
        String result;
        result = capitalMethod("welcome to bitcamp");
        System.out.println("입력한 소문자의 대문자 : " + result);

    }
    
    // capitalMethod() 
    public static String capitalMethod(String str) {
        
        String rValue =  str.toUpperCase();
        return rValue; // 리턴을 해줘야함
        
        
    }

}
