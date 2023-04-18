package sae.cheul;

import java.util.List;

public interface LibraryService {

    void insert();
    List<LibraryVO> search();
    LibraryVO searchOne(String Ibname);
    void modify();
    void delete();



}
