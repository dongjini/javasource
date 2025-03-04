package oop;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자,

    // 속성 : 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-1234), //필수는 아님, 속성은
    // 없을 수 있음.
    // 이메일(hong2@gmail.com)
    String stuId;
    String neme;
    int grade;
    int classNum;
    String phone;
    String email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자를 만들어 줌
    // 클래스명(){}
    // 기본 생성자 >> 마우스 우클릭 > 소스액션 > generator constructor
    public Student() { // 괄호 안에 아무것도 없는애를 default 생성자라고 함.
    } // new를 하면 생성자가 생성됨.

    // public Student() {} 생성자 - () 안에가 개수가 달라야함.

    // 생성자 목적
    // 맴버변수 초기화
    public Student(String stuId, String neme, int grade, int classNum, String phone, String email) {
        // 멤버 변수 초기화
        this.stuId = stuId;
        this.neme = neme;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    }

    // int grade, int classNum => 지역변수(전달인자)
    public Student(int grade, int classNum) {
        this.grade = grade; // 내멤버변수 grade에 지역변수를 담아줘.
        this.classNum = classNum; // 왼쪽에 담긴 classNum과 오른쪽에 있는 classNum과 다르다.
    }

    // 기능 : 전화번호를 변경한다, 이메일을 변경한다, 반을 변경한다. 학년을 변경한다.
    // 메소드 : 리턴타입 메소드명(){} //메소드만 있는 클래스도 잇음.
    void changeTel() {

    }

    void changeEmail() {

    }

    void changeGrade() {

    }

    void changeClassNum() {

    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", neme=" + neme + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

}
