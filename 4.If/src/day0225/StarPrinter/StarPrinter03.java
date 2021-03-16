package day0225.StarPrinter;

import java.util.Scanner;

public class StarPrinter03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 줄 수: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            String stars = new String();
            
            // 공백을 담당하는 j for문
            for (int j = 1; j <= number - i; j++) {
                stars += " ";

                
                }
            
            // 별을 담당하는 j for문
            for (int j = 1; j<= i; j++) {
                stars += "*";
            }

            System.out.println(stars);

        }
        scanner.close();
    }

}
