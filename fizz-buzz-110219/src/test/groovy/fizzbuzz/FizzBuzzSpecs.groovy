package fizzbuzz

import spock.lang.Specification

/**
 * Rules for FizzBuzz:
 * Any number divisible by three is replaced by the word fizz. 
 * Any number divisible by five is replaced by the word buzz.
 * Numbers divisible by both become fizzbuzz.
 */
class FizzBuzzSpecs extends Specification {
    
    static final max = 100
    static final divisibleByThree = (1..max).findAll { it % 3 == 0 }
    static final divisibleByFive = (1..max).findAll { it % 5 == 0 }
    
    def "numbers divisible by 3 but not divisible by 5 become the word fizz"() {
        expect:
        FizzBuzz.tell(number) == "fizz"
        
        where:
        number << divisibleByThree - divisibleByFive
    }
    
    def "numbers divisible by 5 but not divisible by 3 become the word buzz"() {
        expect:
        FizzBuzz.tell(number) == "buzz"
        
        where:
        number << divisibleByFive - divisibleByThree
    }

    def "numbers divisible by 3 and 5 become the word fizzbuzz"() {
        expect:
        FizzBuzz.tell(number) == "fizzbuzz"
        
        where:
        number << divisibleByThree.intersect(divisibleByFive)
    }
    
    def "other numbers should stay as they are"() {
        expect:
        FizzBuzz.tell(number) == number
        
        where:
        number << (1..max) - divisibleByThree - divisibleByFive
    }
    
}