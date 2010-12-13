package caesarlottery

import org.junit.Test

class CaesarLotteryTests {

    def conversions = [1: "I", 2: "II", 3: "III", 4: "IV", 5: "V", 6: "VI", 7: "VII", 8: "VIII", 9: "IX", 10: "X", 11: "XI", 12: "XII", 13: "XIII", 14: "XIV", 15: "XV"]

    @Test
    void convertArabinNumeralsInRomanNumerals() {
        conversions.each { key, value ->
            assert new CaesarLottery().convert(key) == value
        }
    }

}