package member;

import java.util.Scanner;

public class ConsoleUtil {

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======== 회원정보 입력화면 ========");
        System.out.println("아이디 >> ");
        // String id = sc.nextLine();
        memberDTO.setId(sc.nextLine());
        System.out.println("이름 >> ");
        // String name = sc.nextLine();
        memberDTO.setName(sc.nextLine());
        System.out.println("주소 >> ");
        // String addr = sc.nextLine();
        memberDTO.setAddr(sc.nextLine());
        System.out.println("이메일 >> ");
        // String email = sc.nextLine();
        memberDTO.setEmail(sc.nextLine());
        System.out.println("나이 >> ");
        // int age = Integer.parseInt(sc.nextLine());
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        // return new MemberDTO(id, name, addr, email, age);
        return memberDTO;
    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {
        // result 값에 따라 입력 성공/ 입력 실패
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    // 업데이트 성공시 출력 메소드
    public void printUpdateSuccessMessage(int result, String id) {
        // result 값에 따라 수정 성공/ 수정 실패
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다." : id + "님의 정보 수정에 실패하였습니다.");
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("======== 회원정보 수정 ========");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("===============================");
        System.out.println("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        if (no == 1) {
            return memberUpdateAddr(sc);
        } else if (no == 2) {
            return memberUpdateEmail(sc);
        }
        // no == 1 -> memeberUpdateAddr
        // no == 2 -> memeberUpdateEmail

        // 리턴받은 DTO를 리턴
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력(id, addr) ==> DTO에 담은 후 리턴
        System.out.println("======== 수정정보 입력 ========");
        System.out.println("id 입력 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.println("수정할 addr 입력 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력 (id, email) ==> DTO에 담은 후 리턴
        System.out.println("======== 수정정보 입력 ========");
        System.out.println("id 입력 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.println("수정할 email 입력 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }

}
