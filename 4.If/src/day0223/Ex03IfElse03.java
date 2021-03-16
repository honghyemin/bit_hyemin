package day0223;
// 상수로 관리자의 id와 비밀번호를 만들고
// 사용자로부터는 따로 id와 비밀번호를 입력받아서
// 만약 관리자의 id와 비밀번호가 일치하면
// "관리자 로그인성공!"
// 그 외에는 "로그인 실패"가 출력되는 프로그램 작성
import java.util.Scanner;
public class Ex03IfElse03 {
 static final String ADMIN_ID = new String("hyemin");
 static final String ADMIN_PASSWORD = new String("123456");
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID : ");
        String id = scanner.nextLine();
        System.out.print("Password : ");
        String password = scanner.nextLine();
        
        if (id.equals(ADMIN_ID) && password.equals(ADMIN_PASSWORD) ) {
            System.out.println("관리자 로그인 성공!");
        } else {
            System.out.println("로그인 실패");
        }
        
        scanner.close();

    }

}
