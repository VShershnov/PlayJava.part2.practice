package part2.practice.P21;

import java.util.Scanner;

public class StudentReader {
	public Scanner sc;
	
	StudentReader(){
		sc = new Scanner(System.in);
	}
	
	public Student readStudent() {
		String studentName;
		String studentAddress;
		double studentAvrGrade;
		
		System.out.println("Введіть студента..");
		System.out.println("Імя: ");
		studentName = sc.next();
		
		System.out.println("Адреса: ");
		studentAddress = sc.next();
		
		System.out.println("Середній бал: ");
		studentAvrGrade = sc.nextDouble();
		
		return new Student(studentName, studentAddress, studentAvrGrade);
	}
}
