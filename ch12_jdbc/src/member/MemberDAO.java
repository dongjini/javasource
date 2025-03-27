package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import emp.EmpDTO;

public class MemberDAO {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static : 인스턴스 변수, 인스턴스 메서드 앞에 붙이면 공유(생성되는 ㅁ든 인스턴스가 같은 걸 사용)
    // 로드 시점이 가장 처음에 로드됨.

    static {
        // 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";

        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    // select, insert, update, delete 처리 메서드
    public List<EmpDTO> selectAll() {
        con = getConnection();

        String sql = "select * from emp_temp";
        List<EmpDTO> list = new ArrayList<>();
        try {

            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // rs 객체에 담긴 결과를 옮기기 => DTO
            while (rs.next()) {
                EmpDTO eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empNo"));
                eDto.setEName(rs.getString("eName"));
                eDto.setJob(rs.getString("job"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getString("hiredate"));
                eDto.setComm(rs.getInt("comm"));
                eDto.setDeptNo(rs.getInt("deptno"));
                eDto.setSal(rs.getInt("sal"));
                list.add(eDto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;

    }

    public EmpDTO select(int empNo) {
        con = getConnection();

        String sql = "select * from emp_temp where empno = ?";
        EmpDTO eDto = null;
        try {

            pstmt = con.prepareStatement(sql);
            // ?해결
            pstmt.setInt(1, empNo);
            rs = pstmt.executeQuery();

            // rs 객체에 담긴 결과를 옮기기 => DTO
            if (rs.next()) {
                eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empNo"));
                eDto.setEName(rs.getString("eName"));
                eDto.setJob(rs.getString("job"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getString("hiredate"));
                eDto.setComm(rs.getInt("comm"));
                eDto.setDeptNo(rs.getInt("deptno"));
                eDto.setSal(rs.getInt("sal"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return eDto;

    }

    public int insert(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "insert into emp_temp(empno, ENAME, JOB, MGR, HIREDATE, sal, COMM, DEPTNO) ";
            sql += "values(?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, eDto.getEmpNo());
            pstmt.setString(2, eDto.getEName());
            pstmt.setString(3, eDto.getJob());
            pstmt.setInt(4, eDto.getMgr());
            pstmt.setString(5, eDto.getHireDate());
            pstmt.setInt(6, eDto.getSal());
            pstmt.setInt(7, eDto.getComm());
            pstmt.setInt(8, eDto.getDeptNo());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(EmpDTO eDto) {
        con = getConnection();

        int result = 0;

        try {
            String sql = "update emp_temp SET sal = ? where empno = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getSal());
            pstmt.setInt(2, eDto.getEmpNo());

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int delete(int empNo) {
        con = getConnection();
        int result = 0;
        String sql = "delete from emp_temp where empno = ?";
        try {
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, empNo);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    // DML + Select
    // insert, delete, update : int 로 return
    // select : ~~DTO(where pk 지정) or List<~~DTO>

    // insert, update : 전달인자 ~~DTO 설정
    public int insert(MemberDTO memberDTO) {
        int result = 0;

        try {
            con = getConnection();

            String sql = "insert into member(id, name, addr, email, age) ";
            sql += "values(?, ?, ?, ?, ?)";

            pstmt = con.prepareStatement(sql);
            // 물음표ㅕ 해결
            pstmt.setString(1, memberDTO.getId());
            pstmt.setString(2, memberDTO.getName());
            pstmt.setString(3, memberDTO.getAddr());
            pstmt.setString(4, memberDTO.getEmail());
            pstmt.setInt(5, memberDTO.getAge());

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return result;
    }

    public int update(MemberDTO memberDTO) {
        // memberDTO
        // 1. id, addr
        // 2. id, email

        int result = 0;

        try {
            con = getConnection();
            String sql = "update member ";
            if (memberDTO.getAddr() != null) {
                sql += "set addr = ? ";
                sql += "where id =? ";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getAddr());
                pstmt.setString(2, memberDTO.getId());
            } else {
                sql += "set email = ? ";
                sql += "where id = ? ";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getEmail());
                pstmt.setString(2, memberDTO.getId());
            }

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

}
