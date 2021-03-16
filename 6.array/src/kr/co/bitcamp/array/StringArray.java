package kr.co.bitcamp.array;

import java.util.Arrays;

public class StringArray {    
    public static void main(String[] args) {
        
        // String 배열
        String str = new String("자바"); // 참조변수. 주소값을 가지고 있음
        System.out.println(str); // 값이 출력. why? 
        
        System.out.println(str.toString()); 
        // 참조변수만 입력했지만 컴파일러가 내부적으로 toString()을 인출
        // toString()이 값을 출력시킴(내용을 리턴함)
       
        System.out.println();
        
        // 객체 배열 => 2차원 배열임
        String[] str2 = new String[] {
          "안녕", "이순신", "류성룡"            // 1차원 배열
          
        };
        
        for(int i = 0; i<str2.length; i++) {
            System.out.print(str2[i] + " ");
        }
        System.out.println();
        
        // 주소가 나옴
        System.out.println("String 배열의 주소 : " + str2);
        System.out.println("String 배열의 주소 : " + str2.toString()); 
        // 위의 식(9번째줄~12번째줄)과 같은 방식으로 했으나 위는 값이 나오고 밑의 결과값은 주소가 나옴. why?
        // 메서드는 같으나 위의 식은 string의 toString()이고 밑의 식은 object의 toString임.
        
        // Object 클래스는 모든 클래스의 최고조상이다.
        // String 클래스는 object클래스의 toString을 오버라이딩(재정의, 새로 구현) 했기때문에 값이 출력됨..
                
        System.out.println("String 배열의 주소 : " + str2[1].toString()); // String의 toString.
        
        str2[0] = "정철";
        System.out.println(Arrays.toString(str2));
        System.out.println();
        
        // 향상된 for문
        for(String str0 : str2) {
            System.out.println(str0);
        }

    }

}


















