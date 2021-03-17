package kr.co.bitcamp.equals;

import java.util.Arrays;

public class Student {
    
    int age;
    String name;
    int[] subject;   
    
    public Student(int age) {
        this.age=age;
    }
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public Student(int age, String name, int[] subject) {
        this.age = age;
        this.name = name;
        this.subject = subject;
    }
    
    // 논리적 동등이 비교하기위해 오버라이딩
    @Override
    public boolean equals(Object obj) { // obj에 들어간게 student가 되어야 비교를 할 수 있음..?
        System.out.println("오버라이즈 된 equals 호출됨.");
        
        // 타입변환(부모타입인 obj가 Student 타입이면 다운캐스팅)이 가능한지 여부를 알아보기 위해서 instanceof 연산자 이용
        if(obj instanceof Student) { 
            Student student = (Student)obj; // downcasting
            // 논리적 동등을 위해서 조건문을 설정, age와 name이 다 같다는 의미.
            if((this.age == student.age) && (this.name.equals(student.name)) 
                    && (Arrays.equals(this.subject, this.subject))) 
            /* 비교하는 객체와 내용이 같다면*/ {
                return true;
            }
            
            
        }
        return false;
    }

}
