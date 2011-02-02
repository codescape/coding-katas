package caesarlottery

class CaesarLottery {

  static ROMAN_SYMBOLS = [1: "I", 4: "IV", 5: "V", 9: "IX", 10: "X", 40: "XL", 50: "L", 90: "XC", 100: "C"]

  static convert(int arabic) {
    ROMAN_SYMBOLS[arabic] ?: ROMAN_SYMBOLS[nextSmaller(arabic)] + convert(arabic - nextSmaller(arabic))
  }

  private static nextSmaller(int arabic) {
    ROMAN_SYMBOLS.keySet().findAll { it < arabic }.max()
  }

}
