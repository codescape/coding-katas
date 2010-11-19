package movietickets

class MovieTickets {
   
    def movie
    def tickets = []
   
    void startPurchase(int runtime, Day day, boolean isParquet, boolean is3D) {
        movie = new Movie(runtime, day, isParquet, is3D)
    } 

    void addTicket(int age, boolean isStudent) {
        tickets << new Ticket(age, isStudent)
    }

    float finishPurchase() {
        def sum
        if (isGroup()) 
            sum = tickets.sum { 6 }
        else
            sum = tickets.sum { it.price }
        sum + movie.calculate(isGroup()) * tickets.size
    }
    
    def isGroup() {
        tickets.size >= 20
    }
    
}