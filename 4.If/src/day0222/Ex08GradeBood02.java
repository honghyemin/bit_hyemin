package day0222;
// 번호, 이름, 국어, 영어, 수학, 총점, 평균 을 각각 변수로 만들고
// 값을 할당해서 다음과 같은 양식대로 출력되게 프로그램을 작성하시오

// 번호 : 003번 이름 : 김땡땡
// 국어 : 080점 영어 : 079점 수학 : 080점
// 총점 : 239점 평균 : 080.67점
public class Ex08GradeBood02 {

    public static void main(String[] args) {
        int num = 003;
        String name = new String("김땡땡");
        int kor = 80;
        int eng = 79;
        int math = 80;
        int sum = (kor+eng+math);
        double avg = sum / 3.0;
        
        System.out.printf("번호 : %03d번 이름 : %s\n", num, name );
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, math );
        System.out.printf("총점 : %03d점 총점 : %06.2f점\n", sum, avg );
        
        

    }

}
