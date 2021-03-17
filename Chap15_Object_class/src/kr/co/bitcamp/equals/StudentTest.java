package kr.co.bitcamp.equals;

public class StudentTest {

    public static void main(String[] args) {

//        Student student1 = new Student(20);
//        Student student2 = new Student(20);
//        
//        System.out.println(student1.equals(student2));

//        System.out.println();
//
//        Student student1 = new Student(30, "홍길동");
//        Student student2 = new Student(30, "홍길동");
//
//        System.out.println(student1.equals(student2));
//
//        System.out.println();
//
//        Student student3 = new Student(30, "동길홍");
//        Student student4 = new Student(30, "홍길동");
//
//        System.out.println(student3.equals(student4));
//        
//        System.out.println();

        Student student1 = new Student(25, "홍길동", new int[] {100,90});
        Student student2 = new Student(25, "홍길동", new int[] {100,90});
        System.out.println("오버라이즈 된 equals() 결과 : " + student1.equals(student2));

        

    }

}
