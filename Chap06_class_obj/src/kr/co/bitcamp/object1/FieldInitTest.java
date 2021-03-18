package kr.co.bitcamp.object1;

public class FieldInitTest {
    public static void main(String[] args) {
       
        // 붕어빵 찍기....(?)
        // 제품 생산 .....(?)
        
        // new 연산자 : 클래스에 있는 멤버들의 byte 크기만큼
        //            heap(힙)에다가 메모리 할당하며 동시에 초기화를 시켜주는 역할을 함.
        
        // this : 객체자신의 주소값을 가짐
        // super : object를 가리키는 키워드. 조상객체의 주소를 담고있음.
        
        
        FieldInit fInit = new FieldInit(); // new 다음 나오는 FieldInit = 생성자
        System.out.println(fInit.byteField);
        System.out.println(fInit.shortField);
        System.out.println(fInit.intField);
        System.out.println(fInit.longField);
        System.out.println(fInit.booleanField);
        System.out.println(fInit.charField);
        System.out.println(fInit.floatField);
        System.out.println(fInit.doubleField);        
        System.out.println(fInit.arrField);
        System.out.println(fInit.strField);

        System.out.println(fInit); // 매개변수를 썼으나 실상은 Object의 .toString()이 콜이 되는 형태임.
        System.out.println(fInit.toString());
        
    }

}
