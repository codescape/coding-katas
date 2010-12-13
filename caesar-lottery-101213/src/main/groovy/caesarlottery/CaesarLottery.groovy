package caesarlottery

class CaesarLottery {
	
	String convert(arabic) {
		def result = ""
		[5: "V", 4: "IV", 1: "I"].each { key, value ->
			while (arabic >= key) {
				result += value
				arabic -= key
			}
		}
		result
	}

}
