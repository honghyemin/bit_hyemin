package day0225.StarPrinter;

import java.util.Scanner;

public class StarPrinter10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 줄 수: ");
        int lineNumber = scanner.nextInt();

        // 총 세로 줄 수를 가지고 있는 int 변수 maxHeight

        int maxHeight = 2 * lineNumber - 1;

        for (int i = 1; i <= maxHeight; i++) {
            String stars = new String();
            // 첫번째 줄 + 마지막 줄(if문 내에서 첫번째줄과 마지막줄만 별만 찍어라)
            // 그리고 그 외의 경우로 나눠준다.

            if (i == 1 || i == maxHeight) {
                // 첫번째 혹은 마지막 줄일때

                // maxHeight( 2*lineNumber-1)개의 별을 넣어줌
                for (int j = 1; j <= maxHeight; j++) {
                    stars += "*";
                }

            } else {
                // 그 외 일때

                // 별의 갯수를 저장할 int 변수 starWidth
                int starWidth = 0;
                
                // 공백의 갯수를 저장할 int 변수 spaceWidth
                int spaceWidth = 0;
                
                
                if( i<lineNumber ) {
                    // 첫줄을 제외한 윗부분
                    
                    // 1로 시작하는 윗부분의 i를 만들어주자
                    // 첫번째 줄을 제외한 2,3,4번째의 줄을 만들어줄 것이므로
                    int upperI = i-1;
                    starWidth = lineNumber - upperI;
                    spaceWidth = 2*upperI -1;
                    
                    
                } else {
                    // 마지막줄을 제외한 아랫부분
                    
                    // 1로 시작하는 아랫부분의 i를 만들어주자
                    int lowerI = i -lineNumber +1;
                    
                    starWidth = lowerI;
                    spaceWidth = maxHeight - 2*starWidth;
                    
                
                }
                
                // 왼쪽 별을 담당하는 j for문
                
                 for(int j=1; j<=starWidth; j++) {
                    stars +="*";
                }
                
                
                // 가운데 공백을 담당하는 j for문
                
                 for(int j = 1; j<=spaceWidth; j++) {
                      stars += " ";
                 }
                
                
                // 오른쪽 별을 담당하는 j for문
                
                 for(int j=1; j<=starWidth; j++) {
                     stars +="*";
                 }
                
                
                
                
                
            }

            System.out.println(stars);
        }

        scanner.close();
    }

}
