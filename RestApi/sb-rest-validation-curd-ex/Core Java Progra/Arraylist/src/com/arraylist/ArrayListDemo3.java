package com.arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stu=new Student(101,"Nive","Bng");
Student stu1=new Student(102,"kandra","tmk");
Student stu2=new Student(103,"devi","Pvg");
Student stu3=new Student(104,"Nani","Gng");
Student stu4=new Student(105,"Reddy","Mys");


ArrayList<Student>addrecords=new ArrayList<Student>();
addrecords.add(stu);
addrecords.add(stu1);
addrecords.add(stu2);
addrecords.add(stu3);
addrecords.add(stu4);

for(Student s:addrecords) {
	System.out.println(s.getSno() + "\t" + s.getSname() +"\t"+s.getSadd());
}

System.out.println("Display Specific Record");
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student Number:");
int no=sc.nextInt();

int k=0;
for(Student s:addrecords) {
	if(s.getSno()==no) {
		++k;
		System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());
	}
}
if(k==0) {
	System.out.println("Given record is not Exists");
}
	}

}
