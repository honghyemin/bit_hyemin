package day0223;
// 사용자로부터 키와 몸무게를 입력받아서

// BMI를 계산하여 출력하고
// 해당 BMI에 따른 체형도 출력하는 프로그램

// BMI공식 : 몸무게 / 키 / 키
// 단, 키는 m 단위이고 몸무게는 kg단위이다.

// BMI 수치에 따른 체형
// ~ 18.5 미만 : 저체중
// ~ 23 미만 : 정상
// ~ 25 미만 : 과체중
// ~ 30 미만 : 비만
// 30이상 : 고도비만

// 단 기네스북에 따르면 세상에서 가장 키가 컸던 사람의 키는 2.82m 였습니다.
// 단 기네스북에 따르면 세상에서 가장 무거웠던 사람의 무게는 635킬로그램이었습니다.

// 키와 몸무게 순으로 입력을 받되 
// 만약 사용자가 잘못된 키 혹은 몸무게를 입력하면 추가적인 진행없이
// 경고메세지 출력 후 프로그램을 종료시켜주세요

import java.util.Scanner;

public class Ex11BmiCheck2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("키(m로 입력) : ");
        double height = scanner.nextDouble();
        if (height > 0 && height <= 2.82) {
            System.out.print("몸무게(kg으로 입력) : ");
            double weight = scanner.nextDouble();
            if (weight > 0 && weight <= 635) {
                double bmi = weight / height / height;
                System.out.printf("BMI는 [%.2f] 입니다.\n", bmi);

                if (bmi < 18.5) {
                    System.out.println("저체중");
                } else if (bmi < 23) {
                    System.out.println("정상체중");
                } else if (bmi < 25) {
                    System.out.println("과체중");
                } else if (bmi < 30) {
                    System.out.println("비만");
                } else {
                    System.out.println("고도비만");
                }

            } else {
                System.out.println("잘못 입력하였습니다.");
                System.out.println("프로그램 종료");
            }
        } else {
            System.out.println("잘못 입력하였습니다.");
            System.out.println("프로그램 종료");
        }

        scanner.close();

    }

}
