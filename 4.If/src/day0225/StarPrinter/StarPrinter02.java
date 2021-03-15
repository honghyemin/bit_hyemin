package day0225.StarPrinter;

import java.util.Scanner;
public class StarPrinter02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 줄 수: ");
        int lineNumber = scanner.nextInt();
        
        for(int i=1; i<= lineNumber; i++) {
            String stars = new String();
            
            for(int j=i; j<=lineNumber; j++) {
            stars += "*";
            }
            System.out.println(stars);
        }

        scanner.close();
    }

}
