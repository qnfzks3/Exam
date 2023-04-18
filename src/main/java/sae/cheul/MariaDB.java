package sae.cheul;

import java.sql.*;

public class MariaDB {
    private static final String DRV = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://fullstacks.cdxqxdvfxgja.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";//"jdbc:mariadb://아마존 주소:3306/fullstacks"
    private static final String USR = "admin";
    private static final String PWD = "fullstack_2023";

    //데이터베이스 접속 객체 생성
    public static Connection makeConn(){
        Connection conn= null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USR,PWD);
        } catch (ClassNotFoundException e) {
            System.out.println(" db접속 드라이버 오류");
        }catch (SQLException e) {
            System.out.println("DB 접속주소나 아이디/비번, sql 명령문을 확인해주세요!");
        }
        return conn;
    }

    //데이터베이스 접속 객체 해제
    public static void closeConn(ResultSet rs, PreparedStatement pstmt , Connection conn){

        if (rs !=null) try { rs.close();}catch (Exception ex){}
        if (pstmt !=null) try { conn.close();}catch (Exception ex){}
        if (conn !=null) try { conn.close();}catch (Exception ex){}



    }

}
