package fizzbuzz

class FizzBuzz {
    
    static def tell(number) {
        number % 3 == 0 ? "fizz" : number % 5 == 0 ? "buzz" : number
    }
    
}