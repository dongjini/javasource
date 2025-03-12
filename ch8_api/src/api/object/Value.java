package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Value v = (Value) obj;

        return this.value == v.value;
    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]"; // int 값인 value를 String으로 바꾸는 방법 : 문자열 하나 더한다.
    }

    // toString() : 멤버 변수 값 출력 용도로 재정의

    // @Override
    // public String toString() {
    // return value + " "; // int 값인 value를 String으로 바꾸는 방법 : 문자열 하나 더한다.
    // }

}
