package inter;

class A {
    public void methodA(B b) { // 사용
        b.methodB();
    }
}

class B {
    public void methodB() { // 제공
        System.out.println("methodB()");
    }
}

public class InterfaceTest1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.methodA(new B());
    }
}
