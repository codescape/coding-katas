package movietickets;

public class Ticket {

	private float price;

	public Ticket(int age, boolean isStudent) {
		if (age < 13) {
			price = 5.5f;
		} else if (age > 64) {
			price = 6.0f;
		} else if (isStudent) {
			price = 9;
		} else {
			price = 11;
		}
	}

	public float getPrice() {
		return price;
	}

}
