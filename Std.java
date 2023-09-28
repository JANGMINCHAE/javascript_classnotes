package week4_temp;

import java.util.Scanner;

class Student{
	public String name;
	public int age;
	private String rollno;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Student 객체가 생성되었습니다.");
	}

	
	 public String getRollno() { return rollno; }
	  
	 public void setRollno(String rollno) { this.rollno = rollno; }

	
}

public class Std {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름: ");
		String name = sc.next();
		System.out.print("학생의 학번: ");
		String rollno = sc.next();
		System.out.print("학생의 나이: ");
		int age = sc.nextInt();
		
		Student std = new Student(name, age);
		std.setRollno(rollno);
	}
}
