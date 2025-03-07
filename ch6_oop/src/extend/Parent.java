package extend;

// 상속 (isa 관계)

// 기존의 클래스를 재사용하여 새로운 클래스 작성
// 장점
// 적은 양의 코드로 새로운 클래스 작성 가능
// 코드를 공통적으로 관리 => 코드의 추가 및 변경 용이
// 단일 상속만 허용
// class Child extends Parent, Tv -> 이렇게 사용 불가

// Object 클래스 - 모든 클래스의 조상
// 자동적으로 무조건 Object 클래스를 상속받음

// 조상 클래스 : 부모, super, 상위, 기반(base) 클래스
// 자손 클래스 : 자식, sub, 하위, 파생(derived) 클래스
// 형제 개념은 없음, 부모 자시 관계만 있음.
public class Parent {
    // 관계 : has a, is a
    int age;

}
