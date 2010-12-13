package caesarlottery

class CaesarLottery {
	
	String convert(arabic) {
		if (arabic == 4) "IV" 
		else {
			String result = ""
			arabic.times { result += "I" }
			result
		}
	}

}
