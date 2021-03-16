package day0225.StarPrinter;
//별찍기 1번

import java.util.Scanner;
public class StarPrinter01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 줄 수: ");
        int lineNumber = scanner.nextInt();
        
        // 별찍기에서 
        // i for문은 세로 줄을 담당
        // j for문은 i번 줄의 출력내용을 담당
        
        for(int i = 1; i<= lineNumber; i++) {
            // i번 줄의 출력내용을 ㅈ장할 String변수를 만들자.
            String stars = new String();
           
            for(int j = 1; j <=i; j++) {
                stars += "*";
                //System.out.print("*");
            }
            System.out.println(stars);
        
        }
        scanner.close();
    }

}
