package movietickets

import static movietickets.Day.*
import org.junit.Test
import org.junit.Before

class MovieTicketsTests {

    static MOVIE_DEFAULT = [89, MONDAY, true, false]
    static MOVIE_OVERTIME = [130, MONDAY, true, false]
    static MOVIE_MOVIEDAY = [89, THURSDAY, true, false]
    static MOVIE_LOGE = [89, MONDAY, false, false]
    static MOVIE_3D = [120, MONDAY, true, true]
    
    static PERSON_MATURE = [30, false]
    static PERSON_STUDENT = [21, true]
    static PERSON_SENIOR = [65, false]
    static PERSON_CHILD = [12, false]

    def tickets
    
    @Before
    public void before() {
        tickets = new MovieTickets()
    }

    @Test
    public void maturesShouldBeCharged11DollarsForDefaultMovie() {
        tickets.startPurchase MOVIE_DEFAULT
        tickets.addTicket PERSON_MATURE
        assert tickets.finishPurchase() == 11.0
    }
    
    @Test
    public void studentsShouldBeCharged8DollarsForDefaultMovie() {
        tickets.startPurchase MOVIE_DEFAULT
        tickets.addTicket PERSON_STUDENT
        assert tickets.finishPurchase() == 8.0
    }
    
    @Test
    public void seniorsShouldBeCharged6DollarsForDefaultMovie() {
        tickets.startPurchase MOVIE_DEFAULT
        tickets.addTicket PERSON_SENIOR
        assert tickets.finishPurchase() == 6.0
    }
    
    @Test
    public void childrenShouldBeCharged5DollarsAnd50CentForDefaultMovie() {
        tickets.startPurchase MOVIE_DEFAULT
        tickets.addTicket PERSON_CHILD
        assert tickets.finishPurchase() == 5.5
    }
    
    @Test
    public void maturesShouldBeCharged12Dollars50CentForDefaultMovieWithOvertime() {
        tickets.startPurchase MOVIE_OVERTIME
        tickets.addTicket PERSON_MATURE
        assert tickets.finishPurchase() == 12.5
    }
    
    @Test
    public void maturesShouldBeCharged9DollarsForDefaultMovieOnMovieday() {
        tickets.startPurchase MOVIE_MOVIEDAY
        tickets.addTicket PERSON_MATURE
        assert tickets.finishPurchase() == 9.0
    }
    
    @Test
    public void maturesShouldBeCharged13DollarsForDefaultMovieOnLoge() {
        tickets.startPurchase MOVIE_LOGE
        tickets.addTicket PERSON_MATURE
        assert tickets.finishPurchase() == 13.0
    }
    
    @Test
    public void maturesShouldBeCharged14DollarsForDefaultMovieIn3D() {
        tickets.startPurchase MOVIE_3D
        tickets.addTicket PERSON_MATURE
        assert tickets.finishPurchase() == 14.0
    }
    
    @Test
    public void twoMaturesShouldBeCharged22DollarsForDefaultMovie() {
        tickets.startPurchase MOVIE_DEFAULT
        2.times { tickets.addTicket PERSON_MATURE }
        assert tickets.finishPurchase() == 22.0
    }
    
}