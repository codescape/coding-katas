package movietickets;

import java.util.ArrayList;
import java.util.List;

public class MovieTickets {

	private Movie movie;
	private List<Ticket> tickets = new ArrayList<Ticket>();

	public void startPurchase(int runtime, Day day, boolean isParquet,
			boolean is3D) {
		movie = new Movie(runtime, day, isParquet, is3D);
	}

	public void addTicket(int age, boolean isStudent) {
		tickets.add(new Ticket(age, isStudent));
	}

	public float finishPurchase() {
		float price = 0;
		if (tickets.size() >= 20) {
			price = Math.min(getPriceAsGroup(), getPriceAsIndividuals());
		} else {
			price = getPriceAsIndividuals();
		}
		return price;
	}

	private float getPriceAsIndividuals() {
		float price = 0;
		for (Ticket ticket : tickets) {
			price += ticket.getPrice() + movie.getPrice(false);
		}
		return price;
	}

	private float getPriceAsGroup() {
		float price = 0;
		for (int i = 0; i < tickets.size(); i++) {
			price += 6.0 + movie.getPrice(true);
		}
		return price;
	}

}
