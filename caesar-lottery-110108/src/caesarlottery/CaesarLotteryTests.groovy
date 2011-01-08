package caesarlottery

import org.junit.Test
import caesarlottery.CaesarLottery

class CaesarLotteryTests {

  @Test
  void "Roman numbers with single symbol translate"() {
    assert CaesarLottery.convert(1) == "I"
    assert CaesarLottery.convert(5) == "V"
    assert CaesarLottery.convert(10) == "X"
    assert CaesarLottery.convert(50) == "L"
    assert CaesarLottery.convert(100) == "C"
  }

  @Test
  void "Roman numbers with combined symbols translate"() {
    assert CaesarLottery.convert(4) == "IV"
    assert CaesarLottery.convert(9) == "IX"
    assert CaesarLottery.convert(40) == "XL"
    assert CaesarLottery.convert(90) == "XC"
  }

  @Test
  void "Roman numbers chosen nearly randomly :) translate"() {
    assert CaesarLottery.convert(2) == "II"
    assert CaesarLottery.convert(3) == "III"
    assert CaesarLottery.convert(6) == "VI"
    assert CaesarLottery.convert(7) == "VII"
    assert CaesarLottery.convert(8) == "VIII"
    assert CaesarLottery.convert(42) == "XLII"
    assert CaesarLottery.convert(99) == "XCIX"
  }


}
