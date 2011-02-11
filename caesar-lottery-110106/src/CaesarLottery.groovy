
class CaesarLottery {

  def static final basicRomanSymbols = [1: "I", 5: "V", 10: "X", 50: "L", 100: "C"]
  def static romanSymbols = [:]

  static {
    romanSymbols << basicRomanSymbols
    [10,100].each { number ->
      romanSymbols << [(number/2-number/10): basicRomanSymbols.get(number/10 as int) + basicRomanSymbols.get(number/2 as int)]
      romanSymbols << [(number-number/10): basicRomanSymbols.get(number/10 as int) + basicRomanSymbols.get(number as int)]
    }
    println romanSymbols
  }

  String convert(int arabic) {
    def roman = new StringBuilder()

        def romanKeys = romanSymbols.keySet().sort {romanSymbols[it]}.reverse()


    roman
  }

}
