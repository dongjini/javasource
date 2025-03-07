package extend;

public class CreaditLineAccount extends Account {

    private int creaditLine; // 마이너스한도

    // CreaditLineAccount() {
    // super();
    // }

    public CreaditLineAccount(String ano, String owner, long balance, int creaditLine) {
        super(ano, owner, balance);
        this.creaditLine = creaditLine;
    }

    // 오버라이딩
    // 잔액 + 마이너스한도 < 사용액

    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.creaditLine < amount) {
            throw new Exception("한도 범위를 초과합니다.");
        }
        // 잔액 = 잔액 - 사용액
        super.setBalance(super.getBalance() - amount);
    }

}
