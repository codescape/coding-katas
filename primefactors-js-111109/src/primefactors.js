PrimeFactors = {};

PrimeFactors.generate = function(number) {
    var factors = [];

    for (var factor = 2; number >= factor * factor; factor++) {
        for (;number % factor === 0; number /= factor) {
            factors.push(factor);
        }
    }
    if (number > 1) {
        factors.push(number);
    }

    return factors;
}