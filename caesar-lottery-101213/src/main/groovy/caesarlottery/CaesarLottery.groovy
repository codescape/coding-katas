package caesarlottery

class CaesarLottery {
	
	String convert(arabic) {
		def result = ""
		[50: "L", 40: "XL", 10: "X", 9: "IX", 5: "V", 4: "IV", 1: "I"].each { key, value ->
			while (arabic >= key) {
				result += value
				arabic -= key
			}
		}
		result
	}

}
