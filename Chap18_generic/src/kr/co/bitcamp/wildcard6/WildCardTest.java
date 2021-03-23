package kr.co.bitcamp.wildcard6;

import java.util.Arrays;

public class WildCardTest {

    // 정적메서드 --? 는 어떠한 객체도 다 받겠다.
    public static void registerCourse(Course1<?> course) { //<?>어떤 상속관계에 상관없이 들어갈 수 있다.
        
        System.out.println(course.getName() + " 수강생 : " + 
                            Arrays.toString(course.getStudents()));
        
    }
    // Student클래스 타입이거나 Student를 상속받는 클래스 (상위 타입 제한)
    public static void registerCourseStudent(Course1<? extends Student3> course) {
        System.out.println(course.getName() + " 수강생 : " + 
                Arrays.toString(course.getStudents()));
        
    }
    // Worker클래스 타입이거나 그 상위 클래스들만 파라미터로 들어올 수 있다. (하위 타입 제한)
    public static void registerCourseWorker(Course1<? super Worker5> course) {
        System.out.println(course.getName() + " 수강생 : " + 
                Arrays.toString(course.getStudents()));
        
    }
    
    public static void main(String[] args) {
        
        registerCourse(new Course1<Person2>("일반인 과정", 5));
        registerCourse(new Course1<Student3>("학생 과정", 10));
        registerCourse(new Course1<Worker5>("직장인 과정", 8));
        registerCourse(new Course1<HighStudent4>("고등학생 과정", 7));
        //registerCourse(new Object()); // Course타입만 가능. 별개의 타입은 올 수 없음.
        System.out.println();
        
        
        //Student를 상속받은 하위타입만 가능 = HighStudent만 가능할 것.
        //registerCourseStudent(new Course1<Person2>("일반인 과정", 5)); // Person이 부모타입이라 사용 불가.
        registerCourseStudent(new Course1<Student3>("학생 과정", 10));
        //registerCourseStudent(new Course1<Worker5>("직장인 과정",8)); // 상속받은 하위 타입이 아님. 사용 불가.
        registerCourseStudent(new Course1<HighStudent4>("고등학생 과정", 7));
        System.out.println();
        
        //상위타입만 가능
        registerCourseWorker(new Course1<Person2>("일반인 과정", 5));
        // registerCourseWorker(new Course1<Student3>("학생 과정", 10));
        registerCourseWorker(new Course1<Worker5>("직장인 과정", 8));
        //registerCourseWorker(new Course1<HighStudent4>("고등학생 과정", 7));
        System.out.println();
        
        // 직접 Course를 생성해서 확인
        Course1<Person2> pCourse = new Course1<Person2>("일반인 과정", 3);
        pCourse.add(new Person2("일반인"));
        pCourse.add(new Person2("직장인"));
        pCourse.add(new Person2("학생"));
        pCourse.add(new Person2("고등학생"));
        
        registerCourse(pCourse);
        registerCourseWorker(pCourse);
       // registerCourseStudent(pCourse);   // Student를 상속받는 클래스만 파라미터로 올 수 있는데 조상타입이므로 에러발생
        System.out.println();
        
        Course1<Worker5> wCourse = new Course1<Worker5>("직장인 과정", 3);
        wCourse.add(new Worker5("김대리"));
        wCourse.add(new Worker5("박과장"));
        wCourse.add(new Worker5("봉차장"));
        registerCourse(wCourse);
        registerCourseWorker(wCourse);
        // registerCourseStudent(wCourse);  // Student 상속받는 클래스만 올 수 있는데 
                                            // Worker는 아무런 관계가 없는 클래스이므로 에러 발생
        System.out.println();
        
        Course1<Student3> sCourse = new Course1<>("학생 과정", 3);
        sCourse.add(new Student3("이순신"));
        sCourse.add(new Student3("이방원"));
        sCourse.add(new Student3("이도"));
        
        registerCourse(sCourse);
        registerCourseStudent(sCourse);
        // registerCourseWorker(sCourse);

       
                                            

        
    }

}













