package exception;

public class CheckdEx1 {
    public static void main(String[] args) {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            // 개발자 기준 - 예외의 발생원인 보기 (StackTrace)
            e.printStackTrace();
        }
    }
}
