package kr.co.bitcamp.wildcard6;

public class Course1<T> { // generic 표기할 때 물음표 앞에 썼던 클래스를 정의할 용도로 사용할 것임.
    
    private String name;
    private T[] students;
    
    // 생성자 : 변경을 한 이유 - 아직 T타입이 결정되지 않았기 때문에 두 번째 파라미터는 size로 정의함.
    public Course1(String name, int size) {  // size는 현 단계에서는 알 수 없고 정의할 때 알 수 있음.  
        this.name = name;
        this.students = (T[])new Object[size]; // 가장 상위의 것으로 초기화, 타입이 안맞으므로 캐스팅해줌.
    }
    
    public void add(T t/*제네릭의 파라미터 타입을 제네릭 메서드로 정의*/) {
        
        // size를 정의한 만큼 []가 생성이 되게 함
        for(int i=0; i<this.students.length; i++) {
            // add를 호출하며 타입을 사용
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
        
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
}





