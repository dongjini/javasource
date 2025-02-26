package condition;

public class IfTest5 {
    public static void main(String[] args) {
        // 주사위 1~6

        // 0.0 <= Math.random() < 1.0
        System.out.println(Math.random()); //실행할떄마다 랜덤값이 나오게함 범위는 정해져있음

        // ((Math.random() * 6) : 0 ~ 5 ) + 1 == 1 ~ 6
        int num = (int)(Math.random() * 6) +1;

        // num이 1이면 주사위 1번이 나와씁니다.
        if (num == 1) {
            System.out.println("주사위 1 나왔습니다.");
        } else if (num == 2) {
            System.out.println("주사위 2 나왔습니다.");
        } else if (num == 3) {
            System.out.println("주사위 3 나왔습니다.");
        } else if (num == 4) {
            System.out.println("주사위 4 나왔습니다.");
        } else if (num == 5) {
            System.out.println("주사위 5 나왔습니다.");
        } else {
            System.out.println("주사위 6 나왔습니다.");
        }

        



    }
}
