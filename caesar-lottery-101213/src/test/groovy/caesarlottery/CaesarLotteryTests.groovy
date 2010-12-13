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

}