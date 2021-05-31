package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Student[] students) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].ten = sc.next();
			students[i].old = sc.nextInt();
			students[i].diaChi = sc.next();
			students[i].sdt = sc.next();
			students[i].diemTrungBinh = sc.nextDouble();
		}
	}
	static void print(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].ten +" "+ students[i].old +" "+ students[i].diaChi +" "+ students[i].sdt +" "+ students[i].diemTrungBinh);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student[] students = new Student[10];
    input(students);
    print(students);
	}
}
