RomanCalculator = {};

RomanCalculator.letters = function() {
    return [
        ["I", 1],
        ["IV", 4],
        ["V", 5],
        ["IX", 9]
    ];
}

RomanCalculator.toRoman = function(arabic) {
    if (arabic > 0)
        for (var pos = this.letters().length - 1; pos >= 0; pos--) {
            if (arabic >= this.letters()[pos][1]) {
                return this.letters()[pos][0] + this.toRoman(arabic - this.letters()[pos][1]);
            }
        }
    else return "";
}

RomanCalculator.toArabic = function(roman) {
    if (roman.length > 0)
        for (var pos = this.letters().length - 1; pos >= 0; pos--) {
            if (roman.indexOf(this.letters()[pos][0]) === 0) {
                return this.letters()[pos][1] + this.toArabic(roman.substr(this.letters()[pos][0].length));
            }
        }
    else return 0;
}

RomanCalculator.plus = function(first, second) {
    return this.toRoman(this.toArabic(first) + this.toArabic(second));
}
