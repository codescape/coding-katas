package movietickets

class MovieTickets {
   
    def movie
    def ticket
   
    void startPurchase(int runtime, Day day, boolean isParquet, boolean is3D) {
        movie = new Movie(runtime, day, isParquet, is3D)
    } 

    void addTicket(int age, boolean isStudent) {
        ticket = new Ticket(age, isStudent)
    }

    float finishPurchase() {
        ticket.price + movie.price
    }
    
}