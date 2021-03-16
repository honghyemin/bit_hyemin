package day0222;
// 사용자로부터 키와 몸무게를 입력받아서
// BMI 결과값을 출력해주세요

// BMI 공식은
// 몸무게 / 키 / 키 인데
// 키는 m 단위로 입력하도록 적기
import java.util.Scanner;

public class Ex11BmiChecker {
    static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("키를 m단위로 입력해주세요 : ");
        double height = scanner.nextDouble();
        System.out.print("몸무게를 kg단위로 입력주세요 : ");
        double weight = scanner.nextDouble();
        
        double bmi = weight / height / height;
        
       
        System.out.printf("사용자의 키 : %.2fm 사용자의 몸무게 : %.2fkg\n", height, weight);
        System.out.printf("사용자의 BMI: %.2f\n", bmi);
        
        scanner.close();

    }

}
