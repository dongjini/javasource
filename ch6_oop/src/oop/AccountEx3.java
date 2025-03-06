package oop;

import java.util.Scanner;

public class AccountEx3 {

    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------------------------------------");

            System.out.print("선택 >>  ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    depoit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("번호 확인");
                    break;
            }

        }

    }

    private static void createAccount() {
        // 계좌번호
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        // 계좌주
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        // 잔액
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        // for : account[i] 첫번쨰 만나는 null이면
        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("---------------------------------------------------------");
        System.out.println("계좌 목록");
        System.out.println("---------------------------------------------------------");

        // 배열 출력
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null) {
        // System.out.printf("계좌 번호 : %s\t 계좌주 : %s\t 잔액 : %d\n", account[i].getAno(),
        // account[i].getOwner(),
        // account[i].getBalance());
        // }
        // }

        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("계좌 번호 : %s\t 계좌주 : %s\t 잔액 : %d\n", acc.getAno(), acc.getOwner(),
                        acc.getBalance());
            }
        }

    }

    private static void depoit() {
        // 예금하다
        // 계좌번호 입력받기 => 사용자가 입력한 계좌번호와 account의 계좌번호 일치 여부 확인
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();

        System.out.print("입금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account findAcc = findAccount(ano);
        // findAcc 가 널일 떄 메서드에 접금하면 NullpointerException 발생
        if (findAcc != null) {
            findAcc.depoit(balance);
        }
    }

    private static void withdraw() {
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();

        System.out.print("출금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account findAcc = findAccount(ano);
        if (findAcc != null)
            findAcc.withdraw(balance);
    }

    private static Account findAccount(String ano) {
        // 입력값 ano 와 account 배열 계좌 중에서 일치하는 계좌 찾기

        // 내풀이
        // int i;
        // for (i = 0; i < account.length; i++) {
        // // 널이 아니여야 하고 account[i].getAno() == ano break;
        // // return account[i]
        // if (account[i] != null && account[i].getAno().equals(ano)) {
        // break;
        // }
        // }
        // return account[i];

        // 강사님 풀이 1
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null)
        // if(account[i].getAno().equals(ano)){
        // return account[i];
        // // break;
        // }

        // }

        // 강사님풀이 2
        Account acc = null;
        for (int i = 0; i < account.length; i++) {
            if (account[i] != null)
                if (account[i].getAno().equals(ano)) {
                    acc = account[i];
                    break;
                }

        }

        return acc;
    }

}
