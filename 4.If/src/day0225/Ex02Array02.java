package day0225;
// 배열 예제

// 사용자로부터 숫자를 4개 입력 받아서
// 배열에 차례대로 저장하고
// 다시 차례대로 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Ex02Array02 {
    static final int SIZE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = new int[SIZE];
        // numberArray의 크기 정해주기
        

        for (int i = 0; i < numberArray.length; i++) {

            System.out.print((i+1)+ "번째 값: ");
            // 순서를 0~3으로 하지말고 1~4로 바꾸는 값

            numberArray[i] = scanner.nextInt();
        }
        System.out.println("---------numberArray의 값들---------");
        for(int i = 0; i<numberArray.length; i++) {
            System.out.printf("numberArray[%d] : %d\n",i, numberArray[i]);
        }
       

    }

}
