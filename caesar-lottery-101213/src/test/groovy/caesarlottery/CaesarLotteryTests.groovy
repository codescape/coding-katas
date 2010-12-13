package caesarlottery

import org.junit.Test

class CaesarLotteryTests {

	@Test void convertArabic1ToRomanI() {
		assert new CaesarLottery().convert(1) == "I"
	}

}