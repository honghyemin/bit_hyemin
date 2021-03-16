package day0225.StarPrinter;

import java.util.Scanner;
public class StarPrinter06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 줄 수 : ");
        int number = scanner.nextInt();
        
        for (int i=1; i<=number; i++) {
            String stars = new String();
            
            for(int j=1; j<=i-1; j++) {
                stars += " ";
            }
            
            /*for(int j=2*i-1; j<=2*number-1; j++) {
                stars += "*";
            }*/
            
            int starWidth = 2 * (number-i) +1;
            for(int j = 1; j<= starWidth; j++) {
                stars += "*";
            }
           
            
            
            System.out.println(stars);
        }

        scanner.close();
    }

}
