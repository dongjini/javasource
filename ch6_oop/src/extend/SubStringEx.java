package extend;

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString(); // 부모 인스턴스 생성 >> 자식 인스턴스 생성

        System.out.println("이름" + obj.name); // 본인 멤버 변수가 부모것 보다 우선됨
        obj.list(); // '성춘향 하위 클래스 이름' 출력을 원한다면?

    }
}
