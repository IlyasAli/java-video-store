import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {
	Collection<Rental> rentals = new ArrayList<Rental>();

	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}

	public void print() {

		for (Rental rental : rentals) {

			System.out.println("priceCode is " + rental.getPriceCode() + " Title " + rental.getTitle() + " Fees "
					+ rental.calculateFees());

		}

	}

}
