package movietickets;

public class Movie {

	private float price = 0;
	private boolean isMovieDay;

	public Movie(int runtime, Day day, boolean isParquet, boolean is3d) {
		if (is3d) {
			price += 3.0;
		}
		if (runtime > 120) {
			price += 1.5;
		}
		if (day == Day.THU) {
			price -= 2.0;
			isMovieDay = true;
		}
		if (day == Day.SAT || day == Day.SUN) {
			price += 1.5;
		}
		if (!isParquet) {
			price += 2.0;
		}
	}

	public float getPrice(boolean ignoreMovieDay) {
		return ignoreMovieDay && isMovieDay ? price + 2 : price;
	}

}
