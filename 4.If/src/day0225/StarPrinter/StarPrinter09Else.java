package day0225.StarPrinter;

import java.util.Scanner;

public class StarPrinter09Else {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 줄 수: ");
        int lineNumber = scanner.nextInt();

        int maxHeight = 2 * lineNumber - 1;
        for (int i = 1; i <= maxHeight; i++) {
            String stars = new String();
            
            int spaceWidth = 0;
            
            int starWidth = 0;
            
            

            // 윗부분
            if (i < lineNumber) {

                // 공백의 갯수를 저장할 int 변수 spaceWidth
                 spaceWidth = lineNumber-i;
                
                // 별의 갯수를 저장할 int 변수 starWidth
                 starWidth = 2*i -1;
                

            } else {
                // 아랫부분
                int lowerI = 2*lineNumber -i;
                
             // 공백의 갯수를 저장할 int변수 spaceWidth
                spaceWidth = lineNumber-lowerI ;
                
                
                // 별의 갯수를 저장할 int 변수 starWidth
                 starWidth = 2*lowerI  -1;
                
            }
            
            // 공백을 담당하는 j for문 
            for(int j=1; j<=spaceWidth; j++) {
                stars += " ";
            }
            
            
            // 별을 담당하는 j for 문
            for(int j=1; j<=starWidth; j++) {
                stars +="*";
            }
            
            
            
            
            

            System.out.println(stars);
        }
        scanner.close();
    }

}
