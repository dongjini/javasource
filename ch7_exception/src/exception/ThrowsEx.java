package exception;

public class ThrowsEx {
    public static void main(String[] args) throws ClassNotFoundException {

        print();

    }

    static void print() throws ClassNotFoundException { // print()를 호출한 쪽에서 처리하라고 던짐.
        Class.forName("");

    }

}
