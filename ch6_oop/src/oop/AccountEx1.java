package oop;

import java.util.Scanner;

public class AccountEx1 {
    public static void main(String[] args) {
        Account account = new Account("100-10-0100", "홍길동", 100000);

        System.out.println(account);

        account.depoit(120000);
        System.out.println("입금 후 잔액 : " + account.balance);

        account.withdraw(200000);
        System.out.println("출금 후 잔액 : " + account.balance);

    }
}
