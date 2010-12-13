package caesarlottery

class CaesarLottery {
	
	String convert(arabic) {
		def result = ""
		[5: "V", 4: "IV", 3: "III", 2: "II", 1: "I"].each { key, value ->
			if (arabic >= key) {
				result += value
				arabic -= key
			}
		}
		result
	}

}
