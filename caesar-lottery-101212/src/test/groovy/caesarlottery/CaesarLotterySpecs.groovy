package caesarlottery

import spock.lang.Specification

class CaesarLotterySpecs extends Specification {
    
    def "conversion of Arabian numbers into Roman numbers"() {
        when:
        def result = new CaesarLottery().convert(arabian)
        
        then:
        result == roman
        
        where:
        arabian | roman
        1  | "I"
        2  | "II"
        3  | "III"
        4  | "IV"
        5  | "V"
        6  | "VI"
        7  | "VII"
        8  | "VIII"
        9  | "IX"
        10 | "X"
    }
    
}