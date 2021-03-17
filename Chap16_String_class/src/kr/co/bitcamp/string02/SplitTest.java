package kr.co.bitcamp.string02;

public class SplitTest {

    public static void main(String[] args) {
        
        String str1 = " 사랑해, 너를, 파닭치킨, 양념치킨";
        String[] strArr = str1.split(",");// 정규 표현 식을 넣을 수 있음.
        
        for(String str : strArr) /*strArr에 있는 값을 str에 하나씩 넣음 - 향상된 for문*/ {
            System.out.println(str);
        }
        
        System.out.println();
        
        String str2 = " 사랑해, 너를/ 파닭치킨& 양념치킨, 후라이드";
        strArr = str2.split(",|/|&");
        
        for(String str3 : strArr) {
            System.out.println(str3);
        }
        

    }

}
