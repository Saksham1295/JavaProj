package System;
import java.util.Scanner;
public class Takedata {
int id;
String loan;
//String acc;
	Takedata() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Bank id");
	id = sc.nextInt();
	System.out.println("Enter Loan type");
	loan = sc.nextLine();
}
}
