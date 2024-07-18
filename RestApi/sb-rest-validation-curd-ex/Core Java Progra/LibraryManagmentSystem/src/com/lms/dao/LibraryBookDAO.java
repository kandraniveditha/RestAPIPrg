package com.lms.dao;

import java.util.ArrayList;
import java.util.List;

import com.lms.pojo.Library;
public interface LibraryBookDAO {
ArrayList<Library>Library=new ArrayList<Library>();
void addLibrary();
ArrayList<Library>viewAllLibrary();
Library viewLibrary(int lid);
void updateLibrary(int lid);
void returnLibrary(int lid);


}
