package kr.co.bitcamp.forWhile;

/*
 * 자바의 반복문 종류 : 크게 봤을 때 4가지
 * 
 * for
 *      for(변수 초기식; 조건식; 증감식) {
 *          //조건식이 참인 동안 실행
 *      }
 * 
 * while
 * do ~ while
 * 향상된 for문
 */

/*
 * 알파벳 26개 문자를 대문자로 출력하는 반복문을 구현하시오.
 * (아스키코드)
 */
public class ForAlphabetPrint {
    public static void main(String[] args) {
        System.out.println((int)'A');           // 65
        System.out.println((int)'Z');           // 90
        
        // A(65) ~ Z(90)까지 출력
        for(int i = 65; i<=90; i++)
            System.out.print((char)i + " ");
        
        

    }

}









