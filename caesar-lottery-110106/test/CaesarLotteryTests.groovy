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

}
