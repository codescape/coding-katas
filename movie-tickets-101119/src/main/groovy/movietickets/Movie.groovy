package movietickets

import static movietickets.Day.*

class Movie {
    
    static PRICE_OVERLENGTH = 1.5
    static PRICE_WEEKEND = 1.5
    static PRICE_LOGE = 2.0
    static PRICE_3D = 3.0
    static REBATE_MOVIEDAY = 2.0
    
    def price = 0.0
    def isMovieday
    
    Movie(runtime, day, isParquet, is3D) {
        if (runtime > 120) price += PRICE_OVERLENGTH
        if (day == THURSDAY) {
            price -= REBATE_MOVIEDAY
            isMovieday = true
        }
        if (day in [SATURDAY, SUNDAY]) price += PRICE_WEEKEND
        if (!isParquet) price += PRICE_LOGE
        if (is3D) price += PRICE_3D
    }
    
    def calculate(isGroup) {
        isMovieday && isGroup ? price += REBATE_MOVIEDAY : price
    }
    
}