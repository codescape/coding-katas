RomanCalculatorPlusTestCase = new TestCase("RomanCalculator.plus(..)", {

    testOnePlusOne: function() {
        assertEquals("II", RomanCalculator.plus("I","I"));
    },

    testOnePlusTwo: function() {
        assertEquals("III", RomanCalculator.plus("I","II"));
    },

    testTwoPlusTwo: function() {
        assertEquals("IV", RomanCalculator.plus("II", "II"));
    },

    testTwoPlusThree: function() {
        assertEquals("V", RomanCalculator.plus("II", "III"));
    },

    testThreePlusThree: function() {
        assertEquals("VI", RomanCalculator.plus("III", "III"));
    },

    testFourPlusFive: function() {
        assertEquals("IX", RomanCalculator.plus("IV", "V"));
    }

});

RomanCalculatorToArabicTestCase = new TestCase("RomanCalculator.toArabic(..)", {

    testOne: function() {
        assertEquals(1, RomanCalculator.toArabic("I"));
    },

    testTwo: function() {
        assertEquals(2, RomanCalculator.toArabic("II"));
    },

    testThree: function() {
        assertEquals(3, RomanCalculator.toArabic("III"));
    },

    testFour: function() {
        assertEquals(4, RomanCalculator.toArabic("IV"));
    }

});

RomanCalculatorToRomanTestCase = new TestCase("RomanCalculator.toRoman(..)", {

    testOne: function() {
        assertEquals("I", RomanCalculator.toRoman(1));
    },

    testTwo: function() {
        assertEquals("II", RomanCalculator.toRoman(2));
    },

    testThree: function() {
        assertEquals("III", RomanCalculator.toRoman(3));
    },

    testFour: function() {
        assertEquals("IV", RomanCalculator.toRoman(4));
    },

    testFive: function() {
        assertEquals("V", RomanCalculator.toRoman(5));
    }

});
