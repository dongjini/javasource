package oop;

public class GoodsStock {
    // 속성 : code(상품코드), stockNum(재고 수량)

    String code;
    int stockNum;

    // 생성자
    // public GoodsStock() { // default 생성자.
    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    } // 무조건 초기화 함.

    // 기능 : 재고 추가한다, 재고 감소한다.

    void subStock(int num) {
        this.stockNum -= num;

    }

    void addStock(int num2) {
        this.stockNum += num2;

    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

}
