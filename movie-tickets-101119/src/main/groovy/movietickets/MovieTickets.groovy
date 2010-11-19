package movietickets

class MovieTickets {
   
    static GROUP_SIZE = 20
    static GROUP_PRICE = 6.0
   
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
            sum = [tickets.sum { GROUP_PRICE }, tickets.sum { it.price }].min()
        else
            sum = tickets.sum { it.price }
        sum + movie.calculate(isGroup()) * tickets.size
    }
    
    def isGroup() {
        tickets.size >= GROUP_SIZE
    }
    
}