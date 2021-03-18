package day0223;
// 사용자로부터 점수를 입력받아서 
// 90점 이상 : A
// 80점대 : B
// 70점대 : C
// 60점대 : D
// 그 외 : F
import java.util.Scanner;
public class Ex06GradeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("점수 : ");
         int score = scanner.nextInt();
         
         
         if (score >= 90) {
             System.out.println("A");
         } else if (score >= 80) {
             System.out.println("B");
         } else if (score >= 70) {
             System.out.println("C");
         } else if (score >= 60) {
             System.out.println("D");
         } else {
             System.out.println("F");
         }
         
        scanner.close();
        
    }

}
