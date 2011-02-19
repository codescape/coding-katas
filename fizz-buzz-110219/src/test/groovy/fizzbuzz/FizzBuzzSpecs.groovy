package fizzbuzz

import spock.lang.Specification

/**
 * Rules for FizzBuzz:
 * Any number divisible by three is replaced by the word fizz. 
 * Any number divisible by five is replaced by the word buzz.
 * Numbers divisible by both become fizzbuzz.
 */
class FizzBuzzSpecs extends Specification {
    
    def "numbers divisible by 3 but not divisible by 5 become the word fizz"() {
        expect:
        FizzBuzz.tell(number) == "fizz"
        
        where:
        number << [3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99]
    }
    
    def "numbers divisible by 5 but not divisible by 3 become the word buzz"() {
        expect:
        FizzBuzz.tell(number) == "buzz"
        
        where:
        number << [5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100]
    }
    
}