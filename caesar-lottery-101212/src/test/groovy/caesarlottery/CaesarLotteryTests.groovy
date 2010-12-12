package caesarlottery

import org.junit.Test

class CaesarLotteryTests {
    
    @Test
    void int1shouldreturnI() {
        assert new CaesarLottery().convert(1) == "I"
    }
    
}