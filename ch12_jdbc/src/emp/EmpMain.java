package emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int empNo = 0, result = 0;
        EmpDAO eDAO = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("================================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 전체조회");
            System.out.println("5. 특정사원조회");
            System.out.println("6. 종료");
            System.out.println("================================");

            System.out.println("메뉴 >> ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    eDto = insertInfo(scanner);
                    result = eDAO.insert(eDto);
                    System.out.println(result > 0 ? "입력성공" : "입력실패");
                    break;
                case 2:
                    eDto = updateInfo(scanner);
                    result = eDAO.update(eDto);
                    System.out.println(result > 0 ? "수정성공" : "수정실패");
                    break;
                case 3:
                    empNo = deleteInfo(scanner);
                    result = eDAO.delete(empNo);
                    System.out.println(result > 0 ? "삭제성공" : "삭제실패");
                    break;
                case 4:

                    List<EmpDTO> list = eDAO.selectAll();
                    empPrint(list);

                    break;
                case 5:
                    empNo = getRow(scanner);
                    eDto = eDAO.select(empNo);
                    System.out.println(eDto);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }

        }
    }

    public static void empPrint(List<EmpDTO> list) {
        System.out.println("================================================================================");
        System.out.println("사번    이름    직무    매니저번호  입사일  급여    수당    부서번호");
        System.out.println("================================================================================");
        for (EmpDTO empDTO : list) {
            System.out.print(empDTO.getEmpNo() + "\t");
            System.out.print(empDTO.getEName() + "\t");
            System.out.print(empDTO.getJob() + "\t");
            System.out.print(empDTO.getMgr() + "\t");
            System.out.print(empDTO.getHireDate() + "\t");
            System.out.print(empDTO.getSal() + "\t");
            System.out.print(empDTO.getComm() + "\t");
            System.out.print(empDTO.getDeptNo() + "\t");
            System.out.println();
        }

    }

    public static int getRow(Scanner scanner) {
        // 조회할 empno 입력받은 후 리턴
        System.out.print("조회 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static int deleteInfo(Scanner scanner) {
        // 삭제할 empno 입력 받은 후 리턴
        System.out.print("삭제 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static EmpDTO updateInfo(Scanner scanner) {
        // 수정할 empno, sal 입력 받은 후 리턴
        System.out.print("수정 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.print("변경 급여  >> ");
        int sal = Integer.parseInt(scanner.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();

        return eDto;
    }

    public static EmpDTO insertInfo(Scanner scanner) {
        // 새로운 사원 정보 입력
        System.out.print("사번 >> ");
        int empNo = Integer.parseInt(scanner.nextLine());

        System.out.print("이름 >> ");
        String eName = scanner.nextLine();

        System.out.print("직무 >> ");
        String job = scanner.nextLine();

        System.out.print("메니저번호 >> ");
        int mgr = Integer.parseInt(scanner.nextLine());

        System.out.print("입사일 >> ");
        String hireDate = scanner.nextLine();

        System.out.print("급여 >> ");
        int sal = Integer.parseInt(scanner.nextLine());

        System.out.print("수당 >> ");
        int comm = Integer.parseInt(scanner.nextLine());

        System.out.print("부서번호 >> ");
        int deptNo = Integer.parseInt(scanner.nextLine());

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(hireDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        // EmpDTO eDto = EmpDTO.builder()
        // .empNo(empNo)
        // .eName(eName)
        // .job(job)
        // .mgr(mgr)
        // .hireDate(date)
        // .sal(sal)
        // .comm(comm)
        // .deptNo(deptNo)
        // .build();
        // return eDto;
        return new EmpDTO(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
    }

}
