```groovy
class MyClass {
    def myMethod(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be non-negative")
        }
        return x * 2
    }
}

// Example of how to use the method:
MyClass myInstance = new MyClass()
println myInstance.myMethod(5) // Output: 10

// Example of how the exception is handled:
try {
    println myInstance.myMethod(-5)
} catch (IllegalArgumentException e) {
    println "Caught exception: "+ e.message
}
```