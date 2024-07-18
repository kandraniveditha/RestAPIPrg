package com.sms.dao;

import java.util.ArrayList;
import java.util.List;
import com.sms.pojo.Student;
public interface StudentDAO {

	List<Student> Student = new ArrayList<Student>();
    void addstudents();
  List<Student> viewAllStudent();
 Student viewStudent(int sid);
 void updateStudent(int sid);
}
