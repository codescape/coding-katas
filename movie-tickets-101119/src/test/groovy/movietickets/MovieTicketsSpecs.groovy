package movietickets

import static movietickets.Day.*
import spock.lang.Specification

class MovieTicketsSpecs extends Specification {
    
    def "combinations for a single adult should evaluate correctly"() {
        given:
        def tickets = new MovieTickets()
        
        when:
        tickets.startPurchase runtime, day, parquet, is3D
        tickets.addTicket 21, false
        
        then:
        assert tickets.finishPurchase() == price
        
        where:
        runtime | day      | parquet | is3D  | price
        // overtime tests
        120     | MONDAY   | true    | false | 11.00
        121     | MONDAY   | true    | false | 12.50
        // movie day tests
        120     | THURSDAY | true    | false |  9.00
        // weekend tests
        120     | SATURDAY | true    | false | 12.50
        120     | SUNDAY   | true    | false | 12.50
        // parquet/loge tests
        120     | MONDAY   | false   | false | 13.00
        // 3d movie tests
        120     | MONDAY   | true    | true  | 14.00
        // most expensive combination
        121     | SUNDAY   | false   | true  | 19.00
        // mixed rebate and additional costs
        121     | THURSDAY | true    | false | 10.50
    }
    
}