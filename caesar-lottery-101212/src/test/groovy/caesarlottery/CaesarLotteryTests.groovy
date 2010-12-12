package caesarlottery

import org.junit.Test

class CaesarLotteryTests {
    
    @Test void shouldTransformArabic1ToRomanI() {
        assert new CaesarLottery().convert(1) == "I"
    }

    @Test void shouldTransformArabic2ToRomanII() {
        assert new CaesarLottery().convert(2) == "II"
    }
    
    @Test void shouldTransformArabic3ToRomanIII() {
        assert new CaesarLottery().convert(3) == "III"
    }
    
    @Test void shouldTransformArabic4ToRomanIV() {
        assert new CaesarLottery().convert(4) == "IV"
    }
    
    @Test void shouldTransformArabic5ToRomanV() {
        assert new CaesarLottery().convert(5) == "V"
    }

    @Test void shouldTransformArabic6ToRomanVI() {
        assert new CaesarLottery().convert(6) == "VI"
    }

    @Test void shouldTransformArabic7ToRomanVII() {
        assert new CaesarLottery().convert(7) == "VII"
    }

    @Test void shouldTransformArabic8ToRomanVIII() {
        assert new CaesarLottery().convert(8) == "VIII"
    }

    @Test void shouldTransformArabic9ToRomanIX() {
        assert new CaesarLottery().convert(9) == "IX"
    }

    @Test void shouldTransformArabic10ToRomanX() {
        assert new CaesarLottery().convert(10) == "X"
    }
    
}