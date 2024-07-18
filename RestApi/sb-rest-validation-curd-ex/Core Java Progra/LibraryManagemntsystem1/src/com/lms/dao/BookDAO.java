package com.lms.dao;
import java.util.ArrayList;
import java.util.List;

import com.lms.pojo.*;

public interface BookDAO {
	void addbookes();
    List<Book>book=new ArrayList<Book>();
    List<Book>viewallBook();
    Book viewBook(int bid);
    void updatebook(int bid);
    void issuebook(int bid);
    void returnbookes(int bid);
}
