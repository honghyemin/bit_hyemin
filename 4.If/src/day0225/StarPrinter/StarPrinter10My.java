package day0225.StarPrinter;

import java.util.Scanner;

public class StarPrinter10My {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("값: ");
        int lineNumber = scanner.nextInt();

        for (int i = 1; i <= 2*lineNumber-1; i++) {
            String stars = new String();

            if (i < lineNumber) {
                
                int starWidth = lineNumber-i;
                for(int j = 0; j<=starWidth; j++) {
                    stars += "*";
                }
                
                int spaceWidth = 2*i -1;
                for(int j = 1; j<=spaceWidth; j++) {
                    stars+=" ";
                }
                
                int starWidth2 =  lineNumber-i;
                for(int j = 0; j<=starWidth2; j++) {
                    stars += "*";
                }
                

            } else {
                
                for(int j=1; j<=i-lineNumber; j++) {
                    stars += "*";
                }
                
                
                
                
                
                
            }

            System.out.println(stars);
        }
        scanner.close();
    }

}
