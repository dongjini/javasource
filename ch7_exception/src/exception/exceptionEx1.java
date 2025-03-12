package exception;

public class exceptionEx1 {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;

        try {

            for (int i = 0; i < 10; i++) {

                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            }

        } catch (ArithmeticException e) { // Exception 으로 막아도 됨
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) { // cach문은 여러개 올 수 있다
            System.out.println("0으로 나눌 수 없습니다.");
        }

    }
}
