package extend;

public class BonusPointAccount extends Account {
    // 예금액 1% 보너스포인트 지급
    private int bonusPoint;

    public BonusPointAccount(String ano, String owner, long balance, int bonusPoint) {
        super(ano, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    // 보너스포인트 = 보너스포인트 + (예금액 * 1%)
    // 예금하다 메소드 수정
    @Override
    void depoit(long amount) {
        // 예금하다
        super.depoit(amount);
        // 보너스포인트 추가
        this.bonusPoint += amount * 0.01;

    }

}
