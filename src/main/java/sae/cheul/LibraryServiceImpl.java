package sae.cheul;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {

    private String selectSQL = "select * from library order by Ibname desc";
    private String selectOneSQL = "select * from library where Ibname =? ";

    @Override
    public void insert() {

    }

    @Override
    public List<LibraryVO> search() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<LibraryVO> librarydata = new ArrayList<>();

        try{
            conn = MariaDB.makeConn();
            pstmt = conn.prepareStatement(selectSQL);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                LibraryVO library = new LibraryVO(
                        rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8),
                        rs.getInt(9),rs.getInt(10));
                librarydata.add(library);
            }

        }catch (Exception ex){
            System.out.println("search에서 오류발생!!");
            System.out.println(ex.getMessage());

        }finally {
            MariaDB.closeConn(rs, pstmt, conn);
        }

        return librarydata;
    }

    @Override
    public LibraryVO searchOne(String Ibname) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        LibraryVO library = null;

        List<LibraryVO> librarydata = new ArrayList<>();


        try {
            conn = MariaDB.makeConn();
            pstmt = conn.prepareStatement(selectOneSQL);
            pstmt.setString(1,Ibname);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                library = new LibraryVO(
                        rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
                        rs.getInt(9), rs.getInt(10));

            }
        } catch (Exception ex) {
            System.out.println("searchOne에서 오류발생!!");
            System.out.println(ex.getMessage());
        } finally {
            MariaDB.closeConn(rs, pstmt, conn);
        }
        return library;
    }


    @Override
    public void modify() {
    }

    @Override
    public void delete() {
    }


}
