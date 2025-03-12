package exception;

public class NullEx1 {
    public static void main(String[] args) {

        String str = null;
        // System.out.println(str.length()); // NullPointerException -> 실행해야 앎

        Account accounts[] = new Account[5]; // -> 초기화를 안해서 account[]가 null이 뜸.

        // null 확인 후 처리하기 : NullPointException 피하기
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.getAno()); // . 앞에 있는게 null -> account
            }
        }

        // if 를 사용자하지 않는다면 널포인터가 발생할 떄 처리 필요
        try {
            for (Account account : accounts) {
                System.out.println(account.getAno()); // . 앞에 있는게 null -> account
            }

        } catch (NullPointerException e) {
            // e.printStackTrace(); --> 개발자 입장
            // System.out.println(e.getMessage());
            System.out.println("입력을 확인해 주세요"); // -> 사용자 입장
        }

    }
}
