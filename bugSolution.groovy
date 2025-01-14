```groovy
class MyClass {
    def myMethod(int x) {
        if (x < 0) {
            return 0 // Or handle it in a more appropriate way for your application
        }
        return x * 2
    }
}

MyClass myInstance = new MyClass()
println myInstance.myMethod(5) // Output: 10
println myInstance.myMethod(-5) // Output: 0 (or a different default/error handling)
```