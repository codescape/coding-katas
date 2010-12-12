package caesarlottery

import org.junit.Test

class CaesarLotteryTests {
    
    @Test void shouldTransformArabian1ToRomanI() {
        assert new CaesarLottery().convert(1) == "I"
    }

    @Test void shouldTransformArabian2ToRomanII() {
        assert new CaesarLottery().convert(2) == "II"
    }
    
    @Test void shouldTransformArabian3ToRomanIII() {
        assert new CaesarLottery().convert(3) == "III"
    }
    
    @Test void shouldTransformArabian4ToRomanIV() {
        assert new CaesarLottery().convert(4) == "IV"
    }
    
    @Test void shouldTransformArabian5ToRomanV() {
        assert new CaesarLottery().convert(5) == "V"
    }

    @Test void shouldTransformArabian6ToRomanVI() {
        assert new CaesarLottery().convert(6) == "VI"
    }

    @Test void shouldTransformArabian7ToRomanVII() {
        assert new CaesarLottery().convert(7) == "VII"
    }

    @Test void shouldTransformArabian8ToRomanVIII() {
        assert new CaesarLottery().convert(8) == "VIII"
    }

    @Test void shouldTransformArabian9ToRomanIX() {
        assert new CaesarLottery().convert(9) == "IX"
    }

    @Test void shouldTransformArabian10ToRomanX() {
        assert new CaesarLottery().convert(10) == "X"
    }
    
}