package sae.cheul;

import java.util.List;
import java.util.Scanner;

public class main { //전국도서관 표준데이터 - 받아봐서 완성해보기 csv 로 내려받아보기 - 도서관 해서 - 엑셀 파일을 테이블로 옮겨보자 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryService ls =new LibraryServiceImpl();


        // 전체조회

        List<LibraryVO> brdata = ls.search();

        String fmt = "%s %s %s %s %s %s %s %s %d %d\n";
        for (LibraryVO data : brdata) {
            System.out.printf(fmt, data.getIbname(), data.getSido(),
                    data.getGugun(), data.getIbtype(), data.getClsday(),data.getAddr(),data.getPhone(),data.getHomepage(),data.getLat()
            ,data.getLon());
        }

        //도서관 찾기
        System.out.println("찾을 도서관 명을 적어주세요");
        String Ibname =sc.next();
        LibraryVO brdataOne = ls.searchOne(Ibname);
        if (brdataOne != null) System.out.println(brdataOne);















    }
}
