package caesarlottery

import org.junit.Test

class CaesarLotteryTests {

	@Test void convertArabic1ToRomanI() {
		assert new CaesarLottery().convert(1) == "I"
	}

	@Test void convertArabic2ToRomanII() {
		assert new CaesarLottery().convert(2) == "II"
	}
	
	@Test void convertArabic3ToRomanIII() {
		assert new CaesarLottery().convert(3) == "III"
	}

	@Test void convertArabic4ToRomanIV() {
		assert new CaesarLottery().convert(4) == "IV"
	}

	@Test void convertArabic5ToRomanV() {
		assert new CaesarLottery().convert(5) == "V"
	}

	@Test void convertArabic6ToRomanVI() {
		assert new CaesarLottery().convert(6) == "VI"
	}
	
	@Test void convertArabic7ToRomanVII() {
		assert new CaesarLottery().convert(7) == "VII"
	}

	@Test void convertArabic8ToRomanVIII() {
		assert new CaesarLottery().convert(8) == "VIII"
	}

	@Test void convertArabic9ToRomanIX() {
		assert new CaesarLottery().convert(9) == "IX"
	}

	@Test void convertArabic10ToRomanX() {
		assert new CaesarLottery().convert(10) == "X"
	}

	@Test void convertArabic11ToRomanXI() {
		assert new CaesarLottery().convert(11) == "XI"
	}

	@Test void convertArabic12ToRomanXII() {
		assert new CaesarLottery().convert(12) == "XII"
	}
	
	@Test void convertArabic13ToRomanXIII() {
		assert new CaesarLottery().convert(13) == "XIII"
	}
	
	@Test void convertArabic14ToRomanXIV() {
		assert new CaesarLottery().convert(14) == "XIV"
	}
	
	@Test void convertArabic15ToRomanXV() {
		assert new CaesarLottery().convert(15) == "XV"
	}

	@Test void convertArabic15ToRomanXV() {
		assert new CaesarLottery().convert(15) == "XV"
	}

}