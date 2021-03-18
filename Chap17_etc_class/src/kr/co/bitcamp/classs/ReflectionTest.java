package kr.co.bitcamp.classs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class ReflectionTest {
    // Reflection : 생성자, 필드, 메서드의 정보를 보는 것.

    public static void main(String[] args) throws Exception {
        Class class1 = Class.forName("java.lang.String");
        
        
        // 생성자 정보 출력
        System.out.println("[생성자 정보]");
        Constructor[] constructors = class1.getDeclaredConstructors(); // 리턴타입 : constructor[]
        
        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName()/*생성자이름..?*/ + "(" /*매개변수의 타입이 출력*/);
            // 생성자의 매개변수의 타입 정보 얻어야함.
            Class[] param = constructor.getParameterTypes(); // []타입으로 리턴이 됨.
            for(int i=0; i<param.length; i++) {
                System.out.print(param[i].getSimpleName());// 한 생성자의 매개변수가 옆으로 나열되야 하기 때문에 print사용
                if(i<(param.length-1)) {
                    System.out.print(", "); // 매개변수 출력되고 , 매개변수 , 이렇게 됨...
                }
            }
            System.out.println(")");
        }
        System.out.println();
        
        // 필드정보를 표시
        Field[] fields = class1.getDeclaredFields();
        System.out.println("[필드 정보]");
        
        for(Field field : fields) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
        
        System.out.println();
        
        System.out.println("[메서드 정보]");       
        Method[] methods = class1.getDeclaredMethods();
        for(Method method : methods) {
            System.out.print(method.getReturnType().getSimpleName() + " "); // 메서드는 리턴타입도 표시해야함
            System.out.print(method.getName() + "(");
            // 매개변수 내용 출력 - 매개변수가 여러개 있을 수 있기 때문에 Class[]타입으로 받음
            Class[] class2 = method.getParameterTypes();
            for(int i=0; i<class2.length; i++) {
                System.out.print(class2[i].getSimpleName());
                if(i<(class2.length-1)) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
        
        

    }

}










