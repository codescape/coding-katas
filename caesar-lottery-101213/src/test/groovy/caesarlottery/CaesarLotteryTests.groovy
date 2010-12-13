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

}