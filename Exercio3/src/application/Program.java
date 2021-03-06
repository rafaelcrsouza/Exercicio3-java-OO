package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();		
		
		System.out.println("Entrada: ");
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		System.out.println();
		System.out.println("FINAL GRADE = " + student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FALEID");
			System.out.printf("MISSING %.2f " , student.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
