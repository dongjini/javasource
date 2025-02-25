package ch1;

 // main을 만들면 ㅏ래 터미널에서 확인 가능. main뒤 ()안에 이쓰널 메소드라 함.
//  byte : 8비트
//  숫자 표현 : 2의8승 = 256, 음수부터 표현 256/2 => -128 ~ 127 까지 표현 가능.

public class VarLongEx1 {
    public static void main(String[] args) { 
        // 변수 = 값에 이름을 붙여서 메인 메모리안에 어디에 저장되는지 알게 하는것.
        // 기본타입 : 정수형, 문자형, 실수형, 불린형
        // 정수형 : byte(1), short(2), int(4), long(8)
        // 문자형 : char(2)
        // 실수형 : float(4), double(8)
        // 불린형 : boolean(1)
        
        // 변수선언 : 타입 변수명 = 값;
        // 변수명 : 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다.
        // mas_speed : 데이터베이스 필드명
        //  long : L, l 둘다 가능
        long age = 15L, maxSpeed = 100L;
        long max = 256L;
        long money = 1000000000000L;

        age = 30; // 값을 선언하고 변수값을 변경할떄 앞에 타입은 사용하지 않고 변수명만 불러옴.

        // System.out.println(age); // 프린트 뒤 ln = 엔터
        // System.out.println(maxSpeed);

        // + : 산술연산 or 연결(주간에 문자가 들어가야함)
        System.out.println(money);
        System.out.println("나이 : " + age + ", 최고속도 : " + maxSpeed + ", max : " + max);
        System.out.println(age + maxSpeed + max);

    }
}

