package oop;

public class Account {
    // 속성 : 계좌번호(ano), 계좌주(owner), 잔액(balance)long
    // 100-10-0100
    // 기능 : 예금하다(잔액 = 잔액+예금액), 출금하다(잔액 = 잔액 - 출금액)
    // depoit, withdraw
    // 생성자 (default, 맴버변수 3개)
    private String ano;
    private String owner;
    private long balance;

    public Account() {

    }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    void depoit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        // 인출액이 잔액보다 작으면 출금
        if (amount >= balance)
            return;
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }
}
