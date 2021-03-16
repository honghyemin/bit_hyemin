package kr.co.bitcamp.array;

// main()의 매개변수의 활용하는 방법 확인

public class MainArguments {
    public static void main(String[] args) {
        
        if(args.length != 2) {
            System.out.print("프로그램 사용법: ");
            System.out.println("아이디, 패스워드 입력");
            
        }
        
        
        String str1 = args[0];
        String str2 = args[1];
       

        // args를 진입점으로만 사용. 따로 사용x 근데 왜함?
        // 값을 안주면.....array index out of bounds...발생
        
        System.out.println("아이디 : " + str1);
        System.out.println("패스워드 : " + str2);
        
        int count = Integer.parseInt(str2); // 리턴타입 = int, 문자열이 아니고 정수. 즉, 연산이 가능해짐.
        int total = count + 500;
        System.out.println("total 값: " + total);
        

    }

}
