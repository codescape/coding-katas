package caesarlottery

class CaesarLottery {
    
    /**
     * Convert an Arabic numeral to Roman numeral.
     *
     * @param number    an Arabic numeral
     * @return          the Roman numeral equivalent to the Arabic numeral
     */
    String convert (int number) {
        def result = ""
        [50: "L", 40: "XL", 10: "X", 9: "IX", 5: "V", 4: "IV", 1: "I"].each { arabic, roman ->
            while (number - arabic >= 0) {
                result += roman
                number -= arabic
            }
        }
        result
    }
    
}