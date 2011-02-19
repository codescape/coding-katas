package fizzbuzz

class FizzBuzz {
    
    static tell(number) {
        number % 15 == 0 ? "fizzbuzz" : number % 3 == 0 ? "fizz" : number % 5 == 0 ? "buzz" : number
    }
    
}
