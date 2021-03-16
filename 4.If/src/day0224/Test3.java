package day0224;
//1부터 100까지의 소수를 구하는 프로그램

//1. 소수란?
// 약수가 1과 자기 자신인 숫자
// = 약수의 갯수가 2개인 숫자

//2. 약수란?
// a 를 b로 나누어서 나눠 떨어지면 b는 a의 약수이다. (즉 나머지가 0)
// = a를 b로 나누어서 나머지가 0과 같으면
//   b는 a의 약수.

//3. 어떤 숫자의 가장 큰 약수는?
// 자기 자신.

// 이 프로그램에서
// i는 소수인지 아닌지를 검사할 숫자가 된다.
// j는 i의 약수인지 아닌지를 검사할 숫자가 된다.
public class Test3 {

    public static void main(String[] args) {

        // i는 소수인지 아닌지를 검사할 숫자가 된다.
        // 그렇다면
        // i의 start는?
        // i의 end는?

        int iStart = 1;
        int iEnd = 100;
        for (int i = iStart; i <= iEnd; i++) {

            int count = 0;

            int jStart = 1;
            int jEnd = i;

            for (int j = jStart; j <= jEnd; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + "는(은) 소수입니다.");
            }
        }

    }

}
