package pakage1;
import java.util.Scanner;
import pakage2.recievedata;

public class askdata {
    static Scanner scan = new Scanner(System.in);
	
	String itsFullName;
	public static int itsAge;
	int itsVoterID;
	
	public askdata (String fullName, int age, int voterID) {
		itsFullName = fullName;
		itsAge = age;
		itsVoterID = voterID;
		
	}
	
	static String scanName () {
		System.out.print("Enter your full name : ");
		String full_name = scan.nextLine();
		return full_name;
	}
	
	static int scanAge () {
		System.out.print("Enter your age : ");
		int age = scan.nextInt();
		return age;
	}
	
	static int scanVoterID () {
		System.out.print("Enter your Voter ID : ");
		int voterID = scan.nextInt();
		return voterID;
	}
	
	void printData() {
		System.out.println("\n[INFO]\nName : " + itsFullName);
		System.out.println("Age : " + itsAge);
		System.out.println("Voter ID : " + itsVoterID);
	}
	
	public static void main(String[] args) {
		String full_name = scanName(); 	//ask full name
		int age = scanAge();			//ask age
		int voter_id = scanVoterID();	//ask voter ID
		
		askdata obj = new askdata(full_name, age, voter_id);
		recievedata ob2 = new recievedata(age);
		
		obj.printData(); //Print Object Data
	}
}
