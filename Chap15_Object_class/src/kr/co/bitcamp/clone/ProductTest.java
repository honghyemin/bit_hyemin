package kr.co.bitcamp.clone;

public class ProductTest {

    public static void main(String[] args) {
        
        Product original = new Product("1004", "TV", 300, new int[] {10,20});
        Product cloned = original.getProduct(); // 얕은 복제에 의해 original 옆에 만들어짐.
                                                // => 얕은 복제를 한 객체를 리턴
        
        System.out.println(original);
        System.out.println();
        System.out.println(cloned);
        
        System.out.println("-----=-=-=-=======-=-----------=-==========");
        int[] arr1 = cloned.getArr();
        int[] arr2 = original.getArr();
        System.out.println("배열 주소(복제 객체) : " + arr1);
        System.out.println("배열 주소(원본 객체) : " + arr2);
        System.out.println();
        
        arr1[0] = 777;
        
        System.out.println(original);
        System.out.println();
        System.out.println(cloned);
    }

}
