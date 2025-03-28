package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    // DML + Select
    // insert, delete, update : int 로 return
    // select : ~~DTO(where pk 지정) or List<~~DTO>

    // select * from member where name like '%홍%';
    public List<MemberDTO> getNameList(String name) {
        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();
            String sql = "select * from member where name like ? ";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));

                list.add(memberDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return list;
    }

    public List<MemberDTO> getList() {

        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();
            String sql = "select * from member";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // rs => dto 옮기기
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));

                list.add(memberDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }

        return list;
    }

    public MemberDTO getRow(String id) {

        MemberDTO memberDTO = null;

        try {
            con = getConnection();
            String sql = "select * from member where id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();
            // rs => dto 옮기기
            if (rs.next()) {
                memberDTO = new MemberDTO();
                // String name = rs.getString("name");

                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }

        return memberDTO;
    }

    // delete : 전달인자 -> pk 사용함(pk를 넘겨야함)
    public int delete(String id) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "delete from member where id =?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    // insert, update : 전달인자 ~~DTO 설정
    public int insert(MemberDTO memberDTO) {
        int result = 0;

        try {
            con = getConnection();

            String sql = "insert into member(no, id, name, addr, email, age) ";
            sql += "values(member_seq.nextval, ?, ?, ?, ?, ?)";

            pstmt = con.prepareStatement(sql);
            // 물음표 해결
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
