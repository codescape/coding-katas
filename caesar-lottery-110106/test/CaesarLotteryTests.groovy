import org.junit.Test

class CaesarLotteryTests {

  @Test
  void "Convert Arabic numeral 1 to Roman numeral I"() {
    assert new CaesarLottery().convert(1) == "I"
  }

  @Test
  void "Convert Arabic numeral 2 to Roman numeral II"() {
    assert new CaesarLottery().convert(2) == "II"
  }

  @Test
  void "Convert Arabic numeral 3 to Roman numeral III"() {
    assert new CaesarLottery().convert(3) == "III"
  }

  @Test
  void "Convert Arabic numeral 4 to Roman numeral IV"() {
    assert new CaesarLottery().convert(4) == "IV"
  }

}
