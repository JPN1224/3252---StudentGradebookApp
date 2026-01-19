//Joseph Nulty
import java.util.Scanner;

public class StudentGradebookApp {
	public static void main(String[] args) {
		double t1 = 0, t2 = 0, t3 = 0;
		Student test = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter student full name: ");
		test.setFullName(scan.nextLine());
		System.out.print("Enter course name: ");
		test.setCourseName(scan.nextLine());
		System.out.print("Enter score for Test 1: ");
		while (!scan.hasNextDouble()) {
            System.out.print("not valid number.\nEnter score for Test 1: ");
            scan.next();
        } 
		t1 = scan.nextDouble();
		System.out.print("Enter score for Test 2: ");
		while (!scan.hasNextDouble()) {
            System.out.print("not valid number.\nEnter score for Test 2: ");
            scan.next();
        } 
		t2 = scan.nextDouble();
		System.out.print("Enter score for Test 3: ");
		while (!scan.hasNextDouble()) {
            System.out.print("not valid number.\nEnter score for Test 3: ");
            scan.next();
        } 
		t3 = scan.nextDouble();
		test.setScores(t1, t2, t3);
		System.out.print(test.getStudentReport());
		scan.close();
	}
}
