package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    public void memberAllPrint(List<MemberDTO> list) {
        System.out.println("================= 회원 전체 조회 =================");
        for (MemberDTO memberDTO : list) {
            System.out.print(memberDTO.getNo() + "\t");
            System.out.print(memberDTO.getId() + "\t");
            System.out.print(memberDTO.getName() + "\t");
            System.out.print(memberDTO.getAddr() + "\t");
            System.out.print(memberDTO.getEmail() + "\t");
            System.out.print(memberDTO.getAge() + "\t");
            System.out.println();
            // memberPrint(memberDTO);
        }

    }

    // 조회 작업
    public String memberGetInfo(Scanner sc) {
        // 조회할 회원 아이디 리턴
        System.out.println("======== 회원 조회 =========");
        System.out.println("1. 아이디 조회 ");
        System.out.println("2. 이름 조회 ");
        System.out.print("번호 입력 >> ");
        int no = Integer.parseInt(sc.nextLine());

        String input = "";

        if (no == 1) {
            System.out.println("조회 회원 아이디 >>");
            input = sc.nextLine();
        } else {
            System.out.println("조회 회원 이름 >> ");
            input = sc.nextLine();
        }

        return input;
    }

    // dto 출력 메소드
    public void memberPrint(MemberDTO dto) {
        // dto 출력
        System.out.println("============ 조회한 회원 ============");
        // System.out.println(dto);
        System.out.println("번호 : " + dto.getNo());
        System.out.println("아이디 : " + dto.getId());
        System.out.println("이름 : " + dto.getName());
        System.out.println("주소 : " + dto.getAddr());
        System.out.println("이메일 : " + dto.getEmail());
        System.out.println("나이 : " + dto.getAge());

    }

    // 삭제 작업
    public String memberDeleteInfo(Scanner sc) {
        // MemberDTO memberDTO = new MemberDTO();
        System.out.println("======== 회원 삭제 ========");

        // 삭제할 회원 아이디 입력
        System.out.print("삭제할 아이디 입력 >> ");
        // memberDTO.setId(sc.nextLine());
        String id = sc.nextLine();
        // 입력받은 아이디 리턴
        return id;
    }

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

    public void printDeleteSuccessMessage(int result) {
        // result 값에 따라 입력 성공/ 입력 실패
        System.out.println(result > 0 ? "삭제성공" : "삭제실패");
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
