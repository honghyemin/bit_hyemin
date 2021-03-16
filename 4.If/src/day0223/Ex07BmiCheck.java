package day0223;
// 사용자로부터 키와 몸무게를 입력받아서 
// BMI 수치를 출력하고
// 해당 수치에 관한 메시지를 출력하는 프로그램을 작성

// BMI공식 : 몸무게 / 키 / 키
// 단, 키는 m 단위이고 몸무게는 kg단위이다.

// BMI 수치에 따른 체형
// ~ 18.5 미만 : 저체중
// ~ 23 미만 : 정상
// ~ 25 미만 : 과체중
// ~ 30 미만 : 비만
// 30이상 : 고도비만
import java.util.Scanner;
public class Ex07BmiCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("키(m단위) : " );
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg단위) : ");
        double weight = scanner.nextDouble();
        double bmi = weight/height/height;
        
        System.out.printf("사용자의 BMI: [%.2f]\n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else if (bmi < 30) {
            System.out.println("비만");
        } else {
            System.out.println("고도비만");
        }
        
        scanner.close();

    }

}
