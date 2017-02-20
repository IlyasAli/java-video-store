import java.util.Scanner;

public class VideoStoreApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		RentalStatement statement = new RentalStatement();

		System.out.println("Welcome To Movie Palace, How Many I Help You ?.");
		System.out
				.println("Would You Like To See A List Of Our 3 Movies Lol ?" + "\nPlease enter\n \t1 - Yes\n\t2 - No");

		System.out.println("\n \t1 Home Alone = Regular\n \t2 Cars = ChildernsMovie\n \t3 Switch = NewRelease ");
		int userChoice = scanner.nextInt();
		if (userChoice == 1) {
			int userChoice1 = scanner.nextInt();
		}

		
		System.out.println(
				"What Type Of Movie Do You Want To Rent Out ? " + "\n \t1 Regular\n \t2 Childerns\n \t3 NewRelease\n");

		System.out.println("How Many Days Would You Like To Rent This Movie ?");
		int days = scanner.nextInt();

		Movie regular = new RegularMovie("Home Alone");
		Movie childrens = new ChildrensMovie("Cars");
		Movie newRelease = new NewReleaseMovie("Switch");

		Rental regualarMovie = new Rental(regular, days);
		Rental childrensMovie = new Rental(childrens, days);
		Rental newReleaseMovie = new Rental(newRelease, days);



		System.out.println("Would Like To Rent Anything Else ?" + "\nPlease enter\n \t1 - Yes\n\t2 - No");
		int userChoice1 = scanner.nextInt();

		if (userChoice1 == 1) {

			try {
				RentalStatement statement1 = null;
			} catch (Exception e) {
				e.printStackTrace();
			
				statement.print();
				System.out.println("Here Is Your Total For Your Rental, And You Will Have It For" + days + "days");
				System.out.print("Thank You Come Again !!!");
			}

		} else
			System.out.println("Thank You Come Again !");

		scanner.close();

	}

}