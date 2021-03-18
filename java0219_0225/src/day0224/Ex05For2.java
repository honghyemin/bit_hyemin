package day0224;
// for문 예제

import java.util.Scanner;

public class Ex05For2 {

    public static void main(String[] args) {
        // 1. 1부터 10가지 차례대로 출력하세요.
        Scanner scanner = new Scanner(System.in);

//        for(int i = 1; i<=10; i++) {
//            System.out.println(i);
//        }

        // 2. 4부터 -2까지 차례대로 출력
//        for(int i=4; i>=-2; i--) {
//            System.out.println(i);
//        }

        // 3. 1부터 10까지 홀수를 출력하세요

//        for(int i = 1; i<=10; i++) {
//            if ( i%2 == 1) {
//                System.out.println(i);
//            }
//        }

        // 4. 1부터 40까지 6의 배수만 출력
//        for(int i = 1; i <=40; i++) {
//            if(i % 6 == 0) {
//                System.out.println(i);
//            }
//        }

        // 5. 사용자로부터 숫자를 입력받아서 1부터 그 숫자까지를 출력하세요.

//        System.out.print("숫자 : ");
//        int num = scanner.nextInt();
//        
//        for(int i = 1; i<=num; i++) {
//            System.out.println(i);
//        }

        // 6. 사용자로부터 2개의 숫자를 입력받아서
        // 더 작은 숫자부터 더 큰 수 까지 차례대로 출력

//        System.out.print("숫자1 : ");
//        int num1 = scanner.nextInt();
//        System.out.print("숫자2 : ");
//        int num2 = scanner.nextInt();
//
//        int start = 0;
//        int end = 0;
//
//        if (num1 <= num2) {
//            start = num1;
//            end = num2;
//        } else {
//            start = num2;
//            end = num1;
//        }
//        for (int i = start; i <= end; i++) {
//            System.out.println(i);
//        }
        
        // 7. 사용자로부터 숫자를 입력받아서
        //    1부터 그 숫자까지의 합을 구하시오.
        
//        int sum = 0;
//        
//        System.out.print("숫자: ");
//        int num = scanner.nextInt();
//       
//        
//        for (int i = 1; i<= num; i++) {
//            sum += i;
//           
//        }
//         System.out.printf("1부터 %d까지의 합 : %d\n", num, sum);
        
        // 8. 사용자로부터 숫자를 입력 받아서 1부터 그 수까지의 곱을 구하시오
        
        int sum = 1;
        
        System.out.println("숫자: ");
        int num = scanner.nextInt();
        
        for(int i = 1; i <= num; i++) {
            sum *= i;
        }
        
        System.out.printf("1부터 %d까지의 곱 : %d\n", num, sum);
        
        //  큰 수를 하면(int의 용량을 초과하는?) overflow발생할 수 있음.
        

        scanner.close();
    }

}







