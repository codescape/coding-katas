
class CaesarLottery {

  String convert(int arabic) {
    def roman = new StringBuilder()
    arabic.times { roman << "I" }
    roman
  }

}
