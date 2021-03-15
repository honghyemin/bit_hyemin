package day0225.StarPrinter;

import java.util.Scanner;
public class StarPrinter09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("값: ");
        int number = scanner.nextInt();
        
        for (int i = 1; i<= number; i++) {
            String stars = new String();
            
            for(int j=i; j <= number-1; j++) {
                stars += " ";
                                         
            }
            
            for(int j=1; j<=2*i-1; j++) {
                stars += "*";
            }
            
        System.out.println(stars);    
        }
        
        for (int i = number; i >=1; i--) {
            String stars = new String();
            
            for(int j=i; j <= number; j++) {
                stars += " ";
                                         
            }
            
            for(int j=1; j<=2*i-3; j++) {
                stars += "*";
            }
            
            
            
            
            
            System.out.println(stars);
        }

        
        
        scanner.close();
    }

}
