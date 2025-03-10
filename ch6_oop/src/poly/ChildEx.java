package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child();
        // 오버라이딩 된 메소드가 있다면 오버라이딩 된 (자식)메소드가 먼저 나온다.

        // child1.method1();
        // child1.method2();
        // child1.method3();

        // parent 저븐 범위
        // parent.field1;
        parent.method1(); // parent method1()
        parent.method2(); // Child method2()

        // The method method3() is undefined for the type Parent
        // parent.method3();

        // method3 사용
        // 부모 = 자식(강제 형변환 o)
        Child child2 = (Child) parent; // 강제 형변환 (캐스팅)
        child2.method3();

        // java.lang.ClassCastException: class poly.Parent cannot be cast to class
        // poly.Child
        // 자식 = 부모(강제 형변환 x)
        Parent parent2 = new Parent();
        child2 = (Child) parent2; // 생성된게 부모라 강제형변환 안됨.
        child2.method3();

    }
}
