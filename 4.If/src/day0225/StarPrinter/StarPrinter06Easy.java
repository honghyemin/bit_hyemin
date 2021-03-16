package day0225.StarPrinter;

import java.util.Scanner;
public class StarPrinter06Easy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 줄 수 : ");
        int number = scanner.nextInt();
        
        for (int i=number; i >= 1; i--) {
            String stars = new String();
            
            int spaceWidth = number -i;
            // 공백을 담당하는 j for문
            for(int j=1; j<=spaceWidth; j++) {
                stars += " ";
            }
            
            // 별을 담당하는 j for문
            int starWidth = 2 * i - 1;
            for(int j = 1; j<= starWidth; j++) {
                stars += "*";
            }
           
            
            
            System.out.println(stars);
        }

        scanner.close();
    }

}
