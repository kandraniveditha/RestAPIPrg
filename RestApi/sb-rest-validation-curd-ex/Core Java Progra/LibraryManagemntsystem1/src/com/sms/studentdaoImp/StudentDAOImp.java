package com.sms.studentdaoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sms.pojo.Student;

public class StudentDAOImp {
	 Scanner sc = new Scanner(System.in);
	    List<Student> addStudents = new ArrayList<Student>();

	 

	    public void addStudent() {
	        // TODO Auto-generated method stub
	        int k = 1;
	        while (k == 1) {
	            System.out.println("enter Student Number");
	            int sid = sc.nextInt();
	            System.out.println("enter student name");
	            String sname = sc.next();
	            System.out.println("enter student register");
	            String sreg = sc.next();
	            Student stu=new Student(sid,sname,sreg);
	            addStudents.add(stu);
	            System.out.println("student record added suceefully");

	            System.out.println("do u want to add one more record press 1) yes  2)no");
	            k = sc.nextInt();
	        }

	    }
	    public List<Student> viewAllStudent() {
	        // TODO Auto-generated method stub
	        return addStudents;
	    }

	 

	    public Student viewStudent(int sid) {
	        // TODO Auto-generated method stub
               if (addStudents.size() != 0)
	            for (Student stu : addStudents) {
	                if (stu.getSid() == sid) {
	                    return stu;
	                }
	            }
	        return null;

	    }
 public void updateStudent(int sname) {
	        int k=0;
	        if (addStudents.size() != 0) {
	            for (Student stu : addStudents) {
	                if (stu.getSid() == sname) {
	                    ++k;
	                    System.out.println("do u want update student recor 1)sid 2)sreg");
	                    System.out.println("enter the choice");
	                    int choice = sc.nextInt();
	                    switch (choice) {
	                    case 1:
	                        System.out.println("enter the update student reg");
	                        int sid = sc.nextInt();
	                        stu.setSid(sid);
	                        System.out.println("student name is updated succefully ");
	                        break;
	                    case 2:
	                        System.out.println("enter the update student registration num");
	                        String sreg = sc.next();
	                        stu.setSreg(sreg);
	                        System.out.println("student register is updated succefully ");
	                        break;
	                    default:
	                        System.out.println("choose 1 to 2 between");

	 

	                    }
	                }
	            }
	        }else 
	            System.out.println("record is empty");
	        if(k==0)System.out.println("given recor is not exixt ");
	    }
	        // TODO Auto-generated method stub
	   
	 

	    }

