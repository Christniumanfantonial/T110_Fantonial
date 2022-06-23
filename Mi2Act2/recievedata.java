package pakage2;
import pakage1.askdata;

public class recievedata {

	public recievedata (int age) {
		if (age < 18) {
			System.out.println("\nYou are not eligible for voting!");
		} else {
			System.out.println("\nYou are eligible for voting!, Have a great Day!");
		}
	}

}
