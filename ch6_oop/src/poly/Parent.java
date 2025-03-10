package poly;

public class Parent {
    String field1;

    public void method1() {
        System.out.println("parent method1()");
    }

    public void method2() {
        System.out.println("parent method2()");
    }

}

class Child extends Parent {
    String field2;

    @Override // 오버라이딩 된 메소드가 있다면 오버라이딩 된 (자식)메소드가 먼저 나온다.
    public void method2() {
        System.out.println("Child method2()");
    }

    public void method3() {
        System.out.println("parent method3()");
    }
}
