package kr.co.bitcamp.object2;

public class StudentTest {
    
    int test;
    
    public void getTest(){
        
    }
    
    public static void main(String[] args) {

        // static메서드에서는 this사용 불가...? 
        
        // 아래는 각각 독립된 저장공간을 가지는 인스턴스가 힙에 할당이 됨.
        Student stu1 = new Student();   // stu1,2는 stack의 영역에 있음. 각각 별개의 주소를 가지고 있음.
        Student stu2 = new Student();
        
        stu1.age = 20;
        stu1.name = "이순신";
        
        System.out.println(stu1); 
        System.out.println(stu2);    //초기화를 하지 않았으므로 기본값 나옴.
        
        // stu1의 주소를 stu2에 대입
        // => 원래 stu2가 가리키던 인스턴스(heap영역의 주소)는 쓰레기 객체가 됨.
        //    gc(garbage collector)가 쓰레기 객체를 수집해 소멸시킴.
        stu2 = stu1;
        System.out.println(stu1); 
        System.out.println(stu2);
        
        stu2.age = 10;
        System.out.println(stu1); 
        System.out.println(stu2);
        
        
        
        
    }
}
