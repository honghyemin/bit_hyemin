package day0225.StarPrinter;


import java.util.Scanner;
public class StarPrinter07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 줄 수 : ");
        int num = scanner.nextInt();
        
        for(int i =1; i <= num; i++) {
            String stars = new String();
            for(int j=1; j<=i; j++) {
                stars += "*";
            }System.out.println(stars);
        } 
        
        for(int i=1; i<= num; i++) {
            String stars = new String();
            for(int j=i; j <= num-1; j++) {
                stars += "*";
                
            }System.out.println(stars);
        } 
        
        

        
        scanner.close();
    }

}
