package day0222;
// 학생의 번호, 이름, 국어, 영어, 수학, 총점, 평균율
// 각각 변수를 만들어서
// 값을 할당하고 출력하는 프로그램을 작성
public class Ex05GradeBook01 {
        public static void main(String[] args) {
            int id = 1;
            String name = new String("홍길동");
            int kor = 80;
            int eng = 70;
            int math = 88;
            int sum = (kor+eng+math);
            System.out.println("번호 : " + id);
            System.out.println("이름 : " + name);
            System.out.println("국어점수 : " + kor);
            System.out.println("영어점수 : " + eng);
            System.out.println("수학점수 : " + math);
            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + (sum/3.0));
            //int/int(int나누기int)에 앞에 double만 붙이게되면 뒤에 '소숫점.0'이 붙기만 함.
            //3.0과 같은 식으로 나누어줘야 평균값이 나옴
            
    
}
}
