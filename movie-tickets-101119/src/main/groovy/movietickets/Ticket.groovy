package movietickets

class Ticket {
    
    static PRICE_STUDENT = 8.0
    static PRICE_GENERAL = 11.0
    static PRICE_SENIOR = 6.0
    static PRICE_CHILDREN = 5.5
    
    def price = 0.0
    
    Ticket(age, isStudent) {
        if (age < 13) price = PRICE_CHILDREN
        else if (age > 64) price = PRICE_SENIOR
             else if (isStudent) price = PRICE_STUDENT
                  else price = PRICE_GENERAL
    }
    
}