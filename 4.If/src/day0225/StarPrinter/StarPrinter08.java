package day0225.StarPrinter;

import java.util.Scanner;

public class StarPrinter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자 : ");
        int num = scanner.nextInt();
        
        for(int i=1; i<=num; i++) {
            String stars = new String();
            
            for(int j=1; j <= num-i; j++) {
                stars += " ";
            }
            for(int j=1; j<=i; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }   
        
            for (int i =1; i <= num; i++) {
            String stars = new String();
            
            for(int j=1; j <= i; j++) {
                stars += " ";
            }
            
            for(int j=num-1; j>=i; j--) {
                stars += "*";
            } System.out.println(stars);
        }
            /* 다른 방식 (if else 사용)
            for(int i =1; i <= 2*num -1; i++) {
                String stars = new String;
                
                if(i<num) {
                //윗부분
                 
                //공백을 담당하는 j for문  
                int spaceWidth = num-i;
                
                for(int j = 1; j <= spaceWidth; j++ {
                
                     stars += " ";
                  }
                  
                //별을 담당하는 j for문  
                  int starWidth = i;
                  
                  for(int j =1; j <= starWideth; j++) {
                      
                      stars += "*";
                  }
                 
                
                }else {
                //아랫부분 
                 
                //아랫줄에서 기준으로 사용할 lowerI 
                int lowerI = i - num + 1;
                  
                //공백을 담당하는 j for문
                int spaceWidth = lowerI -1;
                for(int j =1; j<= spaceWidth; j++) {
                     stars += " ";
                 }
                
                //별을 담당하는 j for문
                 for(int j = lowerI; j <= num; j++) {
                     stars += "*";
                }
                }
                }
                */
                
                
                  scanner.close();
}


     
    

}
