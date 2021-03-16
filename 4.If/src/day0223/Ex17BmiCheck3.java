package day0223;
// 사용자로부터 키와 몸무게를 입력 받아서

// BMI수치와 체형을 출력해주는 프로그램.
// 단 사용자가 잘못된 키 혹은 몸무게를 입력하면
// 올바른 키나 몸무게를 입력할 때 까지 다시 입력핟록 코드를 작성하시오

// BMI 수치에 따른 체형
//~ 18.5 미만 : 저체중
//~ 23 미만 : 정상
//~ 25 미만 : 과체중
//~ 30 미만 : 비만
//30이상 : 고도비만

//단 기네스북에 따르면 세상에서 가장 키가 컸던 사람의 키는 2.82m 였습니다.
//단 기네스북에 따르면 세상에서 가장 무거웠던 사람의 무게는 635킬로그램이었습니다.
import java.util.Scanner;

public class Ex17BmiCheck3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("키(m단위) : ");
        double height = scanner.nextDouble();

        while (height > 2.82 || height <= 0) {
            System.out.println("잘못 입력하였습니다.");
            System.out.println("키(m단위) : ");
            height = scanner.nextDouble();
        }

        System.out.print("몸무게 : ");
        double weight = scanner.nextDouble();

        while (weight > 635 || weight <= 0) {
            System.out.println("잘못 입력하였습니다.");
            System.out.println("몸무게 : ");
            weight = scanner.nextDouble();

        }
        
        double bmi = weight / height / height;
        System.out.printf("BMI는 [%.2f] 입니다.\n", bmi);

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi < 23) {
            System.out.println("정상체중입니다.");
        } else if (bmi < 25) {
            System.out.println("과체중입니다.");
        } else if (bmi < 30) {
            System.out.println("비만입니다.");
        } else {
            System.out.println("고도비만입니다.");
        }
        
    }

}
