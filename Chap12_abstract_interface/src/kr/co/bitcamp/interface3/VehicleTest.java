package kr.co.bitcamp.interface3;

//import jdk.tools.jlink.internal.DirArchive;

public class VehicleTest {

    public static void main(String[] args) {
        
        // 객체를 생성해야 메서드를 사용할 수 있음
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        
        bus.setSpeed(-99);
        bus.setSpeed(80);
        driver.dirve(bus); // 직접 객체를 생성하여 참조변수(주소)로 넘김
        driver.stop(bus);
        System.out.println();
        
        taxi.setSpeed(-23);
        taxi.setSpeed(100);
        driver.dirve(taxi);
        driver.stop(taxi);
        System.out.println();
        
        // 직접 객체를 매개변수로 생성하여 파라미터로 넘기는 방법
        driver.dirve(new Taxi());
        driver.dirve(new Bus());
        // driver.drive(new AICar()); -> 사용불가
        System.out.println();
        
        Vehiclable vehiclable = driver.newCarMethod(taxi);
        vehiclable.run();
        vehiclable.stop();
        System.out.println();
        
        vehiclable = driver.newCarMethod(bus);
        vehiclable.run();
        vehiclable.stop();
        

        
            

    }

}


















