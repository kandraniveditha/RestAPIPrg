package com.sms.details;

import java.util.List;
import java.util.Scanner;

import com.sms.pojo.Student;
import com.sms.studentdaoImp.StudentDAOImp;

public class StudentDetails {
	 Scanner sc=new Scanner(System.in);
	    StudentDAOImp pp=new StudentDAOImp();
   public void stuMenu() {
	        System.out.println("--------------");
	        
	        System.out.println("  1) AddStudent      ");
	        System.out.println("  2) ViweAllStudent      ");
	        System.out.println("  3) ViewStudent      ");
	        System.out.println("  4) UpdateStudent      ");
	        System.out.println("  5) back      ");
	        System.out.println(" -------------------   ");

	        System.out.println("  enter the choice      ");
	        int choice=sc.nextInt();
	        switch(choice) {
	        case 1:
	        case 2:
	            pp.addStudent();
	            stuMenu();
	            break;
	        case 3:
	            List<Student>viewAllStudent=pp.viewAllStudent();
	        if(viewAllStudent.size()!=0) {
	            for(Student stu:viewAllStudent) {
	                System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSreg());
	            }
	        }
	        else 
	            System.out.println("record is empty");
	        stuMenu();
	        break;

	        case 4:
	            System.out.println("enter the student id:");
	            Student stu=pp.viewStudent(sc.nextInt());
	            if(stu!=null) 
	            {
	    System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSreg());

	 

	            }
	            else
	                System.out.println("given record is not exist");
	            stuMenu();
	            break;
	        case 5:
	            System.out.println("enter student id:");
	            pp.updateStudent(sc.nextInt());
	            stuMenu();
	            break;

	            default:
	                System.out.println("choose 1 to 6 between");
	        }
	    }

	 
}
