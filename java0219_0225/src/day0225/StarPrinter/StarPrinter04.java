package day0225.StarPrinter;

import java.util.Scanner;
public class StarPrinter04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 줄 수: ");
        int number = scanner.nextInt(); 
        
        for (int i = 1; i<=number; i++) {
            String stars = new String();
            
            
            for(int j = 1; j <= i-1; j++) {
                stars += " ";
            }
            
            for(int j = number; j >= i; j-- ) {
                stars += "*";
            }
            // 다른 방법
            // for (int j = i; j<= number-1; j ++) {
            //  stars += "*"; }
            
           
            
           System.out.println(stars); 
            
        }
        scanner.close();
       
        
    }

}
