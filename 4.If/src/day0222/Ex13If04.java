package day0222;
//3. 사용자로부터 숫자를 입력 받아서 해당 값이 짝수이면 출력하세요

import java.util.Scanner;
public class Ex13If04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("값: ");
        int number = scanner.nextInt();
        
        if (number%2 == 0) {
            System.out.println(number);
        }
        
        System.out.println("프로그램 종료");
        
        

    }

}
