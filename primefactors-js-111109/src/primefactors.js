PrimeFactors = {};

PrimeFactors.generate = function(number) {
    var factors = [];
    for (var factor = 2; number > 1; factor++) {
        for (;number % factor === 0; number /= factor) {
            factors.push(factor);
        }
    }
    return factors;
}