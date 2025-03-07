package extend;

public class CheckingAccount extends Account {
    // 은행계좌 + 체크카트
    private String cardNo;

    // public CheckingAccount() {
    // // 부모의 defualt 생성자 호출
    // super();
    // }

    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance); // super -> 부모(Account)의 생성자를 불러옴.
        this.cardNo = cardNo;
    }

    // 비용 지불(체크카드 사용액) 지불
    // 사용한 카드번호와 체크카드 번호가 일치 여부 확인
    // 자액 > 사용액
    long pay(String cardNo, int amount) throws Exception {
        if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("cardNo나 잔액을 확인해 주세요"); // Exeption 발동하면 프로그램 멈춤.
        }
        // 비용 지불 : 잔액 = 잔액 - 사용액;
        withdraw(amount);
        // 잔액 반환
        return getBalance();
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

}
