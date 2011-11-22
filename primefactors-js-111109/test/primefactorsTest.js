PrimeFactorsTestCase = new TestCase("Prime Factors", {

    testForOne: function() {
        assertEquals([], PrimeFactors.generate(1));
    },

    testForTwo: function() {
        assertEquals([2], PrimeFactors.generate(2));
    },

    testForThree: function() {
        assertEquals([3], PrimeFactors.generate(3));
    },

    testForFour: function() {
        assertEquals([2,2], PrimeFactors.generate(4));
    },

    testForFive: function() {
        assertEquals([5], PrimeFactors.generate(5));
    },

    testForSix: function() {
        assertEquals([2,3], PrimeFactors.generate(6));
    },

    testForSeven: function() {
        assertEquals([7], PrimeFactors.generate(7));
    },

    testForEight: function() {
        assertEquals([2,2,2], PrimeFactors.generate(8));
    },

    testForNine: function() {
        assertEquals([3,3], PrimeFactors.generate(9));
    },

    testForTen: function() {
        assertEquals([2,5], PrimeFactors.generate(10));
    },

    testForTwoHundredEightyEight: function() {
        assertEquals([2,2,2,2,2,3,3], PrimeFactors.generate(288));
    }

});