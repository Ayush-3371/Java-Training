package q18;

import java.util.Scanner;

public class Q18_Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the details for registration: ");
		
		String name = s.nextLine();
		int age = s.nextInt();
		
		Registration r = new Registration();
		
		r.setName(name);
		try {
			r.setAge(age);
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("The Age is : " + r.getAge());
		System.out.println("The name is : " + r.getName());
		
		s.close();
	
	}

}
