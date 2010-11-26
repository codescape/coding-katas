package movietickets;

import static org.junit.Assert.*;
import static movietickets.MovieTicketsTests.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CustomizedPersonWithStandardMovie.class,
		CustomizedMovieWithSinglePerson.class,
		MultiplePersonsWithStandardMovie.class,
		MultiplePersonsWithCustomizedMovie.class })
public class MovieTicketsTests {

	public static class CustomizedPersonWithStandardMovie {

		private MovieTickets movieTickets;

		@Before
		public void before() {
			movieTickets = new MovieTickets();
			movieTickets.startPurchase(110, Day.MON, true, false);
		}

		@Test
		public void matureShouldPay11DollarsForStandardMovie() {
			movieTickets.addTicket(25, false);
			assertEquals(11.0, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void studentShouldPay9DollarsForStandardMovie() {
			movieTickets.addTicket(25, true);
			assertEquals(9.0, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void childShouldPay5Dollars50CentForStandardMovie() {
			movieTickets.addTicket(12, true);
			assertEquals(5.5, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void seniorShouldPay6DollarsForStandardMovie() {
			movieTickets.addTicket(65, true);
			assertEquals(6.0, movieTickets.finishPurchase(), 0);
		}

	}

	public static class CustomizedMovieWithSinglePerson {

		private MovieTickets movieTickets;

		@Before
		public void before() {
			movieTickets = new MovieTickets();
		}

		@Test
		public void matureShouldPay14DollarsFor3DMovie() {
			movieTickets.startPurchase(110, Day.MON, true, true);
			movieTickets.addTicket(25, false);
			assertEquals(14.0, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void matureShouldPay12Dollars50CentForOverlengthMovie() {
			movieTickets.startPurchase(130, Day.MON, true, false);
			movieTickets.addTicket(25, false);
			assertEquals(12.5, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void matureShouldPay9DollarsForMovieOnMovieDay() {
			movieTickets.startPurchase(110, Day.THU, true, false);
			movieTickets.addTicket(25, false);
			assertEquals(9.0, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void matureShouldPay12Dollars50CentForMovieOnSaturday() {
			movieTickets.startPurchase(110, Day.SAT, true, false);
			movieTickets.addTicket(25, false);
			assertEquals(12.5, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void matureShouldPay12Dollars50CentForMovieOnSunday() {
			movieTickets.startPurchase(110, Day.SUN, true, false);
			movieTickets.addTicket(25, false);
			assertEquals(12.5, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void matureShouldPay13DollarsForMovieOnLoge() {
			movieTickets.startPurchase(110, Day.MON, false, false);
			movieTickets.addTicket(25, false);
			assertEquals(13.0, movieTickets.finishPurchase(), 0);
		}

	}

	public static class MultiplePersonsWithStandardMovie {

		private MovieTickets movieTickets;

		@Before
		public void before() {
			movieTickets = new MovieTickets();
			movieTickets.startPurchase(90, Day.MON, true, false);
		}

		@Test
		public void twoMaturesShouldPay22DollarsForStandardMovie() {
			movieTickets.addTicket(25, false);
			movieTickets.addTicket(25, false);
			assertEquals(22.0, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void twentyMaturesShouldPay120DollarsForStandardMovie() {
			for (int i = 0; i < 20; i++) {
				movieTickets.addTicket(25, false);
			}
			assertEquals(120.0, movieTickets.finishPurchase(), 0);
		}

		@Test
		public void twentyChildrenShouldPay110DollarsForStandardMovie() {
			for (int i = 0; i < 20; i++) {
				movieTickets.addTicket(12, false);
			}
			assertEquals(110.0, movieTickets.finishPurchase(), 0);
		}

	}

	public static class MultiplePersonsWithCustomizedMovie {

		private MovieTickets movieTickets;

		@Before
		public void before() {
			movieTickets = new MovieTickets();
		}

		@Test
		public void twentyMaturesShouldPay220DollarsForStandardMovieOnMovieDay() {
			movieTickets.startPurchase(90, Day.THU, true, false);
			for (int i = 0; i < 20; i++) {
				movieTickets.addTicket(25, false);
			}			
			assertEquals(120.0, movieTickets.finishPurchase(), 0);
		}

	}

}
